import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int newNumber = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 1; i < n; i++) {

            if(newNumber < 10 || newNumber > 20) {
                out++;
            } else {
                in++;
            }
            newNumber = sc.nextInt();
        }

        System.out.println("in: " + in);
        System.out.println("out: " + out);
    }
}