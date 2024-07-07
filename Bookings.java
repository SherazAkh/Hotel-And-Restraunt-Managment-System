import java.util.Scanner;
public class Bookings{
   public String Name, Address, Email;
   public String phone;
   public void bookings(){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter Your Name: ");
      Name=input.nextLine();
      System.out.println("Enter Your Address: ");
      Address=input.nextLine();
      System.out.println("Enter Your Phone Number: ");
      phone=input.nextLine();
      System.out.println("Enter Your Email: ");
      Email=input.nextLine();
   }
}
