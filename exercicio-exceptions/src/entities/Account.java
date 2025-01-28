package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    Account () {

    }

    public Account(int number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public void depositAccount (double amount) {
        if(amount <= 0) throw new ExceptionAccount("Depósito inválido");
        balance =+ amount;
        System.out.println("O novo saldo é: " + balance);
    }

    public void withdraw (double amount) {
        if(amount > withDrawLimit) throw new ExceptionAccount("Limite inferior");
        if(amount == 0) throw new ExceptionAccount("Tente um valor maior que zero");
        balance -= amount;
        System.out.println("Novo saldo: " + balance);
    }

}
