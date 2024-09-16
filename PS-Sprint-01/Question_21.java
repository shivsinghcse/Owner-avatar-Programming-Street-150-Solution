

/*

##############   Question-21 ##############

Calculating the Sum of Even Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all even numbers within a given range.
Example:
Input: range = [1, 10]
Output: 30
Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.
 */

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
         // creating sc object to take input
        Scanner sc = new Scanner(System.in);

         // taking input
         System.out.println("Enter the first number: ");
         int num1 = sc.nextInt();
         System.out.println("Enter the last number: ");
         int num2 = sc.nextInt();
 
         sc.close();
         int sum = 0;
         // calculating sum of even number 
         for(int i=num1; i<=num2; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
         }

         // prinitng output
         System.out.println("Sum of all even number between "+ num1 +" and " + num2 + " : " + sum);
    }
}
