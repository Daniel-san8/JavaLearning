import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.next();
        Map<String, Integer> list = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] listSplit = line.split(",");
                int nextValue = Integer.parseInt(listSplit[1]);
                int value = list.get(listSplit[0]) != null ? list.get(listSplit[0]) : 0;
                list.put(listSplit[0], (nextValue + value));
                line = br.readLine();
            }
            System.out.println(list);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}