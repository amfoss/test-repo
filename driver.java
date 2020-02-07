package piTest;
import java.util.*;
public class driver {
	public void studentConsumer(ArrayList<String> Student) {
		System.out.println(""+Student);
	}
public static void main (String[] arg) {
	String line="";
	int i=1;
	Scanner sc= new Scanner(System.in);
	ArrayList Student= new ArrayList();
	/*Student.add("hey");
	Student.add("having");
	Student.add("fun");*/
	
	while(i==1) {
    line=sc.next();	
		Student.add(line);	
		System.out.println("to add more enter 1");
		i=sc.nextInt();
		line="";
	}
	driver d=new driver();
	d.studentConsumer(Student);
	
	
}
}
