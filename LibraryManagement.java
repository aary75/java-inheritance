//Creating the class LibraryManagement to display the library System using single inheriteance
import java.util.Scanner;

// Book class (Super class)
class Book {
    
     protected String title;
     protected int productionYear;

     public Book(String title, int productionYear){
            this.title = title;
            this.productionYear = productionYear;
     }

    public void displayInfo(){
         System.out.println("Title: " + title + ", Production Year: " + productionYear);
     }
}

// Author class
class Author extends Book {
    
    protected String name;
    protected String bio;

    // Constructor
    public Author(String title, int productionYear, String name, String bio){
          super(title, productionYear);
          this.name = name;
          this.bio = bio;
    }

    @Override
    // Display the complete info
    public void displayInfo(){
         System.out.println("Name " + name + " and its bio is: " + bio);
         super.displayInfo();
    }
}

// Main class
public class LibraryManagement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to start the program: ");
        String space = scanner.nextLine().toLowerCase();

        while(space.equals("true")){
           
           // Giving information
           System.out.print("Enter title of Book: ");
           String title = scanner.nextLine();

           System.out.print("Enter Production Year: ");
           int productionYear = scanner.nextInt();
           scanner.nextLine();

           System.out.print("Enter Author name: ");
           String name = scanner.nextLine();

           System.out.print("Enter his/her bio: ");
           String bio = scanner.nextLine();

           // Creating object
           Author author = new Author(title, productionYear, name, bio);

           author.displayInfo();
      
           System.out.print("Do you want to continue this program(true/false): ");
           space = scanner.nextLine();
       }
   }
}


// Output:
// Do you want to start the program: true
// Enter title of Book: Geeta
// Enter Production Year: 3000
// Enter Author name: Krishna
// Enter his/her bio: God
// Name Krishna and its bio is: God
// Title: Geeta, Production Year: 3000
// Do you want to continue this program(true/false): false

