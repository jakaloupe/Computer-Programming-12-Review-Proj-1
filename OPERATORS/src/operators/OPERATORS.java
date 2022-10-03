/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;
import java.util.*;

/**
 *
 * @author jacob.mendi
 */
public class OPERATORS {
   
    public static void main(String[] args) {
        
        Scanner userInput4 = new Scanner(System.in);
        System.out.println("Enter cost of item:");
        int cost = userInput4.nextInt();
        System.out.println("Enter bank balance:");
        double bank = userInput4.nextDouble();
        double tax = (double) 0.12*cost;
        double price = cost + tax;
        double amount = bank / cost;
        System.out.println("Price after tax: " + "$" + price);
        System.out.println("Amount of items you can purchase: " + (int)amount);
        //project 1 an ything in
    }
    
}
   
   