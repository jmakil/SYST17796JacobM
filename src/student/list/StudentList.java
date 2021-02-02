package student.list;
import java.util.Scanner;

/**
 *
 * @author makil
 */
public class StudentList {

 
    public static void main(String[] args) {
     String[] students = new String [5];
     Scanner a = new Scanner(System.in);
     
     System.out.println("Please Enter the name of the 5 students in the class: ");
     for (int i=0;i<students.length;i++ ){
      students[i] = a.nextLine();
     }
     System.out.println("The name of the students are: ");
     for (String name: students){
         System.out.println(name);
     }
     System.out.println("Thank you, see you again!);
    }
    
}
