/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author jacob.mendi
 */
public class Person {
    
    private String name;
    private String age;
    
    public Person(String nameType, String ageType){
        name = nameType;
        age = ageType;
    }
    public String toString(){
        return "My name is " + name + " and I am " + age + " years old";
    }
    
}
