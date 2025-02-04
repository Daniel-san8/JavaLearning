package entities;

public interface CalculationParcelas {
    double calcular(double parcelaDivisor, int parcela);

    double calcularPlusTax(double valuePercenty);
}
