import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    //default constructor
    Customer(){
        //code here

    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //code here
        deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();
        this.name = name;
        this.accountNumber = accountNumber;

    }

    public double deposit(double amt, Date date, String account){
        //code here
        Date date = new Date();
        if ((account == CHECKING)&(amt>0)){
            amt += checkBalance;
            Deposit deposit = new Deposit(amt, date, account);
            deposits.add(deposit);
            return checkBalance; }

        else if ((account == SAVING)&(amt>0)) {
            amt += savingBalance;
            Deposit deposit = new Deposit(amt, date, account);
            deposits.add(deposit);
            return savingBalance;
        }
        else
            return




        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        if((account == CHECKING)&(amt>0)){
            amt-= checkBalance;
            Withdraw withdraw = new Withdraw(amt, date, account);
            withdraws.add(withdraw);
            return checkBalance;
        }
        if ((account == SAVING)&(amt>0)){
            amt-= savingBalance;
            Withdraw withdraw = new Withdraw(amt, date, account);
            withdraws.add(withdraw);
            return savingBalance;
        }
        else
            return
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}

