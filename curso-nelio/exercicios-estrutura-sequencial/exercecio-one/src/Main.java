import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int soma = numberOne + numberTwo;
        System.out.println("A soma é: " + soma);
    }
}