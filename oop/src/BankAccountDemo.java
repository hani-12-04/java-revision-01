package oop.src;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Hani Ali", 5000);
        BankAccount samsAccount = new BankAccount("Sam Smith");



        samsAccount.deposit(5000);
        System.out.println("owner:" + samsAccount.getOwner());
        System.out.println("balance: " + samsAccount.getBalance());
        
        samsAccount.withdraw(1000); //warning!
        System.out.println("owner:" + samsAccount.getOwner());
        System.out.println("balance: " + samsAccount.getBalance());
        System.out.println();
        

        System.out.println("owner:" + myAccount.getOwner());
        System.out.println("balance: " + myAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000?");
        myAccount.deposit(1000);


    } // end main
    
} // end BankAccountDemo
