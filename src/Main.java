import java.util.Locale;


public class Main {
    public static void main(String[] args) {
//        int y = 5;
//        double x = 2.5369;
//        System.out.printf("%.2f%n", x);
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.4f%n", x);
//        System.out.println("y: " + y);
//        System.out.printf("Resultado: %.2f metros%n ", x);
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is %.2f\n", product1, price1);
        System.out.printf("%s, which price is %.2f\n \n \n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }
}