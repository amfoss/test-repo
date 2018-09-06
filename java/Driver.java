import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Driver {
	


	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.getName() + " " + s.getRoll() + " " + s.getFruit() + " "
		+ s.getHeight() + " " + s.getWeight());
		
		Student p = new Student("Me","101","Apple", 175,65);
		System.out.println(p.getFruit());
		p.setFruit("Orange");
		System.out.println(p.getFruit());
		Scanner sc = new Scanner(System.in); 
	
		ArrayList<Student> a = new ArrayList<>();
		System.out.println("Input no of students");
		int d = sc.nextInt();
		while(d>0) {
			Student f = new Student();
			f.setName(sc.next());
			f.setRoll(sc.next());
			f.setFruit(sc.next());
			f.setHeight(sc.nextFloat());
			f.setWeight(sc.nextInt());
			
			
			d--;
		}
		sc.close();
		Consumer<Student> cd = i -> System.out.println();;
		studentConsumer(a, cd);	
		}
	   

		public static void studentConsumer(ArrayList<Student> a , Consumer<Student> cd) {
			for(Student i:a) {
			cd.accept(i);
			System.out.println(a);
			
		}
		}
	

}

