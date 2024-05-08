public class L1Q3 {
    public static void main(String[] args) {
        // TODO code application logic here

        //   Account acc = new Account(1234, 1000);
        Account1 acc = new Account1("George", 1122, 1000);
        acc.setAnnualInterestRate(1.5);
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
        System.out.println("Name: "+ acc.getName());
        System.out.println("balance: "+ acc.getBalance() );
        System.out.println("Annual Interest Rate: "+ acc.getAnnualInterestRate() + "%");
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        //  System.out.println("Date Created: " + acc.getDateCreated());
    }
}
