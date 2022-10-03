/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.pkg1.review.project;

import java.util.Scanner;

/**
 *
 * @author jacob.mendi
 */
public class Unit1ReviewProject {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number and use F for Float or S for String");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        
        int input = scanner.nextInt();
        String input2 = scanner.next();
        
        switch(input){
            case 1:
                System.out.println("1");
                switch (input2){
                    case "F": 
                        System.out.println("1.0");
                        break;
                    case "S":
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("You entered an invalid input");
                        break;
                }
                break;
                
            case 2:
                System.out.println("2");
                switch (input2){
                    case "F": 
                        System.out.println("2.0");
                        break;
                    case "S":
                        System.out.println("2");
                        break;
                    default:
                        System.out.println("You entered an invalid input");
                        break;
                }
                break;  
                
            case 3:
                System.out.println("3");
                switch (input2){
                    case "F": 
                        System.out.println("3.0");
                        break;
                    case "S":
                        System.out.println("3");
                        break;
                    default:
                        System.out.println("You entered an invalid input");
                        break;
                }
                break;
                
            case 4:
                System.exit(0);
                
            default:
                System.out.println("Invalid Input");
                break;
        }
                
        
        
        
    }
    
}
