import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int y = 5;
//        double x;

//        x = (int) y + 1;

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.nextLine();
        System.out.println("Você digitou o valor: " + x);
        int b = sc.nextInt();
        System.out.println("Você digitou o valor: " + b);

        String agoraVai;

        agoraVai = sc.nextLine();
        System.out.println("Você digitou: " + agoraVai);
        sc.close();

    }
}