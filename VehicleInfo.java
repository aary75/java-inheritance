// Creating the vehicle info class to show the vehicle details
import java.util.Scanner;

// Superclass
class Vehicle{
     
    // Fields(Attributes)
    public int maxSpeed;
    public String fuelType;

    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
       System.out.println(" MaxSpeed: " + maxSpeed + " fuelType: " + fuelType);
    }
}

// Car class
class Car extends Vehicle{
     
      public int seatCapacity;

      public Car(int maxSpeed, String fuelType, int seatCapacity){
           super(maxSpeed, fuelType);
           this.seatCapacity = seatCapacity;
      }

      public void displayInfo(){
         super.displayInfo();
         System.out.println("Seat Capacity is: " + seatCapacity);
      }
}

// Truck class
class Truck extends Vehicle{

      public int weight;

      public Truck(int maxSpeed, String fuelType, int weight){
           super(maxSpeed, fuelType);
           this.weight = weight;
      }

      public void displayInfo(){
          super.displayInfo();
          System.out.println("Weight of truck is: " + weight);
     }
}

// Motorcycle class
class Motorcycle extends Vehicle{

     public String type;

     public Motorcycle(int maxSpeed, String fuelType, String type){
           super(maxSpeed, fuelType);
           this.type = type;
     }

     public void displayInfo(){
          super.displayInfo();
          System.out.println("Type: " + type);
     }
}

// Main class 
public class VehicleInfo{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to start this program (true/false): ");
        String space = scanner.nextLine().toLowerCase();

        while(space.equals("true")){
        
           // Aksing for type
           System.out.println("Enter the type of vehicle you have (Car/Truck/MotorCycle) or want to leave the program: ");
           String type = scanner.nextLine().toLowerCase();

           if(type.equals("leave")){
               System.out.println("Leave the program");
               break;
            }
 
           // Enter the maxspeed
           System.out.print("Enter the maxSpeed: ");
           int maxSpeed = scanner.nextInt();
           scanner.nextLine();

           // Enter the fuelType
           System.out.print("Enter the fuel type: ");
           String fuelType = scanner.nextLine().toLowerCase();
          
            // Creating object
            Vehicle vehicle;
          
            switch (type) {
               case "car":
                   System.out.print("Enter seat capacity: ");
                   int seatCapacity = scanner.nextInt();
                   scanner.nextLine();
                   vehicle = new Car(maxSpeed, fuelType, seatCapacity);
                   break;
               case "truck":
                   System.out.print("Enter weight of truck: ");
                   int weight = scanner.nextInt();
                   scanner.nextLine();
                   vehicle = new Truck(maxSpeed, fuelType, weight);
                   break;
               case "motorcycle":
                   System.out.print("Brand of bike: ");
                   String brand = scanner.nextLine();
                   vehicle = new Motorcycle(maxSpeed, fuelType, brand);
                   break;
                default:
                   System.out.print("Invalid vehicle type");
                   continue;
              }

             // Printing the details
             System.out.print("\nVehicle Details: ");
             System.out.print("Vehicle: "+ type);
             vehicle.displayInfo();
             System.out.println();
          }

          System.out.print("Do you want to continue(true/false): ");
          space = scanner.nextLine().toLowerCase();
          scanner.close();

 }
}


// Do you want to start this program (true/false): true
// Enter the type of vehicle you have (Car/Truck/MotorCycle) or want to leave the program:
// Car
// Enter the maxSpeed: 200
// Enter the fuel type: diesel
// Enter seat capacity: 5

// Vehicle Details: Vehicle: car MaxSpeed: 200 fuelType: diesel
// Seat Capacity is: 5

// Enter the type of vehicle you have (Car/Truck/MotorCycle) or want to leave the program:
// Truck
// Enter the maxSpeed: 250
// Enter the fuel type: diesel
// Enter weight of truck: 2

// Vehicle Details: Vehicle: truck MaxSpeed: 250 fuelType: diesel
// Weight of truck is: 2

// Enter the type of vehicle you have (Car/Truck/MotorCycle) or want to leave the program:
// MotorCycle
// Enter the maxSpeed: 400
// Enter the fuel type: diesel
// Brand of bike: Honda

// Vehicle Details: Vehicle: motorcycle MaxSpeed: 400 fuelType: diesel
// Type: Honda

// Enter the type of vehicle you have (Car/Truck/MotorCycle) or want to leave the program:
// leave
// Leave the program
// Do you want to continue(true/false): false
