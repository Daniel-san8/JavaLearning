import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cordX = sc.nextInt();
        int cordY = sc.nextInt();

        while (cordX != 0 && cordY != 0) {
            boolean quadranteOne = cordX > 0 && cordY > 0;
            boolean quadranteTwo = cordX < 0 && cordY > 0;
            boolean quadranteThree = cordX < 0 && cordY < 0;
            boolean quadranteFour = cordX > 0 && cordY < 0;

            if(quadranteOne) {
                System.out.println("primeiro");
            }
            if(quadranteTwo) {
                System.out.println("segundo");
            }
            if(quadranteThree) {
                System.out.println("terceiro");
            }
            if(quadranteFour) {
                System.out.println("quarto");
            }

            cordX = sc.nextInt();
            cordY = sc.nextInt();
        }

        sc.close();
    }
}