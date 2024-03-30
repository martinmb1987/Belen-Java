package belenJavaProject;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;

public class Store {
    private String clothes;
    private String accesories;

    Store(String clothes, String accesories) {
        this.clothes = clothes;
        this.accesories = accesories;
    }

    public String toString() {
        return clothes + "\n" + accesories;
    }

    public static void main(String[] args) {
        addition(35,76,45);
        Store s = new Store("Shirt", "Watch");
        System.out.println(s);
        s.accesories = "Pants";
        int[] findEvenNumber = {2, 7, 23, 46, 55, 58, 60};
        for (int n : findEvenNumber) {
            if (n % 2 == 0) {
                System.out.println("This number is even " + n);
            }
        }
        char[]findVowel={'a','c','f','t','o','u','h'};
        for(char l:findVowel){
            if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'){
                System.out.println("This is a vowel: " + l);
            }
        }
        System.out.println(s.reverseWord("Tawfiqul"));
        s.wordCount("Hi, my name is Belen");
        s.letterCount("Hi, my name is Belen");
        s.duplicateWord("Belen is crazy Belen is mad mad mad mad");
        System.out.println("-------------------------------------------------------------");
        s.duplicateNumber(new int[]{11,13,12,30,4,4,11,13});
        s.duplicateWord2("Belen Belen is");



    }
    static void addition(int d, int e,int f){
        System.out.println("The addition is: "+ (d+e+f));
    }
    StringBuilder reverseWord(String word){
        char[]letters=word.toCharArray();
        StringBuilder nb= new StringBuilder();
        int lastLetter = letters.length-1;
        int firstLetter = 0;
        for(int i= lastLetter;i>=firstLetter;i--){
            if(i==lastLetter){
                nb.append(Character.toUpperCase(letters[lastLetter]));
            }
            else if(i==firstLetter){
                nb.append(Character.toLowerCase(letters[firstLetter]));
            }
            else{
                nb.append(letters[i]);
            }

        }
        return nb;
    }

    void wordCount(String sentence){
        String[] word= sentence.split("\\s");
        int count=0;
        for(String words:word){
           count++;
        }
        System.out.println(count);
    }

    void letterCount(String sentence){
        String[] word= sentence.replaceAll(" ","").replace(",","").split("");
        int count=0;
        for(String words:word){
            count++;
        }
        System.out.println(count);
    }

    void duplicateWord(String sentence){
        String[] word= sentence.split("\\s");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String w: word){
            if(wordCount.containsKey(w)){
                wordCount.put(w,wordCount.get(w)+1);
            }
            else{
                wordCount.put(w,1);
            }
        }
        for(String key: wordCount.keySet()){
            if(wordCount.get(key)>1) {
                System.out.println("This word is a duplicate: " + key +" Count: " + wordCount.get(key));
            }
            else {
                System.out.println("This is not a duplicate: "+ key +" Count: " + wordCount.get(key));
            }
        }
    }
    void duplicateNumber(int[]number){
        HashMap<Integer, Integer> countNumber=new HashMap<>();
        for(int n:number){
            if(countNumber.containsKey(n)){
                countNumber.put(n,countNumber.get(n)+1);
            }
            else{
              countNumber.put(n,1);
            }
        }
        for(int key: countNumber.keySet()){
            if(countNumber.get(key)>1) {
                System.out.println("This number is duplicate: " + key +" Count: " + countNumber.get(key));
            }
            else {
                System.out.println("This is not a duplicate: "+ key +" Count: " + countNumber.get(key));
            }
        }
    }

    void duplicateWord2(String sentence){
        String[] words=sentence.split("\s");
        HashMap<String,Integer> countDuplicate=new HashMap<>();
        for(String w:words){
            if(countDuplicate.containsKey(w)){
                countDuplicate.put(w,countDuplicate.get(w)+1);
            }
            else{
                countDuplicate.put(w,1);
            }
        }
        for(String a:countDuplicate.keySet()){
            if(countDuplicate.get(a)>1){
                System.out.println("This word is duplicate: "+a+ " Count: "+countDuplicate.get(a));
            }
            else{
                System.out.println("This word is not duplicate: "+a+ " Count: "+countDuplicate.get(a));
            }
        }
    }


}
