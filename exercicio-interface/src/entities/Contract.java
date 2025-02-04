package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contract implements CalculationParcelas{

    Integer parcelas;
    LocalDate date;
    Double valueContract;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Contract () {

    }

    public Contract (int parcelas, LocalDate date, double valueContract) {
        this.parcelas = parcelas;
        this.date = date;
        this.valueContract = valueContract;
    }

    @Override
    public double calcular(double parcelaDivisor, int parcela) {
        return (double) parcelaDivisor + ((parcelaDivisor * parcela) / 100);
    }

    @Override
    public double calcularPlusTax(double valuePercenty) {
        return valuePercenty + ((valuePercenty * 2) / 100);
    }

    public void viewParcelas() {
        double valueTotalParc;
        for (int i = 0; i < parcelas; i++) {
            valueTotalParc  = calcular((valueContract / parcelas), i + 1);
            System.out.print(dateFormatter.format(date.plusMonths(i + 1)) + " - ");
            System.out.print(calcularPlusTax(valueTotalParc));
            System.out.println();
        }
    }
}
