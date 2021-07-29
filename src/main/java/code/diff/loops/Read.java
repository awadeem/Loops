package code.diff.loops;

public class Read {

    public static void main(String[] args) {

        // Problem 1
        for(int i = 0; i < 6; i++){
            System.out.println(i);
        }

        // Problem 2
        for(int i = 4; i < 10; i++){
            System.out.println(i);
        }

        // Problem 3
        for(int i = 0; i < 10; i+=2){
            System.out.println(i);
        }

        // Problem 4
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        // Problem 5
        int count = 5;
        while(count > 0){
            System.out.println(count);
            count--;
        }

        // Problem 6
        int myCount = 0;
        for(int i = 0; i < 10; i++){
            myCount += i;
        }
        System.out.println(myCount);

        // Problem 7
        int yourCount = 1;
        while(yourCount < 6){
            System.out.println(2*yourCount);
            yourCount++;
        }

        // Problem 8
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + ":" + j);
            }
        }

        // Problem 9
        String str = "";
        for(int i = 0; i < 5; i++){
            str += i;
        }
        System.out.println(str);

        // Problem 10
        String myStr = "";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                myStr += j;
            }
            myStr += "\n";
        }
        System.out.println(myStr);

        // Problem 11
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
