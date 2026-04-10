/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programming.assignment;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ProgrammingAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System. in);
        Login login= new Login();
        
        //register 
        System.out.println("=== REGISTER");
        
        System.out.print("Enter username:");
        String username = input.nextLine();
        
          System.out.print("Enter password:");
        String password = input.nextLine();
        
          System.out.print("Enter South African cellphone number:");
        String cellphone  = input.nextLine();
        
        String registerMessage = login.registerUser(username , password, cellphone);
              System.out.println(registerMessage);
              
              //LOGIN
              System.out.println("\n=== LOGIN ===");
              
               System.out.print("Enter username:");
        String loginUser = input.nextLine();
        
         System.out.print("Enter password:");
        String loginPass = input.nextLine();
        
        boolean success = login.loginUser(loginUser, loginPass);
              
               System.out.print("Enter first name:");
        String firstName = input.nextLine();
        
         System.out.print("Enter lastname:");
        String lastName = input.nextLine();
        
        System.out.println(login.returnLoginStatus(success, firstName, lastName));
    }
    
}
