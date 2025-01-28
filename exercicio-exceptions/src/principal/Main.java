package principal;

import entities.Account;
import entities.ExceptionAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            int number = sc.nextInt();
            sc.next();
            String holder = sc.nextLine();
            double balance = sc.nextDouble();
            double withDrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withDrawLimit);
            System.out.print("Digite o valor para saque: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
        } catch (ExceptionAccount err) {
            System.out.println(err.getMessage());
        } catch (RuntimeException err) {
            System.out.println("Ocorreu um erro!!");
        }
    }
}