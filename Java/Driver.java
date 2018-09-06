import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;


public class Driver {

    public void studentConsumer(ArrayList<Student> S,Consumer<Student> studentCon){
        System.out.println("Student Details are ");
        System.out.println("\n");
        for(int i = 0  ;i<S.size() ; i++){
            studentCon.accept(S.get(i));
        }
    }

    public static void main(String[] args) {
        /*
            Student St1 = new Student("Rajiv","25","watermelon",146,54);
            Student St2 = new Student("Mohan","27","Banana",148,64);
        */
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the no. of students details to be entered");
        int n = sc.nextInt() ;
        ArrayList<Student> S = new ArrayList<>() ;
        System.out.println("Enter Student Details");
        for(int i = 0  ;i<n ; i++){
            String name, rollNumber, favoriteFruit;
            System.out.print("Enter Name : ");
            name = sc.next() ;
            System.out.print("Enter Roll No : ");
            rollNumber = sc.next();
            System.out.print("Enter Favourite Fruit : ");
            favoriteFruit = sc.next() ;
            float height, weight;
            System.out.println("Enter Height : ");
            height = sc.nextFloat() ;
            System.out.println("Enter Weight : ");
            weight = sc.nextFloat() ;
            System.out.println("\n");
            S.add(new Student(name,rollNumber,favoriteFruit,height,weight));         
        }
        
        sc.close() ;

        //Consumer<Student> cons ;
        Driver D = new Driver();
        D.studentConsumer(S, (s) -> {
    
                System.out.println("Name : " + s.getName());
                System.out.println("Roll No. : " + s.getRollNo());
                System.out.println("Favourite Fruit : " + s.getFavouriteFruit());
                System.out.println("Height : " + s.getHeight());
                System.out.println("Weight : " + s.getWeight());
                System.out.println("...........................................................");
        } ) ;

        /*
            System.out.println("Name : " + St1.getName() + " Favourite Fruit: " + St1.getFavouriteFruit());
            System.out.println("Name : " + St2.getName() + " Favourite Fruit: " + St2.getFavouriteFruit()); 
        */
    }
}