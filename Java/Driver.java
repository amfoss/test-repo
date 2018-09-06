import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;

public class Driver {
	public void studentConsumer(ArrayList<Student> list,Consumer<Student> consumer) {
		for(Student item : list) {
			consumer.accept(item);
		}
	}
	public static void main(String []args) {
		 ArrayList<Student> al=new ArrayList<Student>();  
		Scanner scan = new Scanner(System.in) ;
		Student[] s= new Student[3];
		
			for(int i=0;i<2;i++) {
			System.out.println("Enter the number of students");
			String name=scan.nextLine();
			String rollNumber = scan.nextLine();
			String favoriteFruit= scan.nextLine();
			float height = scan.nextFloat();
			float weight = scan.nextFloat();
			scan.nextLine();
			s[i]= new Student(name,rollNumber,favoriteFruit,height,weight);
			al.add(s[i]);
			}
			Consumer<Student> consumer = (st) -> System.out.println(st.getName()+" "+st.getRollNumber()+" "+st.getFavouriteFruit()+" "+st.getHeight()+" "+st.getWeight());
			Driver driver = new Driver();
			driver.studentConsumer(al, consumer); 
		
	}
}
