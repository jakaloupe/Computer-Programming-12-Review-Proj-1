/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.logic;
import java.util.*;
/**
 *
 * @author jacob.mendi
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Enter: 1 for Problem 1, 2 for Problem 2, 3 for Problem 3, etc.");
        int input = userChoice.nextInt();
        
        switch(input){
            case 1:
                Scanner input1 =  new Scanner(System.in);
                System.out.println("Problem 1");
                System.out.println("");
                System.out.println("Enter an Integer:");
                
                int integer = input1.nextInt();
        
                System.out.println("Type F for Float, D for Double, or S for String: ");
        
                Scanner scanner = new Scanner(System.in);
                String inputs = scanner.next();
        
                switch(inputs){
                    case "F":
                        float fInput = (int) integer;
                        System.out.println(fInput);
                        break;
            
                    case "D":
                        double dInput = (int) integer;
                        System.out.println(dInput);
                        break;
                
                    case "S":
                        String sInput = String.valueOf(integer);
                        System.out.println(sInput);
                        break;
                
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }    
            case 2:
                System.out.println("Exiting Program");
                break;
                        
        
    }
    }
}
