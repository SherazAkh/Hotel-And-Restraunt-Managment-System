import java.util.Scanner;
public class Roomservice{
  public String Roomcleaning;
  public String Complains;
  public int Roomserviceprice;
  public String Food;
  //method
  public void Roomservices(){
    Scanner input=new Scanner(System.in);
    System.out.println("Please Enter the Room Service Details that you want to book below: ");
    System.out.println("Enter Your Room Service Type:"+"1-Cleaning"+"\n2-Customer Support"+"\n3-Food");
    if(input.nextLine().equals("Cleaning")){
      System.out.println("Thank you for letting us know about the room service you want to book");
      System.out.println("Your room service has been booked");
      System.out.println("One Of Our Cleaner Will Reach To Your Room Shortly");
      System.out.println("Your room service details are");
      System.out.println("Room Service Type: "+"Cleaning");
      Roomserviceprice=1000; // Calculate price
      System.out.println("Room Service Price: Rs" + Roomserviceprice+"--Per Room Cleaning");
    }
    if(input.nextLine().equals("Complains")){
      System.out.println("Thank you for letting us know about the service you need");
      System.out.println("For Complains Please Contact Our Customer Support");
      System.out.println("Details are"+"\n"+"Phone Number: 012-3456789"+"\n"+"Email: support@sazhotel.com");
      System.out.println("Main office address: SAZ Hotel, Gulberg Karachi, Pakistan");
      
    }
    if(input.nextLine().equals("Food")){
      
    }
  else{
    System.out.println("Wrong Input , Please choose a valid services available above");
  }
  }
}