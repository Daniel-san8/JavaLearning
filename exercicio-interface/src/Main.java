import entities.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       try {
           System.out.println("Entre com os dados do contrato: ");
           System.out.print("Numero: ");
           int numberContract = sc.nextInt();
           System.out.print("Data (dd/MM/yyyy): ");
           LocalDate dataContract =  LocalDate.parse(sc.next(), dtf);
           System.out.print("Hora: " + dataContract.format(dtf));
           System.out.print("Valor do contrato: ");
           double valueContract = sc.nextDouble();
           System.out.print("Entre com o número de parcelas: ");
           int parcelas = sc.nextInt();
           Contract contract = new Contract(parcelas, dataContract, valueContract);
           contract.viewParcelas();
       } catch (RuntimeException e) {
           System.out.println("Erro: " + e.getMessage());
       }

    }
}