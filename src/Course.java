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
    @Override
    public String toString() {
        return name;
    }
}
