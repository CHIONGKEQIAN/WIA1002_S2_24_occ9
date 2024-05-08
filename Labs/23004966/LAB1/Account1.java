import java.util.ArrayList;

public class Account1 extends Account{

    private String name;
    private ArrayList<Transaction> transactions;

    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

}
