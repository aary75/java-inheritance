// Creating the SchoolSystem class to show the roles of different persons
import java.util.Scanner;

// Person - superclass
abstract class Person{
   
    // Attributes
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age){
         this.name = name;
         this.age = age;
   }

     public abstract void displayDetails();

}

// Teacher - subclass
class Teacher extends Person{
      
     protected String subject;

     // Constructor
     public Teacher(String name, int age, String subject){
         super(name, age);
         this.subject = subject;
     }

     // Displaying person details
     public void displayDetails(){
          System.out.println("This person is a teacher");
          System.out.println("Name: " + name);
          System.out.println("Age:" + age);
          System.out.println("Subject which he/she teach: " + subject);
     }
}

// Student - subclasss
class Student extends Person{
       
     protected double grade;
 
     // Constructor
     public Student(String name, int age, double grade){
          super(name, age);
          this.grade = grade;
     }

     // Display the person details
     public void displayDetails(){
         System.out.println("This person is a student");
          System.out.println("Name: " + name);
          System.out.println("Age:" + age);
         System.out.println("Grade: " + grade);
     }
}

// Staff - subclass
class Staff extends Person{
  
    protected int salary;
   
   //Constructor
    public Staff(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }
    
    // Display the person details
    public void displayDetails(){
        System.out.println("This account is a staff member");
         System.out.println("Name: " + name);
          System.out.println("Age:" + age);
        System.out.println("Salary: " + salary);
    }
}

// SchoolSystem - Main class
public class SchoolSystem{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

       System.out.print("Do you want to start this program: ");
       String space = scanner.nextLine();

       while(space.equals("true")){
           
           // Enter the type of person
           System.out.print("Enter the type of person you are(Teacher, Student, Staff or leave the program ");
           String type = scanner.nextLine().toLowerCase();

           if(type.equals("leave")){
              System.out.println("Leave the program");
              break;
           }

           // Getting common detals
           System.out.print("Enter the name: ");
           String name = scanner.nextLine();
           

           System.out.print("Enter the age: ");
           int age = scanner.nextInt();
           scanner.nextLine(); // consume new line

           Person person = null; // Ensure initialization

           switch (type){
              
              case "teacher":
                  System.out.print("Subject: ");
                  String subject = scanner.nextLine();
                 
                  person = new Teacher(name, age, subject);
                  break;
              
               case "student":
                  System.out.print("Grade: ");
                  double grade = scanner.nextDouble();
                  scanner.nextLine();
                  person = new Student(name, age, grade);
                  break;

               case "staff":
                  System.out.print("Salary: ");
                  int salary = scanner.nextInt();
                  scanner.nextLine();
                  person = new Staff(name, age, salary);
                  break;
           
               default:
                  System.out.print("Not a valid role");
                  continue;
         }

         // Display person details
         System.out.println("\nPerson Details: ");
         person.displayDetails();
         System.out.println();
     }

        System.out.print("Do you want to continue(true/false): ");
        space = scanner.nextLine().toLowerCase();
        scanner.close(); // close scanner at the end
}
}
 

// Do you want to start this program: true
// Enter the type of person you are(Teacher, Student, Staff or leave the program teacher
// Enter the name: Aaryan
// Enter the age: 23
// Subject: Mathematics

// Person Details:
// This person is a teacher
// Name: Aaryan
// Age:23
// Subject which he/she teach: Mathematics

// Enter the type of person you are(Teacher, Student, Staff or leave the program Student
// Enter the name: Hitesh
// Enter the age: 12
// Grade: 9.8

// Person Details:
// This person is a student
// Name: Hitesh
// Age:12
// Grade: 9.8

// Enter the type of person you are(Teacher, Student, Staff or leave the program Staff
// Enter the name: Smile
// Enter the age: 22
// Salary: 20000

// Person Details:
// This account is a staff member
// Name: Smile
// Age:22
// Salary: 20000

// Enter the type of person you are(Teacher, Student, Staff or leave the program leave
// Leave the program
// Do you want to continue(true/false): false
