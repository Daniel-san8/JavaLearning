import java.util.InputMismatchException;
import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");

        try {
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inexistente");
        } catch (InputMismatchException err) {
            System.out.println("Escolha o índice a partir de um número");
        }
        sc.close();
    }
}