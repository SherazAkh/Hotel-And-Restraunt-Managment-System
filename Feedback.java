import java.util.Scanner;
public class Feedback{
  public void feedback(){
    Scanner input=new Scanner(System.in);
    System.out.println("Your Feedback Is Important To Us");
    System.out.println("Please Fill The From Below Based On Our Services Honestly");
    System.out.println("");
    System.out.println("1. How Was Our Room Service"+"/n"+"Bad/Average/Good/Excellent");
    String Rating1=input.nextLine();
    System.out.println("2. How Was Our Food Service"+"/n"+"Bad/Average/Good/Excellent");
    String Rating2=input.nextLine();
    System.out.println("3. How Was Our Customer Service"+"/n"+"Bad/Average/Good/Excellent");
    String Rating3=input.nextLine();
    System.out.println("Overall Rating"+"/n"+"/5");
   int Rating4=input.nextInt();
    System.out.println("Additional Comments And Recoomendations");
    String Comments=input.nextLine();
    System.out.println("Thank You For Your Feedback. Your Feedback Is Valuable To Us");
System.out.println("");
    
    System.out.println("We will improve our services according to your feedback");
  }
}