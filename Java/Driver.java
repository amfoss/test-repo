import java.util.ArrayList;
import java.util.Scanner;

import java.util.function.Consumer;;

public class Driver {

	public static void main(String [] args) {
		
		Student s = new Student();
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		ArrayList<Student> ar = new ArrayList<Student>();
		for(int j = 0; j < i; j++) {
			System.out.println("input student details");
			sc.nextLine();
			String st =sc.nextLine();
			String r = sc.nextLine();
			String f = sc.nextLine();
			float h = sc.nextFloat();
			float w = sc.nextFloat();
			System.out.println(st);
			ar.add(new Student(st,r,f,h,w));
			
		}
		Driver d = new Driver();
		d.studentConsumer(ar,(st) -> {
			System.out.println("The name of the student is"+st.getName());
			System.out.println("The rollnumber of the student is"+st.getRolNumber());
			System.out.println("The favorite fruit of the student is"+st.getFavoriteFruit());
			System.out.println("The height of the student is"+st.getHeight());
			System.out.println("The weight of the student is"+st.getWeight());
		});
           sc.close();
	}
	
	public void studentConsumer(ArrayList<Student> students,Consumer<Student> con) {
		for(int i= 0;i<students.size();i++ ) {
			con.accept(students.get(i));
		}
	} 
}

