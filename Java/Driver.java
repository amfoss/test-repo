import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.*;
public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		System.out.println("Enter the number of students: ");
		int n= scan.nextInt();
		Consumer<Student> i = (stud)->System.out.println(stud.getName()+ " " +stud.getrollNumber()+" "+stud.getfavoriteFruit()+" "+stud.getHeight()+" "+stud.getWeight());
		
            while(n>0)
            {
                System.out.print("\n Name: ");
                String name = scan.next();
                System.out.print("Roll: ");
                String roll = scan.next();
                System.out.print("Fruit: ");
                String fruit = scan.next();
                System.out.print("Height");
                float height = scan.nextFloat();
                System.out.println("Weight");
                float weight = scan.nextFloat();
                students.add(new Student(name, roll,fruit,height,weight));
                n=n-1;
		}
		Driver lalala = new Driver();
		lalala.studentConsumer(students, i);
		
	}
	public void studentConsumer(ArrayList<Student> students, Consumer<Student> lalala){
        
			for(Student st: students){
				lalala.accept(st);
			}
			
		}
}
