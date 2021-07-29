package code.diff.loops;

public class Fix {

    public static void main(String[] args) {

        // Problem 1
        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = i;
        }
        System.out.println(sum);

        // Problem 2
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Blast off!");

        // Problem 3
        int product = 0;
        int n = 8; // Change Me!

        for(int i = 0; i > n; i++){
            product = i;
        }

        System.out.println(product);

        // Problem 4
        for(int i = 0; i < n; i++){
            int total = 0;
            total += i*i;
        }
        System.out.println(total);

        // Problem 5
        String output = "";
        int x = 8; // Change Me!

        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                output += i * j;
            }
        }

        System.out.println(output);

    }

}
