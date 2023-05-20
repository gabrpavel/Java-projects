import com.gabr.corejava.BankAccount;

public class testBankAccount {

    public static void main(String[] args) {

        var accounts = new BankAccount[3];

        accounts[0] = new BankAccount("Pavel", "123ONE");
        accounts[1] = new BankAccount("Vlad", "123SECOND");
        accounts[2] = new BankAccount("Pavel", "123THIRD");

        for (BankAccount account : accounts) System.out.printf(account.getName() + " " + account.getBalance() + "\n");
        System.out.println("------------------------------");

        accounts[0].replenishBalance(100);
        accounts[1].replenishBalance(300);
        accounts[2].replenishBalance(250);

        for (BankAccount account : accounts) System.out.printf(account.getName() + " " + account.getBalance() + "\n");
        System.out.println("------------------------------");

        accounts[0].withdrawMoney(10);
        accounts[1].withdrawMoney(500);
        accounts[2].withdrawMoney(200);

        for (BankAccount account : accounts) System.out.printf(account.getName() + " " + account.getBalance() + "\n");

    }

}
