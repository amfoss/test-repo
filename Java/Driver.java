import java.util.*;
import java.util.function.Consumer;

public class Driver {
	public static void main(String[]args){
       
         ArrayList<Student> list = new ArrayList<Student>();
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of students: ");
         int n = scan.nextInt();
         
         for(int i = 0 ; i < n ; i++) {
         scan.nextLine();
         
         String name = scan.nextLine();
         
         String rollNumber = scan.nextLine();
         
         String favoriteFruit = scan.nextLine();
         
         float height = scan.nextFloat();
         
         float weight = scan.nextFloat();

         System.out.println();
         list.add(new Student(name,,favoriteFruit,height,weight));
         }
         Driver obj = new Driver();
         d.studentConsumer(list, (student)-> {
             String s = student.getName();
             System.out.println("The Name of the Student is "+s);
             System.out.println("The Roll number of the Student is "+student.getrollNumber());
             System.out.println("The Favourite Fruit of the Student is "+student.getFavoritefruit());
             System.out.println("The Height of the Student is "+student.getHeight());
             System.out.println("The weight of the student is "+student.getWeight());
            
             System.out.println();
         });
    }
    public void studentConsumer(ArrayList<Student> list,Consumer<Student> consumer){
    
        for(Student i:list){
            consumer.accept(i);
        }
        
    }
}