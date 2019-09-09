/*
 * UsingStringMethods
 */

import java.util.Scanner;
public class UsingStringMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int userIndex = -1;
        String text = "Hello World!";
        String another = "Today is going to be a beautiful day!";

        System.out.println("Using .length(): " );
        System.out.println("The amount of characters in this word is : " + text.length());
        System.out.println("The amount of characters in this other word is : " + another.length());

        System.out.println("Using .substring(): " );
        System.out.println("The section of word from index 0-5 is : " + text.substring(0,5));
        System.out.println("The section of word from index 5-10 is : " + another.substring(5,10));

        System.out.println("Using .charAt(): " );
        System.out.println("The character at index 1 is : " + text.charAt(1));
        System.out.println("The character at index 10 is : " + another.charAt(10));

        //Assignment
        System.out.print("Enter a word: ");
        input = sc.next();
        System.out.println("The size of the word entered is: " + input.length());
        System.out.print("Enter the end index of your substring: ");
        userIndex = sc.nextInt();
        if(userIndex == -1 || userIndex > input.length())
            System.out.println("Index is larger than length");
        else
            System.out.println("Substring: " + input.substring(0, userIndex));
    
        sc.close();   
    }

    
}