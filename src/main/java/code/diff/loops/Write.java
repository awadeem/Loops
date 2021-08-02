package code.diff.loops;

import java.util.Scanner;

public class Write {
    public static void main(String[] args) {


        // Problem 1
        // Display the numbers from 1 - 10
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // Problem 2
        // Display the numbers from 40 to -40
        for(int i = 40; i>-41 ; i--){
            System.out.println(i);
        }

        // Problem 3
        // Display the square numbers from 1 - 100
        for(int i= 1; i<=10; i++){
            System.out.println(i*i);
        }

        // Problem 4
        //Display all the even numbers under 20
        for(int i=2; i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        // Problem 5
        // Sum all the numbers between 10 and 20

      int sum =0;
        for(int i=11 ; i<20 ;i++) {
            sum += i;
        }
        System.out.println(sum);


        // Problem 6
        // Sum all the numbers from m to n
        Scanner input = new Scanner(System.in);
        System.out.println("Enter m number");
        int m = input.nextInt();
        System.out.println("Enter n number");
        int n = input.nextInt();
        int sumAllNumber = 0;
        if (m<n) {
            for (int i = m; i <= n; i++) {
                sumAllNumber += i;
            }
            System.out.println(sumAllNumber);
        }
        else{
            System.out.println("n must be greater than m");
        }



        // Problem 7
        // Given n, calculate the sum from 1 to 1/n
        // Example:
        // n = 5
        // 1/1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.283334
        System.out.println("Enter a number");
         double num = input.nextDouble();
         double a = 1;
         double addNum = 0;
         for(int i = 1; i<=num; i++){
             addNum +=a/i;
         }
        System.out.println(addNum);



    }
}