package oop;

public class SavingsAccount extends Account{

    private int interest;

    public SavingsAccount(int interest) {
        this.interest =interest;
    }
    static void print(){
        System.out.println("Hi");
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interest=" + interest +
                '}';
    }
}
