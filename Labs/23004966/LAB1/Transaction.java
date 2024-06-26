import java.util.Date;

/**
 *
 * @author User
 */
public class Transaction {

    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String toString(){
        return "type: "+ type + " \namount: "+ amount + " \nbalance: "+ balance + "description: "+ description;
    }

}
