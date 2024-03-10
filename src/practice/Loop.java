package practice;

import java.util.Random;

public class Loop {
    public static void main(String[] args) {
//        for(int maria = 100; maria>=90; maria--) {
//           System.out.print("["+maria+"]");
//           System.out.println("practice.Belen");
//        }
//        for (int test=0; test<=200;){
//            if(test==0){
//                System.out.println("["+1+"] "+"Pants");
//            }
//            else{
//            System.out.println("["+test+"] "+"Pants");
//            }
//            test+=13;
//        }
//
//        for (int i=10; i>0;i--){
//            System.out.print(i+"\t");
//        }
//
        //Nested loops
//        for(int i=1; i<=5; i++){
//            System.out.println("When i is: "+i);
//            System.out.println("........................");
//            for(int j=1; j<=5; j++){
//                System.out.println("This is inner loop: "+j);
//            }
//        }
        for (int q = 1; q <= 10; q++) {
            if (q > 5) {
                System.out.println("Greater than 5: " + q);
            } else if (q < 5) {
                System.out.println("Less than 5: " + q);
            }
        }
        int[] numbers = {1, 2, 3, 4, 5};
        for (int z : numbers) {
            if (z % 2 == 0) {
                System.out.println("This is even number: " + z);
            } else {
                System.out.println("This is odd number: " + z);
            }
        }
        char[] letters = {'a', 'g', 'b', 'k', 'i'};
        for (char z : letters) {
            if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
                System.out.println("This is a vowel: " + z);
            } else {
                System.out.println("This is a not vowel: " + z);
            }
        }

        char[] letters2 = {'a', 'g', 'b', 'k', 'i'};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char value : letters2) {
            for (char vowel : vowels) {
                if (value == vowel) {
                    System.out.println("This is a Vowel: " + value);
                }
            }
        }
        for (char bed : letters2) {
            for (char sofa : vowels) {
                if (bed == sofa) {
                    System.out.println("This is a vowel " + bed);
                }
            }
        }

        for (int f = 1; f < 9; f++) {
            System.out.print("For " + f + " it prints:");
            for (int g = 0; g < 5; g++) {
                System.out.print(g);
            }
            System.out.println();
        }
        for (int b = 1; b < 17; b++) {
            System.out.println("10 * " + b + ": " + b * 10);
        }

        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("% ");
            }
            System.out.println();
        }
        int c = 0;
        while (c < 1) {
            System.out.println(c);
            c++;
        }
        do {
            System.out.println("Hi");
            c++;
        }
        while (c < 3);

        Random rand = new Random();
        int day = rand.nextInt(6) + 1;
        System.out.println(day);
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }

}
