
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class driver {
	public static void main(String[]args){
       
        ArrayList<Student> arraylist=new ArrayList<Student>();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of students in the list:");
         int n=sc.nextInt();
         
         for(int i=0;i<n;i++) {
        	 sc.nextLine();
         System.out.print("Enter the Name:");
         String name=sc.nextLine();
         System.out.print("Enter the rollno:");
         String rollno=sc.nextLine();
         System.out.print("Enter the favorite fruit:");
         String fruitname=sc.nextLine();
         System.out.print("Enter the  height:");
         float height=sc.nextFloat();
         System.out.print("Enter the weight:");
         float weight=sc.nextFloat();
         System.out.println();
         arraylist.add(new Student(name,rollno,fruitname,height,weight));
         }
         driver d=new driver();
         d.studentConsumer(arraylist, (student)->{
             String s=student.getName();
             System.out.println("The Name of the Student is "+s);
             System.out.println("The Roll number of the Student is "+student.getrollno());
             System.out.println("The Favourtie Fruit of the Student is "+student.getfrutiname());
             System.out.println("The Height of the Student is "+student.getHeight());
             System.out.println("The weight of the student is "+student.getWeight());
             System.out.println("...................");
             System.out.println();
         });

    }
    public void studentConsumer(ArrayList<Student> arraylist,Consumer<Student> consumer){
    
        for(Student i:arraylist){
            consumer.accept(i);
        }
        
    }

}
