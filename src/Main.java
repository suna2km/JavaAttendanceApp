public class Main {
    public static void main(String[] args){
        // test invalid jersey
        try {
            Student s1 = new Student(-1);
            System.out.println(s1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //test invalid name
        try {
            Student s2 = new Student(1, "");
            System.out.println(s2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //test a valid student
        try{
            Student s3 = new Student(1, "Ben");
            System.out.println(s3);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        // test update attendance
        try{
            Student s4 = new Student(1, "Ben");
            s4.updateAttendance(1);
            s4.updateAttendance(1);
            s4.updateAttendance(2);
            s4.updateAttendance(2);
            s4.updateAttendance(3);
            s4.updateAttendance(4);

            s4.displayAttendance();
            //s4.updateAttendance(5);

            Student s5 = new Student(1, "Ben");
            System.out.println(s4.equals(s5));
            System.out.println(s4 == s5);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    }
