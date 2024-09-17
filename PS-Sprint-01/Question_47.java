

/*
    ###################### Question-47 #################
    
    Generating a Number Pyramid
    Difficulty: Medium
    Topics: Patterns, Basic Programming
    Description: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).
    Example:
    Input: rows = 4
    Output:

    1  
    12  
    123  
    1234  
 */

import java.util.Scanner;

public class Question_47 {
    public static void main(String[] args) {
         // creating 'sc' object for taking input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();
        sc.close();

        // printing pattern
        System.out.println("Your pattern : ");
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
