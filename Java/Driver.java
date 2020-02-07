import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Driver{
	
	public void studentConsumer(ArrayList<Student> student,Consumer<Student> consumer){
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		
		ArrayList<Student> array = new ArrayList<Student>();
		for(int i =0;i<n;++i) {
			array.add(new Student());
		}
		
	}
}