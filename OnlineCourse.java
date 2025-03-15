import java.util.Scanner;

// Base clas: Course
class Course{

     protected int duration;
     protected String courseName;

     // Constructor
     public Course(String courseName, int duration){
           this.duration = duration;
           this.courseName = courseName;
    }

    public void displayDetails(){
         System.out.println("Course: " + courseName + " with duration of " + duration + " weeks");
    }
}

// OnlineCourse as Subclass
class Online extends Course{
     
     protected String platform;
     protected boolean isRecorded;

     // Constructor
     public Online(String courseName, int duration, String platform, boolean isRecorded){
           super(courseName, duration);
           this.platform = platform;
           this.isRecorded = isRecorded;
     }

     public void displayDetails(){
          super.displayDetails();

          if(isRecorded) System.out.println("Course is available on: " + platform + " it is completely recorded");
          else System.out.println("Live course is running on " + platform);
     }
}

// PaidOnlineCourse as subclass
class PaidOnlineCourse extends Online{

    public int fee;
    public double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, double discount){
         super(courseName, duration, platform, isRecorded);
         this.fee = fee;
         this.discount = discount;
    }

    public double getDiscountedFee() {
         return fee - (fee * (discount / 100));
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fee of course: " +fee + " after discount it is: " + getDiscountedFee());
    }
}

// Main class: OnlineCourse
public class OnlineCourse{
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

          System.out.print("Do you want to start this program: ");
          String space = scanner.nextLine();

          while(space.equals("true")){

            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine(); 

            System.out.print("Enter duration: ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter platform: ");
            String platform = scanner.nextLine();

            System.out.print("Are lectures recorded: ");
            Boolean isRecorded = scanner.nextBoolean();

            System.out.print("Enter fees: ");
            int fee = scanner.nextInt();

            System.out.print("Enter Discount: ");
            double discount = scanner.nextDouble();
            scanner.nextLine();

            // Course Started
            PaidOnlineCourse course1 = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);
            
            course1.displayDetails();
 
            System.out.print("Do you want to leave this program(true/false): ");
            space = scanner.nextLine();

         }
     }
}
 

// Do you want to start this program: true
// Enter Course Name: Web Development
// Enter duration: 5
// Enter platform: PhysicsWallah
// Are lectures recorded: true
// Enter fees: 2000
// Enter Discount: 50
// Course: Web Development with duration of 5 weeks
// Course is available on: PhysicsWallah it is completely recorded
// Fee of course: 2000 after discount it is: 1000.0
// Do you want to leave this program(true/false): false
