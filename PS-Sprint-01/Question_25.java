
/*
    ############### Question-25 #################### 

    Finding the Number of Digits in a Number
    Difficulty: Easy
    Topics: Basic Programming, Mathematical Computations
    Description: Write a program to count the number of digits in a given number.
    Example:
    Input: number = 12345
    Output: 5
    Explanation: The number 12345 has 5 digits.
 */

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {

        // creating 'sc' object for taking input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ogNum = num;
        sc.close();

        // store no of digit
        int count = 0;

        // calculating total digit in given number
        while (num > 0) {
            num = num / 10;
            count++;
        }
        // print result

        System.out.println("Total digit in " + ogNum + " = " + count);
    }
}
