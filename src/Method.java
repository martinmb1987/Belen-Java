public class Method {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void addition(int a, int b){
        System.out.println("The addition result is: "+ (a+b));
    }
    static void multiply(int a, double b){
        System.out.println("The multiplication result is: "+ (a*b));
    }
    public void subtraction (int a, int b){
        System.out.println("The subtraction result is: "+ (a-b));
    }
    public static void main(String[] args) {
        myMethod();
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        addition(8,9);
        multiply(4,8.6);

        Method obj = new Method();
        obj.subtraction(80,60);

        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                + "\nBenefits : " + E1.benefits);
    }

}
