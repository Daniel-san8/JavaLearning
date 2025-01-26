import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();

        try {
            System.out.println(vect[position]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}