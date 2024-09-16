/*

######## Question-08 ############ 

Finding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.

*/

import java.util.Scanner;

public class Question_8 {
    public static void main(String []args){

        // creating sc object to take input
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        sc.close();

        // calculating factorial
        int fact = 1;
        for(int i=num; i>=1; i--){
            fact = fact * i;
        }

        // printing factorial

        System.out.println("Factorial of " + num + ": " + fact);

    }
}
