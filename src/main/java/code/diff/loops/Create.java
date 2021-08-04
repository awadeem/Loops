package code.diff.loops;

import java.util.Scanner;

public class Create {

    public static void main(String[] args) {

        // Problem 1
        // Display the following shape
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        System.out.println("PROBLEM 1: ");
        int numOfLines = 9;
        int midLine = (numOfLines+1)/2;
        // upper part
        for (int i = 1; i <= midLine; i++){
            //space
            for (int s = 1; s<=(midLine-i); s++){
                System.out.print(" ");
            }
            //star
            for (int j =1; j<=(i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
    }
        //Lower part
       for(int i =1;i <=(midLine-1);i++) {


           //space
           for (int s = 1; s <= i; s++){
               System.out.print(" ");
           }
           //star
           for (int j= 1; j<=(midLine-i)*2-1; j++){
               System.out.print("*");
           }
           System.out.println();

       }


//         Problem 2
//         Given the number of rows, create a triangle with that many rows.
//         For example, if rows = 5 then
//         *
//         **
//         ***
//         ****
//         *****
        System.out.println("PROBLEM 2: ");

        System.out.println("Enter the number of line (odd numbers)");
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        for (int i = 1; i <= numberOfLines; i++){
          //add stars
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

            }

        // Problem 3
        // Using the celsius to fahrenheit conversion, product the following table
        // |Celsius|Fahrenheit|
        // | 0     | 32       |
        // | 1     | 33.8     |
        // | 2     | 35.6     |
        // | ...   | ...      |
        // | 30    | 86       |

        System.out.println("PROBLEM 3: ");

         int celsius = 0;
        double fahrenheit;
        System.out.println(" | "+"celsius"+"|"+"fahrenheit"+"| ");

        while(celsius <=30 ) {
            fahrenheit = (9.0/5.0 * celsius) + 32;
           System.out.println(" | " + celsius + "      | " + fahrenheit + "     | ");
            celsius++;
        }


        // Problem 4
        // Declare a variable x with any value. Determine if x is prime.
        //Dividing the number by 2 does gain us efficiency but how could we make it more efficient? Think about 25,
        // do you need to go up to 12.5? Could you stop at a lower number?
        System.out.println("PROBLEM 4: ");

        int remainder;
        boolean isPrime = true;
        int numberToCheck = 77;

        for (int i = 2; i <= numberToCheck /i; i++) {
            remainder = numberToCheck % i;


            if (remainder == 0) {

                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(numberToCheck + " is a Prime numberToCheckber");
        else
            System.out.println(numberToCheck + " is not a Prime numberToCheckber");


        // Problem 5
        // The Kalebnacci sequence begins with 2 and -1 as its first and second terms.
        // After these first two elements, each subsequent element is equal to twice the previous previous term minus
        // the previous term.
        // kaleb(0) = 2
        // kaleb(1) = -1
        // kaleb(n) = 2*kaleb(n-2) - kaleb(n-1)
        // Find the nth number in the sequence

        System.out.println("PROBLEM 5: ");

        int n = 8;
        int a = 2;
        int b = -1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i =0; i<n;i++){
             c =2*a-b;
            System.out.print(c + " " );
            a=b;
            b=c;
        }

    }
}