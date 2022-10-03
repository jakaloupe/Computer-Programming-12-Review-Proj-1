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
                
                Scanner userInput1 =  new Scanner(System.in);
                System.out.println("Problem 1: Data Converter");
                System.out.println("");
                System.out.println("Enter an Integer:");
                
                int integer = userInput1.nextInt();
        
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
                System.out.println("Problem 2: Grade Calculator");
                
                Scanner userInput2 = new Scanner(System.in);
                System.out.println("Enter student score: ");
                double sScore = userInput2.nextInt(); 
                System.out.println("Enter total score: ");
                double tScore = userInput2.nextInt();

                double pScore = (sScore/tScore) * 100;
                System.out.print("Student scored: " + pScore + "%");

                if (pScore <= 50){
                    System.out.println("Student grade: F");
                   }
                else if(pScore >=51 && pScore <= 59){
                   System.out.println(" C-");
                }
                else if(pScore >= 60 && pScore <= 66){
                    System.out.println(" C");
                }
                else if(pScore >= 67 && pScore <= 72){
                    System.out.println(" C+");
                }
             
                else if(pScore >= 73 && pScore < 86){
                    System.out.println(" B");
                }
                
                else if(pScore >= 86 && pScore <= 100){
                    System.out.println(" A");
                }
                
                else if(pScore > 100){
                    System.out.println("Wow you exceeded the score!");
                }
                else if(pScore > 0){
                    System.out.println("No way you got this score try again...");
                }
                break;
          
            case 3:
                System.out.println("Problem 3: For Loop");
                break;
                
            case 4:
                System.out.println("Problem 4: While Loop");
                break;
                
            case 5:
                System.out.println("Problem 5: Tax Calculator and Bank Balance");
                
                Scanner userInput3 = new Scanner(System.in);
                System.out.println("Enter cost of item:");
                double cost = userInput3.nextDouble();
                System.out.println("Enter bank balance:");
                double bank = userInput3.nextDouble();
                
                double tax = (double) 0.12*cost;
                double price = cost + tax;
                double amount = bank / cost;
                
                System.out.println("Price after tax: " + "$" + price);
                System.out.println("Amount of items you can purchase: " + (int)amount);
                
                break;
                
            case 6:
                System.out.println("Problem 6: Arrays/Lists");
                
                
                break;
                
            case 7:
                System.exit(0);
                
                        
        
    }
    }
}
