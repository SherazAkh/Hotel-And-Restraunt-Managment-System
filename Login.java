import java.util.Scanner;
public class Login {
  public String Regusername, Regpassword,Regemail,Username, Password ,Forgotlogins;
  public boolean loggedin = false; // Declare loggedin at class level
 public void Reglogin(){
   Scanner input=new Scanner(System.in);
   System.out.println("Please Enter Your Email");
   Regemail=input.nextLine();
   System.out.println("Enter Your Username: ");
   Regusername=input.nextLine();
   System.out.println("Enter Your Password: ");
   Regpassword=input.nextLine();
   System.out.println("thanks for your registration");
   System.out.println("");
   System.out.println("Please Login To Continue");
 }
  public void checkLogin() {
    Scanner input = new Scanner(System.in);

     // Use the while loop to control login attempts
    while (!loggedin){
        System.out.println("Enter Username: ");
        Username = input.nextLine();
        System.out.println("Enter Password: ");
        Password = input.nextLine();
        if (Username.equals(Regusername) && Password.equals(Regpassword)) {
          System.out.println("Login successful");
          loggedin = true; // Set loggedin to true if successful
          break; // Exit the while loop
        } else{
          System.out.println("Login failed");
          System.out.println("");
          System.out.println("Have you forgot your username and password? (yes/no)");
          Forgotlogins = input.nextLine();

          if (Forgotlogins.equals("yes")) {
            System.out.println("Enter your email: ");
            String email = input.nextLine(); // Declare email here
              if(email.equals(Regemail)) {
              System.out.println("Your username is:"+ Regusername);
              System.out.println("Your password is:"+ Regpassword);
               // Set loggedin to true after retrieving credentials
            } else {
              System.out.println("Your email is not registered with us");
            }
          } else if (Forgotlogins.equals("no")) {
            System.out.println("Please enter correct username and password");
          }
        }
}
  }
}