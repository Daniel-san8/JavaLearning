import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            vect[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(vect[i] < 0) {
                System.out.println("numeros negativos: " + vect[i]);
            }
        }

        sc.close();
    }
}