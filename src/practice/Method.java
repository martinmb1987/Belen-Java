package practice;

public class Method {
    static void findVowel() {
        char [] letters2 ={'a','g','b','k','i'};
        char [] vowels = {'a','e','i','o','u'};
        for(char bed:letters2){
            for(char sofa:vowels){
                if(bed==sofa){
                    System.out.println("This is a vowel "+bed);
                }
            }
        }
    }
    static void myMethod(String fname) {
        System.out.println(fname + " practice.Belen");
    }
    static void addition(int a, int b,int c){
        System.out.println("The addition result is: "+ (a+b+c));
    }
    static void multiply(int a, int b){
        System.out.println("The multiplication result is: "+ (a*b));
    }
    public void subtraction (int a, int b){
        System.out.println("The subtraction result is: "+ (a-b));
    }

    public static void main(String[] args) {
        findVowel();
        myMethod("Martin");
        addition(38,49,78);
        multiply(4,8);
        Method obj = new Method();
        obj.subtraction(40,8);

        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                + "\nBenefits : " + E1.benefits);
    }

}
