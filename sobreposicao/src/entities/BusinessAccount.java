package entities;

public class BusinessAccount extends Account {
    private Integer saldo;

    public void adicionarSaldo (int valor) {
        saldo += valor;
    }

    @Override
    public void olaAccount () {
        System.out.println("olaBussiness");
    }
}
