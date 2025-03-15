// Creating the class VehicleManagementSystem to show the vehicle details
import java.util.Scanner;

// Vehicle class - Superclass
abstract class Vehicle{

    protected int maxSpeed;
    protected String model;

    // Constructor
    public Vehicle(int maxSpeed, String model){
       this.maxSpeed = maxSpeed;
       this.model = model;
    }

    public abstract void displayDetails();
}

// refuel interface
interface Refuelable{
    public void refuel();
}

// ElectricVehicle class - subclass
class ElectricVehicle extends Vehicle{

      private int batteryCapacity;

      public ElectricVehicle(int maxSpeed, String model, int batteryCapacity){
          super(maxSpeed, model);
          this.batteryCapacity = batteryCapacity;
      }

      public void batteryCapacity(){
          System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity);
      }

      public void displayDetails(){
           System.out.println("Model: " + model + " and its maxspeed: " + maxSpeed);
           System.out.println("Battery Capacity " + batteryCapacity + " kWh");
      }
}

// PetrolVehicle class - subclass
class PetrolVehicle extends Vehicle implements Refuelable{

     private int fuelCapacity;

     public PetrolVehicle(int maxSpeed, String model, int fuelCapacity){
         super(maxSpeed, model);
         this.fuelCapacity = fuelCapacity;
     }

     public void refuel(){
        System.out.println(model + " is refuelling. Fuel Capacity " + fuelCapacity);
     }

     public void displayDetails(){ 
         System.out.println("Model: " + model + " and its maxSpeed: "+ maxSpeed);
         System.out.println("Fuel Capacity " + fuelCapacity + " liters");
     }
}

// Main class
public class VehicleManagementSystem{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        System.out.print("Do you want to start this program: ");
       String space = scanner.nextLine();

       while(space.equals("true")){
           
           // Enter the type of vehicle
           System.out.print("Enter the type of vehicle you have(Petrol or electric) or leave the program ");
           String type = scanner.nextLine().toLowerCase();

           if(type.equals("leave")){
              System.out.println("Leave the program");
              break;
           }

           // Getting common detals
           System.out.print("Enter the model: ");
           String model = scanner.nextLine();

           System.out.print("Enter the maxSpeed: ");
           int maxSpeed = scanner.nextInt();
           scanner.nextLine();

           Vehicle vehicle = null; // Ensure initialization

           switch (type){
              
              case "petrol":
                  System.out.print("Fuel Capacity(in litres): ");
                  int fuelCapacity = scanner.nextInt();
                  scanner.nextLine();
                  vehicle = new PetrolVehicle(maxSpeed, model, fuelCapacity);
                  break;
              
               case "electric":
                  System.out.print("Battery Capacity(in kWh): ");
                  int batteryCapacity = scanner.nextInt();
                  scanner.nextLine();
                  vehicle = new ElectricVehicle(maxSpeed, model, batteryCapacity);
                  break;
           
               default:
                  System.out.print("Not valid vehilce");
                  continue;
         }

         // Display vehicle details
         System.out.println("\nVehicle Details: ");
         vehicle.displayDetails();
         System.out.println();
     }

        System.out.print("Do you want to continue(true/false): ");
        space = scanner.nextLine().toLowerCase();
        scanner.close(); // close scanner at the end
}
}

// Do you want to start this program: true
// Enter the type of vehicle you have(Petrol or electric) or leave the program Petrol
// Enter the model: Creta
// Enter the maxSpeed: 250
// Fuel Capacity(in litres): 200

// Vehicle Details:
// Model: Creta and its maxSpeed: 250
// Fuel Capacity 200 liters

// Enter the type of vehicle you have(Petrol or electric) or leave the program Electric
// Enter the model: Auto
// Enter the maxSpeed: 140
// Battery Capacity(in kWh): 60

// Vehicle Details:
// Model: Auto and its maxspeed: 140
// Battery Capacity 60 kWh

// Enter the type of vehicle you have(Petrol or electric) or leave the program leave
// Leave the program
// Do you want to continue(true/false): false
