package code.diff.loops;

public class Read {

    public static void main(String[] args) {

        // Problem 1
        //Statement 1 sets a variable before the loop starts (int i = 0).

        //Statement 2 defines the condition for the loop to run (i must be less than 6). If the condition is true
        //the loop will start over again, if it is false, the loop will end.

        //Statement 3 increases a value (i++) each time the code block in the loop has been executed.
        //It will print the numbers 0 to 5.
        for(int i = 0; i < 6; i++){
            System.out.println(i);
        }

        // Problem 2
        //Statement 1 sets a variable before the loop starts (int i = 4).

        //Statement 2 defines the condition for the loop to run (i must be less than 10).
        // If the condition is true the loop will start over again, if it is false, the loop will end.

        //Statement 3 increases a value (i++) each time the code block in the loop has been executed.
        //It will print the numbers 4 to 9.

        for(int i = 4; i < 10; i++){
            System.out.println(i);
        }

        // Problem 3
        //Statement 1 sets a variable before the loop starts (int i = 0).

        //Statement 2 defines the condition for the loop to run (i must be less than 10).
        // If the condition is true the loop will start over again, if it is false, the loop will end.

        //Statement 3 increases a value (i+=2) each time the code block in the loop has been executed.
        //It will print the numbers 0 to 8.
        for(int i = 0; i < 10; i+=2){
            System.out.println(i);
        }

        // Problem 4
        //Statement 1 sets a variable before the loop starts (int i = 10).

        //Statement 2 defines the condition for the loop to run (i must be greater than or equal 0).
        // If the condition is true the loop will start over again, if it is false, the loop will end.

        //Statement 3 decreases a value (i--) each time the code block in the loop has been executed.
        //It will print the numbers 10 to 0.
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        // Problem 5
        //The while loop loops through a block of code as long as a specified condition is true.
        //The code in the loop will run, over and over again, as long as a variable (count) is less than 5.
        // decrease a value count-- each time the code block in the loop has been executed.
        int count = 5;
        while(count > 0){
            System.out.println(count);
            count--;
        }

        // Problem 6
        //count: 0 0 1 3 6 10 15 21 28 36 45
        //i:     0 1 2 3 4 5 6   7  8  9
        // i number add in count.


        int myCount = 0;
        for(int i = 0; i < 10; i++){
            myCount += i;
        }
        System.out.println(myCount);


        // Problem 7
        //result
//        2
//        4
//        6
//        8
//        10
        // each time yourCount increment by 1 and multiply by 2;
         int yourCount = 1;
        while(yourCount < 6){
            System.out.println(2*yourCount);
            yourCount++;
        }

        // Problem 8
        // have 2 loops
        // first 1st loop run and then 2nd loop run.
        // when the 2nd loop done the first loop run again.
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + ":" + j);
            }
        }

        // Problem 9
        //answer: 01234
        // add i in str.

        String str = "";
        for(int i = 0; i < 5; i++){
            str += i;
        }
        System.out.println(str);

        // Problem 10
        //result
//        01234
//        01234
//        01234
//        01234
//        01234
        // have 2 loops
        // first 1st loop run and then 2nd loop run.
        // when the 2nd loop done the first loop run again.

        String myStr = "";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                myStr += j;
            }
            myStr += "\n";
        }
        System.out.println(myStr);

        // Problem 11
        //result
//        1
//        2
//        5
//        6
        // loop is keep running until i equal to 6

        int i = 0;
        while (i >= 0) {
            if (i == 2) {
                i += 2;
                continue;
            }
            i++;
            System.out.println(i);

            if (i == 6) {
                break;
            }
        }

    }


}
