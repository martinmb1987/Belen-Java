package practice;

import java.util.Arrays;

public class Practice {
    public void subtraction (int a, int b){
        System.out.println("The subtraction result is: "+ (a-b));
    }
    public static void main(String[] args) {
        for (int a = 10; a < 20; a++) {
            System.out.println(a + "=hello");
        }
        for (int f = 1; f < 9; f++) {
            System.out.print("For " + f + " it prints:");
            for (int g = 0; g < 5; g++) {
                System.out.print(g);
            }
            System.out.println();
        }
        for (int b = 0; b <= 7; b++) {
            if (b == 1) {
                System.out.println("[" + b+ "]" + "test");
            } else {
                System.out.println("[" + b + "]" + "tested");
            }

        }
        String word = "Coding is a lot of fun";
        int i=1;
        for(char z:word.toCharArray()){
            System.out.println(i+"\t"+z);
            i++;
        }

        int[] number = {1, 23, 6, 0, 8};
        for (int s : number) {
            System.out.println("The number is: " + s);
        }
        for(int b=0; b<number.length;b++){
            System.out.println("The number is: " + b + "\t" + number[b]);
        }
        char  [] vowel = {'a','e','i','o','u'};
        for(char c: vowel){
            System.out.print(c+"\t");
        }

        System.out.println();
        int[][] numbers = {{1,2,3,4,5},{2,4}};
        for(int[] s: numbers){
          for(int j:s){
              System.out.println(j);
          }
        }

    }

}
