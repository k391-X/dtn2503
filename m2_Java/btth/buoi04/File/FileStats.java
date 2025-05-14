package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
                charCount += line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Số dòng: " + lineCount);
        System.out.println("Số từ: " + wordCount);
        System.out.println("Số ký tự: " + charCount);
    }
}
