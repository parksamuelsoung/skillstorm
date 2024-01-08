package Monday;

public class StudentTest {
    
    public static void main(String[] args) {

        Student student1 = new Student("John", "Heimer");
        Student student2 = new Student("Jacob", "Schmidt");
        Student student3 = new Student("Jacob", "Schmidt");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(student2.equals(student3));

    }
}
