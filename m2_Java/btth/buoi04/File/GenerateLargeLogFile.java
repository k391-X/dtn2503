package File;

import java.io.*;
import java.util.Random;

public class GenerateLargeLogFile {
    public static void main(String[] args) {
        String fileName = "application.log";   // Đường dẫn file log muốn tạo
        int numberOfLines = 50_000_000;        // Số lượng dòng log (tùy chọn số lượng dòng lớn)
        
        // Cấu hình thông số log
        String[] logLevels = {"INFO", "WARN", "ERROR"};
        String[] messages = {
            "Application started successfully",
            "Low disk space",
            "NullPointerException occurred",
            "Database connection failed",
            "User login successful",
            "Invalid user credentials",
            "Timeout occurred during network request"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Random rand = new Random();

            for (int i = 0; i < numberOfLines; i++) {
                // Tạo dòng log ngẫu nhiên
                String logLevel = logLevels[rand.nextInt(logLevels.length)];
                String message = messages[rand.nextInt(messages.length)];
                long timestamp = System.currentTimeMillis();

                // Cấu trúc dòng log: [timestamp] [logLevel] message
                String logLine = String.format("[%d] [%s] %s", timestamp, logLevel, message);

                // Ghi vào file
                writer.write(logLine);
                writer.newLine();
                
                if (i % 1_000_000 == 0) {
                    System.out.println("Đã tạo " + (i + 1) + " dòng log...");
                }
            }

            System.out.println("Tạo file log thành công! File được lưu tại: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

