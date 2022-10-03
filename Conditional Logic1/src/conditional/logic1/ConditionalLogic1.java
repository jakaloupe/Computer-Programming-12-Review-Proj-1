/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional.logic1;
import java.util.*;
/**
 *
 * @author fvmen
 */
public class ConditionalLogic1 {
     
    public static void main(String[] args) {
        
        //int n = (int)(Math.random() * (100-1+1) + 1);
        //System.out.println(n);
        // Random Num Generator
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter student score: ");
        double sScore = userInput.nextInt(); 
        System.out.println("Enter total score: ");
        double tScore = userInput.nextInt();
        
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
        else if(pScore >= 73 && pScore <= 75){
            System.out.println(" B-");
        }
        else if(pScore >= 76 && pScore <= 79){
            System.out.println(" B");
        }
        else if(pScore >= 80 && pScore <=85){
            System.out.println(" B+");
        }
        else if(pScore >= 86 && pScore <= 89){
            System.out.println(" A-");
        }
        else if(pScore >= 90 && pScore <= 95){
            System.out.println(" A");
        }
        else if(pScore >= 96 && pScore <= 100){
            System.out.println(" A+");
        }
        else if(pScore >= 101 && pScore <= -1)
            System.out.println("Invalid Score");
    }
   }
    

