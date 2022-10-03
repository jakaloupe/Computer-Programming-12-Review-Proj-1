/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.*;
/**
 *
 * @author jacob.mendi
 */
public class ClassTester {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First Name and Last Name:");
        String pName = userInput.nextLine();
        
        System.out.println("Enter Age:");
        String pAge = userInput.nextLine();
        
        Person jacob = new Person(pName, pAge);
        
        System.out.println(jacob);
        
    }
}
