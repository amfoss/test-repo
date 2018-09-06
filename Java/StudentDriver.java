import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.function.Consumer;
public class StudentDriver{

	
	public static void printStudent(ArrayList<Student> array, Consumer<Student> consumer){
			for(Student s:array){
	 		consumer.accept(s);
	 	}			
	}

	public static void main(String[] args) {

		ArrayList<Student> array = new ArrayList<>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students: ");
		n = sc.nextInt();
		System.out.println("Enter the Student details: ");
		for(int i=0;i<n;i++){
			String na = sc.nextLine();
			String r = sc.nextLine();
			String ff = sc.nextLine();
			sc.nextLine();
			float h = sc.nextFloat();
			sc.nextLine();
			float w = sc.nextFloat();
			array.add(new Student(na,r,ff,h,w));
		}

		Consumer<Student> consumer = i-> System.out.println(i.getName()+ " " + i.getRollNumber()+ " " + i.getFavoriteFruit()+ " "+ i.getHeight()+ " "+ i.getWeight());



    	printStudent(array, consumer);
 
	 
}
}