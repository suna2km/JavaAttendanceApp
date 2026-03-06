import java.util.ArrayList;
import java.util.List;
/**
 * The Course class keeps track of students and attendance
 * @author Sanyam + Suna
 * @version 1.0
 * @since 2026.03.06
 */
public class Course {
    /** The name of the course */
    private String name;
    /** Array of students enrolled in the course, indexed by seat number */
    private final List<Student> allStudents;
    /**
     * Constructs a new Course with a default name of { "unknown"}
     * and an empty student list.
     */
    public Course(){
        name = "unknown";
        allStudents = new ArrayList<>();
    }
    /**
     * Sets the name of the course after trimming whitespace.
     *
     * @param name the desired course name; must not be blank after trimming
     * @throws Exception if the trimmed name is blank
     */
    public void setName(String name) throws Exception {
        name = name.trim();

        if (name.isBlank())
            throw new Exception("Student name cannot be Blank");
        this.name = name;
    }
    /**
     * Returns the name of the course.
     *
     * @return the course name
     */
    public String getName() {
        return name;
    }
    /**
     * Retrieves the student assigned to the given seat number.
     *
     * @param seat the seat number to look up
     * @return the {Student} occupying the seat, or {null} if no student is found
     * @throws Exception if an error occurs while constructing the lookup student
     */
    public Student getStudent(int seat) throws Exception {
        int index = allStudents.indexOf(new Student(seat));

        if (index == -1)
            return null;
        else
            return allStudents.get(index);
    }
    /**
     * Enrolls a new student in the course at the specified seat.
     *
     * @param seat the seat number to assign to the student
     * @param name the name of the student to enroll
     * @throws Exception if the seat is already occupied by another student
     */
    public void addStudent(int seat, String name) throws Exception {
        Student student = getStudent(seat);
        if(student == null) {
            allStudents.add(new Student(seat, name));
        } else {
            throw new Exception("Seat #" + seat + " already assigned to " + student.getName() + "!");
        }
    }

    /**
     * Returns the total number of on-time arrivals across all enrolled students.
     *
     * @return the sum of on-time attendance counts for all students
     */
    public int getOntime() {
        int totalOntime = 0;
        for (Student student : allStudents) {
            totalOntime += student.getOntime();
        }
        return totalOntime;
    }
    /**
     * Returns the total number of late arrivals across all enrolled students.
     *
     * @return the sum of late attendance counts for all students
     */
    public int getLate() {
        int totalLate = 0;
        for (Student student : allStudents) {
            totalLate += student.getLate();
        }
        return totalLate;
    }
    /**
     * Returns the total number of excused absences across all enrolled students.
     *
     * @return the sum of excused absence counts for all students
     */
    public int getExcused() {
        int totalExcused = 0;
        for (Student student : allStudents) {
            totalExcused += student.getExcused();
        }
        return totalExcused;
    }
    /**
     * Returns the total number of unexcused absences across all enrolled students.
     *
     * @return the sum of unexcused absence counts for all students
     */
    public int getUnexcused() {
        int totalUnexcused = 0;

        for (Student student : allStudents) {
            totalUnexcused += student.getUnexcused();
        }

        return totalUnexcused;
    }
    /**
     * Prints a one-line attendance summary for the course to standard output,
     * showing the course name followed by total on-time, late, excused,
     * and unexcused counts.
     */

    public void displaySummary() {
        System.out.println( name + " Ontime=" + getOntime() + " Late=" + getLate() + " Excused=" + getExcused() + " Unexcused=" + getUnexcused());
    }
    /**
     * Displays a detailed attendance report for all students in the course.
     */
    public void displayDetailReport() {
        displaySummary(); // Print header

        System.out.println("Seat   Name            OnTime Late Excused Unexcused");
        System.out.println("==== =============== ====== ==== ======= =========");

        for (Student student : allStudents) {

                System.out.printf("%4d %-15s %6d %4d %7d %9d%n",
                        student.getSeat(),
                        student.getName(),
                        student.getOntime(),
                        student.getLate(),
                        student.getExcused(),
                        student.getUnexcused());

        }
        System.out.println();
    }
    /**
     * Returns the course name as its string representation.
     *
     * @return the name of the course
     */
    @Override
    public String toString() {
        return name;
    }
}
