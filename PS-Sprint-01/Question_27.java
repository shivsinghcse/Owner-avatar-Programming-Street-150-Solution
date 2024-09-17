/*
    ################## Question-27 ##################

    Generating a Pattern of Numbers
    Difficulty: Easy
    Topics: Basic Programming, Patterns
    Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).
    Example:
    Input: rows = 3
    Output:

    1  
    2 3  
    4 5 6  
    
 */

import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {

        // creating 'sc' object for taking input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();
        sc.close();

        // printing the pattern
        int x = 1;
        System.out.println("Your pattern : ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
