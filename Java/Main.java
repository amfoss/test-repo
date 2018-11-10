import java.util.*;
import java.util.function.*;
class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> arr= new ArrayList<Student>();
    Consumer<Student> C=(student)->{
      System.out.println("Name : "+student.getName());
      System.out.println("Roll number : "+student.getrollNumber());
      System.out.println("Favorite fruit : "+student.getfavoriteFruit());
      System.out.println("Height : "+student.getHeight());
      System.out.println("Weight : "+student.getWeight());
    };
    System.out.println("Enter number of students : ");
    int n=sc.nextInt();
    for(int i=0;i<n;++i){
      System.out.println("Enter name : ");
      String tmp=sc.next();
      System.out.println("Enter roll number : ");
      String rn=sc.next();
      System.out.println("Enter favorite fruit : ");
      String ff=sc.next();
      System.out.println("Enter height : ");
      float h=sc.nextFloat();
      System.out.println("Enter weight : ");
      float w=sc.nextFloat();
      arr.add(new Student(tmp,rn,ff,h,w));
    }
    System.out.println();
    System.out.println("Details of Students are => ");
    System.out.println();
    Main M=new Main();
    M.studentConsumer(arr,C);
  }
  public void studentConsumer(ArrayList<Student> arr, Consumer<Student> C){
    int i=1;
    for(Student student : arr){
      System.out.println("Student "+i+":");
    C.accept(student);++i;
    System.out.println();
  }
  }
}
