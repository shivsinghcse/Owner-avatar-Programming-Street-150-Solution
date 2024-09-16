
/*   
********** Question-01 ***********

Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.
 */

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}