import com.gabr.corejava.*;

public class testBankAccount {

    public static void main(String[] args) {

        var savingsAccount1 = new SavingsAccount(500, 0.05);
        var savingsAccount2 = new SavingsAccount(650, 0.08);

        savingsAccount1.deposit(1_000);
        savingsAccount1.withdraw(300);

        savingsAccount2.deposit(2_000);
        savingsAccount2.calcInterest();


        var checkingAccount1 = new CheckingAccount(100, true);
        var checkingAccount2 = new CheckingAccount(300, false);

        checkingAccount1.deposit(1_000);
        checkingAccount2.deposit(3_000);

        checkingAccount1.withdraw(500);
        checkingAccount2.orderCheckbook();


    }

}
