package solid;

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.tranferMoney(new BankAccount(), 100);
    }
}

public class BankAccount {

    void tranferMoney(BankAccount targetAccount, int amount) {
        //todo
    }
}
