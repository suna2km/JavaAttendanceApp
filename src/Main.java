public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student(1);
        Student s3 = new Student(1, "Ben");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}