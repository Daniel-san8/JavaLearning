import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int code = sc.nextInt();


        while (code != 4) {

            if(code == 1) alcool++;
            if(code == 2) gasolina++;
            if(code == 3) diesel++;

            code = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}