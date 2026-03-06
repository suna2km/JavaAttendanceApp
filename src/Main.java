public class Main {
    public static void main(String[] args) {
        /*try {
            Student s2 = new Student(-1);
            System.out.println(s2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Student s3 = new Student(1, "");
            System.out.println(s3);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Student s4 = new Student(1, "Ben");
            System.out.println(s4);
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




    } //end of main

    }*/
        try {
            Course c1 = new Course();
            c1.setName("Section 9");
            System.out.println(c1);

            c1.addStudent("Bob", 1);
            c1.addStudent("Sue", 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

