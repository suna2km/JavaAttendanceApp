public class Main {
    public static void main(String[] args){
        // test invalid jersey
        try {
            Student s2 = new Student(-1);
            System.out.println(s2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Student s3 = new Student(1, null);
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
            System.out.println(s4.getOnTime());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    }
