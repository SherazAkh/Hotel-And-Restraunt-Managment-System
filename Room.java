import java.util.Scanner;

public class Room extends Bookings{
  public String RoomType;
  public int RoomNumber;
  public int RoomCapacity;
  public int RoomPrice = 1000; // Base price
  public String RoomStatus; // RoomStatus should be a String
  public int Roomreserveddays;

  public void roombooking() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter the room details that you want to book below: ");
    System.out.println("Enter Your Room Type: (Single/Double/Triple/Quad/Penthouse/Presidential)");
    RoomType = input.nextLine();

    System.out.println("Enter Your Room Capacity: ");
    RoomCapacity = input.nextInt();
    input.nextLine(); // Consume the newline character

    System.out.println("For How many days you want to book the room: ");
    Roomreserveddays = input.nextInt();
    input.nextLine(); // Consume the newline character

    if (RoomCapacity <= 2) {
      System.out.println("Thank you for letting us know about the room you want to book");
      System.out.println("Your room has been booked" + "\nYour room details are");
      System.out.println("Room Type: " + RoomType);
      System.out.println("Room Capacity: " + RoomCapacity);
      RoomPrice = RoomPrice * Roomreserveddays; // Calculate price
      System.out.println("Room Price: " + RoomPrice);
      RoomStatus="Booked";
      RoomStatus = "room is booked and available for " + Roomreserveddays;
      System.out.println("Room Status: " + RoomStatus+ "For "+Roomreserveddays+"Days");
    } else if (RoomCapacity <= 5) {
      System.out.println("Thank you for letting us know about the room you want to book");
      System.out.println("Your room has been booked" + "\nYour room details are");
      System.out.println("Room Type: " + RoomType);
      System.out.println("Room Capacity: " + RoomCapacity);
      RoomPrice = RoomPrice * Roomreserveddays; // Calculate price
      System.out.println("Room Price: Rs " + RoomPrice);
      RoomStatus = "room is booked and available for " + Roomreserveddays;
      RoomStatus="Booked";
      System.out.println("Room Status: " + RoomStatus);
    } else {
      System.out.println("Sorry we don't have any rooms available for your room capacity");
    }
  }
}