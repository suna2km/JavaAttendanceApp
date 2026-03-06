import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private final List<Student> allStudents;

    public Course(){
        name = "unknown";
        allStudents = new ArrayList<>();
    }

    public void setName(String name) throws Exception {

        if (name == null || name.isBlank())
            throw new Exception("Student name cannot be Blank");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student getStudent(int seat) throws Exception {
        int index = allStudents.indexOf(new Student(seat));

        if (index == -1)
            return null;
        else
            return allStudents.get(index);
    }
    public void addStudent(int seat, String name) throws Exception {
        Student student = getStudent(seat);
        if(student == null) {
            allStudents.add(new Student(seat, name));
        } else {
            throw new Exception("Seat #" + seat + " already assigned to " + student.getName() + "!");
        }
    }

    public int getOntime() {
        int totalOntime = 0;

        for (Student student : allStudents) {
            totalOntime += student.getOntime();
        }

        return totalOntime;
    }
    public int getLate() {
        int totalLate = 0;

        for (Student student : allStudents) {
            totalLate += student.getLate();
        }

        return totalLate;
    }
    public int getExcused() {
        int totalExcused = 0;

        for (Student student : allStudents) {
            totalExcused += student.getExcused();
        }

        return totalExcused;
    }
    public int getUnexcused() {
        int totalUnexcused = 0;

        for (Student student : allStudents) {
            totalUnexcused += student.getUnexcused();
        }

        return totalUnexcused;
    }

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

    @Override
    public String toString() {
        return name;
    }
}
