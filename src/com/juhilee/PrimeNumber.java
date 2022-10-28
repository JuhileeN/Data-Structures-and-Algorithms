package com.juhilee;

import java.util.*;

public class PrimeNumber {

   /* Non-optimised code with repetition of factors
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int c = 2;

        while (c < num) {
            if (num % c == 0) {
                System.out.println("Not a prime number");
                System.exit(0);
            }
            c += 1;
        }
        System.out.println("Prime Number");
    }

    */

     /* Optimised code to avoid repetition of factors */
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int c = 2;

        while(c * c <= num) {
            if(num % c == 0) {
                System.out.println("Not a prime number");
                System.exit(0);
            }
            c += 1;
        }
        System.out.println("Prime number");
    }

}
