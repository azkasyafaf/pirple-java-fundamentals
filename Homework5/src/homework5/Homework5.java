/*
 Homework #5
 The Fundamentals of Java
 Chapter 5 - Function
 */
package homework5;
import java.util.*;

/*
 * This code written by : Azka S. Firdaus
 * Thursday, 10 September 2020
 */
public class Homework5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input, mode;
        
        System.out.println("Menu :");
        System.out.println("reverse     = To reverse inputed string");
        System.out.println("palindrome  = To check whether the inputed string\n"
                + "              Palindrome or not");
        System.out.println("random      = To give a random number from range\n"
                + "              of inputed range");
        System.out.println("-------------------------------------------------");
        System.out.println("\nWhat do you need?");
        mode = reader.next();
        
        switch(mode.toLowerCase()) {
            case "reverse":
                System.out.println("\nString Reverser");
                System.out.println("Enter the string that you want to reverse :");
                input = reader.next();
                System.out.println(reverseString(input));
                break;
            case "palindrome":
                System.out.println("\nPalindrome Checker");
                System.out.println("Enter the string that you want to check :");
                input = reader.next();
                System.out.println("Result : " + isPalindrome(input));
                break;
            case "random":
                System.out.println("\nRandom Number Generator");
                System.out.println("Enter the maximum number :");
                int num1 = reader.nextInt();
                System.out.println("Enter the minimum number :");
                int num2 = reader.nextInt();
                System.out.println(Math.pow(num2, num1));
                //System.out.println(randBetween(num1, num2));
                break;
            default:
                System.out.println("\nSorry! We don't have that function currently.");
                break;
        }
    }
    
    public static String reverseString(String input) {
        StringBuilder str = new StringBuilder(input);
        str.reverse();
        return str.toString();
    }
    
    public static boolean isPalindrome(String input) {
        int length = input.length();
        String rev = "";
                
        for (int i=length; i>0; i--) {
            rev = rev + input.charAt(i-1);
        }
        
        return (input.equals(rev));
    }
    
    public static String randBetween(int num1, int num2) {
        int max, min;
        
        if (num1>num2) {
            max = num1;
            min = num2;
        } else if (num1<num2) {
            max = num2;
            min = num1;
        } else {
            return "Error! There's no boundaries.";
        }
        
        int result = (int)(Math.random() * (max-min+1) + min);
        return "Your random number = " + String.valueOf(result);
    }    
}
