import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String path = "summary.csv";
        String[] vectLines;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                vectLines = line.split(",");
                System.out.println(Arrays.toString(vectLines));
                line = br.readLine();
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}