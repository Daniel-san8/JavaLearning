import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int numberContract = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Data (dd/MM/yyyy): ");
        String dataContract = sc.next();
        System.out.print("Valor do contrato: ");
        double valueContract = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

    }
}