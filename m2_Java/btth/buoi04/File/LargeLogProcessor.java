package File;
import java.io.*;

public class LargeLogProcessor {
    public static void main(String[] args) {
        File inputFile = new File("application.log");     // File ~4GB
        File outputFile = new File("error.log");          // Ghi lỗi ra đây

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile), 16 * 1024);  // Buffer 16KB
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            long totalLines = 0;
            long matchedLines = 0;

            while ((line = reader.readLine()) != null) {
                totalLines++;

                if (line.contains("ERROR")) {
                    writer.write(line);
                    writer.newLine();
                    matchedLines++;
                }

                // In tiến trình mỗi 1 triệu dòng
                if (totalLines % 1_000_000 == 0) {
                    System.out.println("Đã xử lý: " + totalLines + " dòng...");
                }
            }

            System.out.println("✔ Tổng dòng: " + totalLines);
            System.out.println("✔ Dòng chứa ERROR: " + matchedLines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
