/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditional.logic;
import java.util.*;
/**
 *
 * @author fvmen
 */
public class Person {
    
    private String name;
    private int age;
    private String quote;
    
    static Scanner userInput = new Scanner(System.in);
    
    
    
    public String getName() {
        System.out.println(name);
        return name;
    }
    
    public void setName(){
        System.out.println("Enter new name");
        String newName = userInput.nextLine();
        name = newName;
    }
    
    public int getAge() {
        System.out.println(age);
        return age;
    }
    
    public void setAge(){
        System.out.println("Enter new age");
        int newAge = userInput.nextInt();
        age = newAge;
    }
    public void setQuote(){
        System.out.println("Enter new quote");
        String newQuote = userInput.nextLine();
        quote = newQuote;
    }
    
    public String getQuote(){
        System.out.println(quote);
        return quote;
    }
    
    public Person(String fName,int fAge,String fQuote){
        name = fName;
        age = fAge;
        quote = fQuote;
    }
    
    public void printDetails(){
        System.out.println("My name is " + name + ", I am " + age + " years old and my favourite quote is " + quote);
    }
    
}
