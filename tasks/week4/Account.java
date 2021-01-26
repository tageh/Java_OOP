import java.util.*;

public class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    //setter
    public void setId(int newId){
        id = newId;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void setAnnualInteresteRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }


    //Getter
    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }


    public String getDateCreated(){
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }

    //Methods 
    public void withdraw(double amount){
       balance -= amount; 
    }

    public void deposit(double amount){
        balance += amount;
    }

    
    
}
