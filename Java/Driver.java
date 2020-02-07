import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.print();
        student1.setFavoriteFruit("Papaya");
        student1.setName("Sai");
        student1.print();
        student1.setHeight(100);
        System.out.println("Name: " + student1.getName() + ", Height: " + student1.getHeight());

        System.out.println();
        Student student2 = new Student("Raj", "17306", "Apple", 50, 60);
        student2.print();
        student2.setFavoriteFruit("Grapes");
        student2.setName("Harshith");
        student2.print();
        student2.setHeight(1000);
        System.out.println("Name: " + student1.getName() + ", Height: " + student1.getHeight());

        System.out.println();
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of List");
        int n = scan.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for(int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Student " + (i+1));
            scan.nextLine();
            Student student = new Student();
            System.out.println("Enter name");
            student.setName(scan.nextLine());
            System.out.println("Enter roll number");
            student.setRollNumber(scan.nextLine());
            System.out.println("Enter favorite fruit");
            student.setFavoriteFruit(scan.nextLine());
            System.out.println("Enter height");
            student.setHeight(scan.nextFloat());
            System.out.println("Enter weight");
            student.setWeight(scan.nextFloat());

            students.add(student);
        }
        scan.close();

        Driver studentConsumer = new Driver();
        studentConsumer.studentConsumer(students, i -> {
            System.out.println();
            i.print();
        });
    }

    public void studentConsumer(ArrayList<Student> students, Consumer<Student> studentsConsumer) {
        for(Student s: students) {
            studentsConsumer.accept(s);
        }
    }
}