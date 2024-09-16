/* 

############### Question-18 ################ 

Generating Multiplication Tables
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to generate multiplication tables for a given number.
Example:
Input: number = 4
Output:

4 x 1 = 4  
4 x 2 = 8  
4 x 3 = 12  
4 x 4 = 16  
4 x 5 = 20  
Explanation: The multiplication table for 4 up to 5 is generated.

*/

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        // creating sc object to take input
        Scanner sc = new Scanner(System.in);

         // taking input
         System.out.println("Enter the number: ");
         int num = sc.nextInt();
 
         sc.close();
         
        //  calculating and printing the table 
         System.out.println("Table of "+ num +" :");
         for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
         }
    }
}
