import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, password and balance to create an account");
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);

        //add amount
        String msg=user.addMoney(100000);
        System.out.println(msg);

        //Withdraw
        System.out.println("Enter money u want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter ur password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        System.out.println(user.calculateInterest(10));
    }
}