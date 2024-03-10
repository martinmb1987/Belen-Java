package oop;

public class Account {

    private String accountName;
    private double balance;
    private String address;


    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setAccountName(String name) {
        if (name != null && !name.isEmpty()) {
            this.accountName = name;
        }
    }

    void deposit(double amount) {
        if (amount > 10) {
            balance += amount;
        }
    }

    void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Sorry insufficient fund");
        }

    }
    public String toString() {
        return "Account [" +
                "Account Name = '" + accountName + '\'' +
                ", Balance = " + balance +
                ", Address = '" + address + '\'' +
                ']';
    }

}
