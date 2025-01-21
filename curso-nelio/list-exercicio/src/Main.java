import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantityOfficers = sc.nextInt();
        int id;
        double salary;
        String name;
        List<String> listOfficers = new ArrayList<>();

        for (int i = 0; i < quantityOfficers; i++) {
            System.out.print("Enter id: ");
            id = sc.nextInt();
            System.out.print("Enter salary: ");
            salary = sc.nextDouble();
            System.out.print("Enter name: ");
            name = sc.nextLine();
            sc.nextLine();
            listOfficers.add(String.valueOf(id));
            listOfficers.add(name);
            listOfficers.add(String.valueOf(salary));

        }

        System.out.print("Diga o id do trabalhador: ");
        int idTrabalhador = sc.nextInt();
        System.out.print("Diga a porcentagem: ");
        double percentyInput = sc.nextDouble();
        double percenty = percentyInput / 100;


        if(listOfficers.indexOf(String.valueOf(idTrabalhador)) == -1) {
            System.out.println("id não existe");
        } else {
            int officer = listOfficers.indexOf(String.valueOf(idTrabalhador));
            double salaryOfficerId = Double.parseDouble(listOfficers.get(officer + 2));
            double newSalary = salaryOfficerId + percentyInput / 100 * salaryOfficerId;
            listOfficers.set(officer + 2, String.valueOf(newSalary));
        }
        for (int i = 0; i < quantityOfficers * 3; i++) {
            System.out.println(listOfficers.get(i));
        }

        sc.close();
    }
}