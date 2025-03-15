// Creating the class RestaurantManagementSystem to show the roles of people
import java.util.Scanner;

// Person class - Superclass
abstract class Person{

    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id){
       this.name = name;
       this.id = id;
    }

    public abstract void performDuties();
}

// Worker interface
interface Worker{
    public void performDuties();
}

// Chef class - subclass
class Chef extends Person implements Worker{

      public Chef(String name, int id){
          super(name, id);
      }

      public void performDuties(){
           System.out.println("Name: " + name + " and id: " + id);
           System.out.println("This person is a chef here");
           System.out.println("His/Her job is to make delicious dishes");
      }
}

// Waiter class - subclass
class Waiter extends Person implements Worker{

     public Waiter(String name, int id){
         super(name, id);
     }

     public void performDuties(){ 
         System.out.println("Name: " + name + " and id: "+ id);
         System.out.println("This person is a waiter here");
         System.out.println("His/Her job is to serve dishes to customers");
     }
}

// Main class
public class RestaurantManagementSystem{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        System.out.print("Do you want to start this program: ");
       String space = scanner.nextLine();

       while(space.equals("true")){
           
           // Enter the type of role
           System.out.print("Enter the type of account you want(Chef or Waiter) or leave the program ");
           String type = scanner.nextLine().toLowerCase();

           if(type.equals("leave")){
              System.out.println("Leave the program");
              break;
           }

           // Getting common detals
           System.out.print("Enter the name: ");
           String name = scanner.nextLine();

           System.out.print("Enter the id: ");
           int id = scanner.nextInt();
           scanner.nextLine();

           Person person = null; // Ensure initialization

           switch (type){
              
              case "chef":
                  person = new Chef(name, id);
                  break;
              
               case "waiter":
                  person = new Waiter(name, id);
                  break;
           
               default:
                  System.out.print("Not valid account");
                  continue;
         }

         // Display person details
         System.out.println("\nPerson Details: ");
         person.performDuties();
         System.out.println();
     }

        System.out.print("Do you want to continue(true/false): ");
        space = scanner.nextLine().toLowerCase();
        scanner.close(); // close scanner at the end
}
}


// Do you want to start this program: true
/// Enter the type of account you want(Chef or Waiter) or leave the program Chef
// Enter the name: Aaryan
// Enter the id: 1

// Person Details:
// Name: Aaryan and id: 1
// This man is a chef here
// Enter the type of account you want(Chef or Waiter) or leave the program Waiter
// Enter the name: Gill
// Enter the id: 2

// Person Details:
// Name: Gill and id: 2
// This man is a waiter here
// Enter the type of account you want(Chef or Waiter) or leave the program leave
// Leave the program
// Do you want to continue(true/false): false
