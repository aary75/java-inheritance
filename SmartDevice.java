// Creating the SmartDevice class to display the details of devices
import java.util.Scanner;

// Super class (Device)
class Device{
    
    // Fields(Attributes)
    protected int deviceId;
    protected String status;

    // Constructor
    public Device(int deviceId, String status){
         this.deviceId = deviceId;
         this.status = status;
    }

    public void displayStatus(){
       System.out.println("Id: " + deviceId + " with status " + status);
    }
}

// Thermostat class
class Thermostat extends Device{
     
     private int temperatureSetting;
 
     // Constructor
     public Thermostat(int deviceId, String status, int temperatureSetting){
          super(deviceId, status);
          this.temperatureSetting = temperatureSetting;
     }

     public void displayDetails(){
        super.displayStatus();
        System.out.println("Temperature of device is: " + temperatureSetting);
     }
}

// Main class
public class SmartDevice{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.print("Do you want to start the program: ");
         String space = scanner.nextLine();

         while(space.equals("true")){
             
             // Getting the details
             System.out.print("Device Id: ");
             int id = scanner.nextInt();
             scanner.nextLine();

             System.out.print("Device Status: ");
             String status = scanner.nextLine();
            
             System.out.print("Temperature of device: ");
             int tempSetting = scanner.nextInt();
             scanner.nextLine();

             // Creating the object
             Thermostat thermostat1 = new Thermostat(id, status, tempSetting);

             thermostat1.displayDetails();

             System.out.print("Do you want to leave this program(true/false): ");
             space = scanner.nextLine();
         }
    }
}
         

// Do you want to start the program: true
// Device Id: 1
// Device Status: Working
// Temperature of device: 25
// Id: 1 with status Working
// Temperature of device is: 25
// Do you want to leave this program(true/false): false
