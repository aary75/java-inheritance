import java.util.Scanner;
import java.util.Date;

// Base clas: Order
class Order{

     protected int orderId;
     protected Date orderDate;

     // Constructor
     public Order(int orderId, Date orderDate){
           this.orderId = orderId;
           this.orderDate = orderDate;
    }
     
    public String getOrderStatus(){
        return "Order placed";
    }

    public void displayDetails(){
         System.out.println("OrderId: " + orderId + " on date: " + orderDate);
         System.out.println("Order Status: " + getOrderStatus());
    }
}

// ShippedOrder as Subclass
class ShippedOrder extends Order{
     
     protected int trackingNumber;

     // Constructor
     public ShippedOrder(int orderId, Date orderDate, int trackingNumber){
           super(orderId, orderDate);
           this.trackingNumber = trackingNumber;
     }

     
     public String getOrderStatus(){
          return "Order Shipped. Tracking Number: " + trackingNumber;
     }

     public void displayDetials(){
          super.displayDetails();
          System.out.println("Tracking Number: " + trackingNumber);
     }
}

// DeliveredOrder as subclass
class DeliveredOrder extends ShippedOrder{

    public Date deliveryDate;

    public DeliveredOrder(int orderId, Date orderDate, int trackingNumber, Date deliveryDate){
         super(orderId, orderDate, trackingNumber);
         this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus(){
         return "Order delivered on " + deliveryDate;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class: Retail Order management
public class RetailOrderManagement{
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

          System.out.print("Do you want to start this program: ");
          String space = scanner.nextLine();

          while(space.equals("true")){

            System.out.print("Enter Order Id: ");
            int orderId = scanner.nextInt(); 
            scanner.nextLine();

//            System.out.print("Date on order booked: ");
            Date orderDate = new Date(); // Current Date

            System.out.print("Tracking Number of this Order: ");
            int trackingNumber = scanner.nextInt();
            scanner.nextLine();

  //          System.out.print("Delivery Date: ");
            Date deliveryDate = new Date(orderDate.getTime() + (3*24*60*60*1000));

            // Order Delivered
            DeliveredOrder order1 = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);
            
            order1.displayDetails();
 
            System.out.print("Do you want to leave this program(true/false): ");
            space = scanner.nextLine();

         }
     }
}
 
// Do you want to start this program: true
// Enter Order Id: 1
// Tracking Number of this Order: 3452
// OrderId: 1 on date: Sat Mar 15 11:57:13 IST 2025
// Order Status: Order delivered on Tue Mar 18 11:57:13 IST 2025
// Delivery Date: Tue Mar 18 11:57:13 IST 2025
// Do you want to leave this program(true/false): false
