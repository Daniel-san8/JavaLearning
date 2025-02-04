package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Contract implements CalculationParcelas{

    Integer parcelas;
    LocalDate date;
    Double valueContract;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Contract () {

    }

    public Contract (int parcelas, LocalDate date, double valueContract) {
        this.parcelas = parcelas;
        this.date = date;
        this.valueContract = valueContract;
    }

    @Override
    public double calcular(double parcelas, int tax) {
        double valuePercenty = (double) (valueContract * tax) / 100;

        return valuePercenty + (valuePercenty * tax / 100);
    }

    public void viewParcelas() {
        for (int i = 0; i < parcelas; i++) {
            System.out.print(date.plusMonths(1) + " - ");
            System.out.print(calcular(parcelas, i));
        }
    }
}
