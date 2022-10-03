/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditional.logic;

/**
 *
 * @author fvmen
 */
public class Person {
    
    private String name;
    private int age;
    
    public String getName() {
        System.out.println(name);
        return name;
    }
    
    public int getAge() {
        System.out.println(age);
        return age;
    }
    
    public Person(String nameType, int ageType){
        name = nameType;
        age = ageType;
    }
    public String toString(){
        return "My name is " + name + " and I am " + age + " years old";
    }
}
