/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.logic;
import java.util.*;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author jacob.mendi
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    //scanner that is able to be used universally in this class
    static Scanner userInput =  new Scanner(System.in);
    
    public static void main(String[] args) {
       
        System.out.println("Enter: Problem 1 = Casting, Problem 2 = Grade Calculator, Problem 3 = For Loop, etc.");
        
        int input = userInput.nextInt();
        // switch cases based on users input
        switch(input){
            case 1:
                dataConverter();
                break;
   
            case 2:
                gradeCalc();
                break;
          
            case 3:
                forLoop();
                break;
                
            case 4:
                whileLoop();
                break;
                
            case 5:
                taxCalc();
                break;
                
            case 6:
                arrays();
                break;
                
            case 7:
                persons();
                break;
            case 8:
                System.exit(0);
        }
    }
    
        public static void dataConverter(){
            System.out.println("");
            System.out.println("Problem 1: Data Converter");
            System.out.println("");
            System.out.println("Enter an Integer:");
                
            double userNum = userInput.nextDouble();
            
            //allows the user to select which type of variable to be converted to.
            System.out.println("Type F for Float, D for Double, S for String or I for Integer");
            String inputs = userInput.next();
        
                switch(inputs){
                    case "F":
                        //converts the input into a float
                        float fInput = (int) userNum;
                        System.out.println("The integer was changed to: " + fInput);
                        break;
            
                    case "D":
                        // converts the input into a double
                        double dInput = (int) userNum;
                        System.out.println("The integer was changed to: " + dInput);
                        break;
                
                    case "S":
                        // converts the input into a string
                        String sInput = String.valueOf(userNum);
                        System.out.println("The integer was changed to: " + sInput);
                        break;
                        
                    case "I":
                        // adds 0.5 to round up or down
                        userNum += 0.5;
                        //converts the input into an int
                        int iInput = (int) userNum;
                        System.out.println("The integer was changed to: " + iInput);
                        break;
                
                    default:
                        System.out.println("Invalid Input!");
                }
        }
        
        public static void gradeCalc(){
            System.out.println("");
            System.out.println("Problem 2: Grade Calculator");
            System.out.println("");
           
            // asks the user to input the students score
            System.out.println("Enter student score: ");
            double sScore = userInput.nextInt(); 
            // asks the user to input the total score of test/assignment
            System.out.println("Enter total score: ");
            double tScore = userInput.nextInt();
            
            // this calculates the percent by dividing the students score and total score, then multiplying by 100.
            double pScore = (sScore/tScore) * 100;
            System.out.println("Student scored: " + pScore + "%");

            if (pScore < 50){
            System.out.println("Student grade: F");
            }
            
            else if(pScore >=51 && pScore <= 59){
            System.out.println("Student grade: C-");
            }
            
            else if(pScore >= 60 && pScore <= 66){
            System.out.println("Student grade: C");
            }
            
            else if(pScore >= 67 && pScore <= 72){
            System.out.println("Student grade: C+");
            }
            
            else if(pScore >= 73 && pScore <= 85){
            System.out.println("Student grade: B");
            } 
            
            else if(pScore >= 86 && pScore <= 100){
            System.out.println("Student grade: A");
            }
            
            // when percent exceeds 100% it gives a hidden message
            else if(pScore > 100){
            System.out.println("Wow you exceeded the score!");
            }
            
            // when percent is below 0% it gives a hidden message
            else if(pScore < 0){
            System.out.println("No way you got this score try again...");
            }
        }
        
        public static void forLoop(){
            System.out.println("");
            System.out.println("Problem 3: For Loop");
            System.out.println("");
            // Asks to input a starting number
            System.out.println("Enter starting number");
            int sNum = userInput.nextInt();
            // asks to input an ending number
            System.out.println("Enter ending number");
            int eNum = userInput.nextInt();
            // asks to input a gap number
            System.out.println("Enter gap number");
            int gNum = userInput.nextInt();
            System.out.println("");
            // integer "i" is set at the sNum(starting number)and is added by the gNum(gap number) until it reaches the eNum(ending number) 
            for(int i = sNum; i <= eNum; i += gNum){
                System.out.println(i);
            }
        }
        
        
        public static void whileLoop(){
            System.out.println("");
            System.out.println("Problem 4: While Loop");
            System.out.println("");
            //creating a new random number generator
            Random rand = new Random();
            // this limits the number to be a maximum of 10
            int rng = rand.nextInt(11);
            // boolean becomes true when guessed correct number
            boolean numGuessed = false;
                
            while(!numGuessed){
                System.out.println("Guess a number between 1-10");
                int input = userInput.nextInt();
                    
                // if input is higher than the random num, it gives a hint that number is lower than guessed num.
                if (input > rng) {
                    System.out.println("Nope! the number is lower, Guess Again!");
                }
                // if input is higher than the random num, it gives a hint that number is higher than guessed num.
                if (input < rng) {
                    System.out.println("Nope! the number is higher, Guess Again!");
                }
                //once the input the user guessed is right, then the boolean becomes true, ending the loop
                if(input == rng){
                    System.out.println("You guessed right!");
                    numGuessed = true;
                }
            }
        }
 
        public static void taxCalc(){
            System.out.println("");
            System.out.println("Problem 5: Tax Calculator and Bank Balance");
            System.out.println("");
            //asks user to enter cost of item
            System.out.println("Enter cost of item:");
            double cost = userInput.nextDouble();
            // calculates tax by multiplying cost by 12%
            double tax = (double) 0.12*cost;
            // takes cost and adds tax to create total price
            double price = cost + tax;
            System.out.println("Price after tax: " + "$" + price);
            
            //asks user for their bank balance
            System.out.println("Enter bank balance:");
            double bank = userInput.nextDouble();
            //asks user to input cost of item
            System.out.println("Enter cost of item:");
            double cost2 = userInput.nextDouble();
            
            //again multiplies cost by 12%
            double tax2 = (double) 0.12*cost;
            //again adds cost to tax
            double price2 = cost2 + tax2;
            
            // divides bank balance by new price to calculate how many items user is able to buy
            double items = bank / price2;
            System.out.println("Price after tax: " + "$" + price2);
            System.out.println("Amount of items you can purchase: " + (int)items);
        }
        
        public static void arrays(){
            System.out.println("");
            System.out.println("Problem 6: Arrays and Lists");
            System.out.println("");
            
            //asks the user to input how many ints it wants the array to have
            System.out.println("Enter the max amount of integers you want the array to have");
            
            int max = userInput.nextInt();
            //takes the users max and creates an array with it
            int[] nums = new int[max];
            //total nums, used to calculate how many nums are going to be in the array; used later
            int tNums = 0;
            
            System.out.println("Enter " + max + " different integers");
            // for loop that takes the users integers in the array. and adds 1 to calculate how many ints were assigned 
            for(int i = 0; i < max; i++){
                nums[i] = userInput.nextInt();
            }
            
            System.out.println("");
            
            //sorts ints in the array numerically, and prints them.
            for(int i = 0; i < max; i++){
                //found through friend
                Arrays.sort(nums); 
                System.out.println(nums[i]);
            }
            // calculates all the ints in the array and adds them.
            for(int i = 0; i < nums.length; i++){
                tNums = nums[i] + tNums;
            }
            
            //takes the average of the ints in the array
            double average = tNums / nums.length;
            
            // displays average, lowest int, highest int.
            System.out.println("The average integer is: " + average);
            System.out.println("The lowest integer is: " + nums[0]);
            System.out.println("The highest integer is: " + nums[nums.length-1]);
        }
        
        public static void persons(){
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Problem 7: Classes/Objects");
            System.out.println("");
            //asks user to input first and last name
            System.out.println("Enter First Name and Last Name:");
            String pName = input.nextLine();
            //asks user to input fav quote
            System.out.println("Enter favourite quote:");
            String pQuote = input.nextLine();
            //asks user to input age
            System.out.println("Enter Age:");
            int pAge = input.nextInt();
            //creates new person based on the users inputs.
            Person person = new Person(pName, pAge, pQuote);
            // method that prints all details about person
            person.printDetails();
            
            //used for while loop
            boolean nPerson = false;
            
            while (!nPerson){
                
                System.out.println("Would you like to change any features?, press 1 to set something, press 2 to get something, or press 3 to stay");
                int change = userInput.nextInt();

                if(change == 1){
                    System.out.println("Press 1 to change Name, 2 to change Age or 3 to change Quote");
                    int change1 = userInput.nextInt();
                    
                    switch (change1) {
                        case 1:
                            //method asks for new name
                            person.setName();
                            //prints person with new name
                            person.printDetails();
                            break;
                        case 2:
                            //method asks for new age
                            person.setAge();   
                            //prints person with new age
                            person.printDetails();
                            break;
                        case 3:
                            //method asks for new quote
                            person.setQuote();
                            //prints person with new quote
                            person.printDetails();
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                }
                
                else if (change == 2){
                    System.out.println("Press 1 to change Name, 2 to change Age or 3 to change Quote");
                    int change2 = userInput.nextInt();
                    
                    switch(change2) {
                        case 1:
                            person.getName();
                            break;
                            
                        case 2:
                            person.getAge();
                            break;
                            
                        case 3:
                            person.getQuote();
                            break;
                        
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                }
                // if user inputs "2" then keeps character as is/saves char
                else if(change == 3) {
                System.out.println("Your character is:");
                nPerson = true;
                person.printDetails();
                }
               
            }
        }
}
