import java.util.*;

public class opg9_7{
    public static void main(String[] args) {
        Account konto = new Account(1122, 20000);

        konto.setAnnualInteresteRate(4.5);

        konto.withdraw(2500);
        konto.deposit(3000);

        System.out.println("Balance " + konto.getBalance());
        System.out.println("Monthly intereset " + konto.getMonthlyInterest());
        System.out.println("Date created " + konto.getDateCreated());


    }
}
