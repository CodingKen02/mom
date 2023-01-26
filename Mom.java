/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mom;
import java.util.Scanner;
/**
 *
 * @author codingken
 */
public class Mom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner for the new command window
        Scanner input = new Scanner(System.in);
        
        // declare the variables
        int number1; // hold the first integer
        int number2; // hold the second integer
        int number3; // hold the third integer
        
        System.out.print("Please enter the first integer: "); // prompts user
        number1 = input.nextInt(); // the first integer
        
        System.out.print("Please enter the second integer: "); // prompts user
        number2 = input.nextInt(); // the second integer
        
        System.out.print("Please enter the third integer: "); // prompts user
        number3 = input.nextInt(); // the third integer
        
        int sum = number1 + number2 + number3; // add the numbers, total is sum
        System.out.printf("%nSum is %d%n", sum); //displays the sum
        
    }
    
}
