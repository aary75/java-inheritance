import java.util.Scanner;

// SuperClass: Employee
class Employee{

    protected String name;
    protected int id;
    protected double salary;
    
    public Employee(String name, int id, double salary){
         this.name = name;
         this.id = id;
         this.salary = salary;
    }

    public void displayDetails(){
         System.out.println(name + " with id " + id + " is working in our company on salary " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize){
           super(name, id, salary);
           this.teamSize = teamSize;
    }

    public void uniqueAttribute(){
           System.out.println("Currently " + teamSize + " is working under " + name);
    }
}

// Subclass: Developer
class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage){
       super(name, id, salary);
       this.programmingLanguage = programmingLanguage;
    }

    public void uniqueAttribute() {
          System.out.println(name + " is working in " + programmingLanguage + " language");
    }
}

// Subclass: Intern
class Intern extends Employee{
    public int experience;

    public Intern(String name, int id, double salary, int experience){
         super(name, id, salary);
         this.experience = experience;
    }

    public void uniqueAttribute(){
          System.out.println(name + "has " + experience + " years of experience");
    }
}

// Main class
public class EmployeeDetails{
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       
       String roles = scanner.nextLine().toLowerCase();

       while(roles.equals("true")) {
          // Asking user for input
          System.out.println("Enter type of role we have (manager, developer, intern)or  want to leave the program.");
          String job = scanner.nextLine().toLowerCase();

          if(job.equals("leave")){
              System.out.print("Leave this program");
              break; // Stop the loop
          }

          // Getting common details
          System.out.print("Enter the employee ID: ");
          int id = scanner.nextInt();
          scanner.nextLine();  // consume newLine

          System.out.print("Enter employee name: ");
          String name = scanner.nextLine();

          System.out.print("Enter salary: ");
          double salary = scanner.nextDouble();
          scanner.nextLine(); // consume new line

          Employee employee;

          // Creating objects based on user input
          switch (job){
            case "manager":
                System.out.print("Enter Team Size: ");
                int teamSize = scanner.nextInt();
                scanner.nextLine();
                employee = new Manager(name, id, salary, teamSize);
                break;
            case "developer":
                System.out.print("Enter Programming Language: ");
                String programmingLanguage = scanner.nextLine();
                employee = new Developer(name, id, salary, programmingLanguage);
                break;

           case "intern":
                System.out.print("Years of Experience: ");
                int yearsOfExperience = scanner.nextInt();
                employee = new Intern(name, id, salary, yearsOfExperience);
                 scanner.nextLine();
                break;
           default:
                System.out.print("Not valid Job.");
                continue; // Skip the rest of the loop
          }

          // Displaying details
          System.out.println("\nEmployee Details:");
          employee.displayDetails();
          System.out.println();
      }
       
       System.out.print("Do you want to continue(true/false): ");
       roles = scanner.nextLine().toLowerCase();
       scanner.close();

  }
}


// true
// Enter type of role we have (manager, developer, intern)or  want to leave the program.///
// Manager
// Enter the employee ID: 1
// Enter employee name: Aaryan
// Enter salary: 50000
// Enter Team Size: 4

// Employee Details:
// Aaryan with id 1 is working in our company on salary 50000.0

// Enter type of role we have (manager, developer, intern)or  want to leave the program.
// Intern
// Enter the employee ID: 2
// Enter employee name: Hitesh
// Enter salary: 40000
// Years of Experience: 5

// Employee Details:
// Hitesh with id 2 is working in our company on salary 40000.0

// Enter type of role we have (manager, developer, intern)or  want to leave the program.
// Developer
// Enter the employee ID: 4
// Enter employee name: Yash
// Enter salary: 80000
// Enter Programming Language: Java

// Employee Details:
// Yash with id 4 is working in our company on salary 80000.0

// Enter type of role we have (manager, developer, intern)or  want to leave the program.
// Leave
// Leave this programDo you want to continue(true/false): false
