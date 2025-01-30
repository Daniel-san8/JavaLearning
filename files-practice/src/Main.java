import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String path = "summary.csv";
        String[] vectLines;
        List<String> listString;


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            BufferedWriter newFile = new BufferedWriter(new FileWriter("asummary.csv", true));
            while ((line = br.readLine()) != null) {
                listString = new ArrayList<>();
                vectLines = line.split(",");
                double valueProduct = Double.parseDouble(vectLines[1]) * Double.parseDouble(vectLines[2]);
                vectLines[1] = String.valueOf(valueProduct);
                listString.add(vectLines[0]);
                listString.add(vectLines[1]);
                newFile.write(String.join(",", listString));
                newFile.newLine();
            }
            newFile.flush();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}