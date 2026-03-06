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
    public void addStudent(String name, int seat) throws Exception {
        Student student = getStudent(seat);
        if(student == null) {
            allStudents.add(new Student(seat, name));
        } else {
            throw new Exception("Seat #" + seat + " already assigned to " + student.getName() + "!");
        }
    }
    public void displaySummaryReport() {
        int totalOnTime = 0;
        int totalLate = 0;
        int totalExcused = 0;
        int totalUnexcused = 0;

        for (Student student : students) {
            if (student != null) {
                totalOnTime += student.getOnTime();
                totalLate += student.getLate();
                totalExcused += student.getExcused();
                totalUnexcused += student.getUnexcused();
            }
        }

        System.out.printf("%s OnTime=%d Late=%d Excused=%d Unexcused=%d%n",
                name, totalOnTime, totalLate, totalExcused, totalUnexcused);
    }

    /**
     * Displays a detailed attendance report for all students in the course.
     */
    public void displayDetailReport() {
        displaySummaryReport(); // Print header

        System.out.println("Seat   Name            OnTime Late Excused Unexcused");
        System.out.println("==== =============== ====== ==== ======= =========");

        for (Student student : students) {
            if (student != null) {
                System.out.printf("%4d %-15s %6d %4d %7d %9d%n",
                        student.getSeat(),
                        student.getName(),
                        student.getOnTime(),
                        student.getLate(),
                        student.getExcused(),
                        student.getUnexcused());
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return name;
    }
}
