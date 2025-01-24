package principal;

import entities.Account;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        BusinessAccount bacc = new BusinessAccount();

        acc.olaAccount();
        bacc.olaAccount();
    }
}