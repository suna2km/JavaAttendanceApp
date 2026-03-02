public class Main {
    public static void main(String[] args){
        try {
            Student s1 = new Student();
            System.out.println(s1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Student s2 = new Student(-1);
            System.out.println(s2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Student s2 = new Student(1,"");
            System.out.println(s2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Student s3 = new Student(1, "Ben");
            System.out.println(s3);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }







    }
}