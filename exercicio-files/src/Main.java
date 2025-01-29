import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "arquivo.csv";

        try (BufferedReader file = new BufferedReader(new FileReader(path));){
            String line = file.readLine();
            while (line != null) {
                List<String> lineArr = line.split(",");
                System.out.println();

                line = file.readLine();
            }

        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
}