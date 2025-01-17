import java.util.Locale;
import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfficer = sc.nextInt();
        int hoursOfficer = sc.nextInt();
        double hoursOffice = sc.nextDouble();
        double salaryOfficer = hoursOffice * hoursOfficer;
        System.out.println("Number = " + numberOfficer);
        System.out.printf("Salary = U$ %.2f", salaryOfficer);
    }
}