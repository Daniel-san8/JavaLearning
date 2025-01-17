import java.util.Locale;
import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float pi = 3.14159f;
        float precisaoA = sc.nextFloat();
        float precisaoB = sc.nextFloat();
        float precisaoC = sc.nextFloat();

        float areaTrianguloRetangulo = (precisaoA * precisaoC) / 2;
        float areaCirculo = (float) Math.pow(precisaoC, 2) * pi;
        float areaTrapezio = ((precisaoA + precisaoB) * precisaoC) / 2;
        float areaQuadrado = (float) Math.pow(precisaoB, 2);
        float areaRetangulo = precisaoA * precisaoB;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}