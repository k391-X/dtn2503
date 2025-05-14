package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVExample {
    public static void main(String[] args) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            br.readLine(); // Bỏ qua dòng tiêu đề
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double score = Double.parseDouble(parts[2]);

//                if (score >= 8.0) {
                    System.out.println(id + " - " + name + " - " + score);
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
