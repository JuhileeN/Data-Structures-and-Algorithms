package com.juhilee;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int result = 0;
        int last_digit;

        while(num > 0) {
           last_digit = num % 10;
           result = result * 10 + last_digit;
           num = num / 10;
        }

        System.out.println("Reverse of the number is: " + result);
    }
}
