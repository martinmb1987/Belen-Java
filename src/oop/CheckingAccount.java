package oop;

public class CheckingAccount extends Account{

    @Override //anotation
    void withDraw(double amount) {
        super.withDraw(amount);
        super.withDraw(5);
    }
    void wordCount(String sentence){
      //  String [] word = {"This", "is","so","easy"};
        String[] words=sentence.split(" ");
        int count=0;
        for(int i=0;i<= words.length;i++){
            count=+i;
        }
        System.out.println("The word count is: "+count);
    }
      StringBuilder reverseString(String sentence){
        StringBuilder newName = new StringBuilder();
        for(int i=sentence.length()-1;i>=0;i--){
            newName.append(sentence.charAt(i));
        }
       return newName;
    }
}
