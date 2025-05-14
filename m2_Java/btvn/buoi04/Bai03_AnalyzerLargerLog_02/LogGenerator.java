package LogServer;

import java.io.*;
import java.text.*;
import java.util.*;

public class LogGenerator {
    public static void main(String[] args) {
        String outputFile = "server.log";  // File log giả lập
        int logCount = 100;  // Số lượng log bạn muốn tạo ra

        // Các mức độ log
        String[] logLevels = {"INFO", "ERROR", "WARN"};
        Random random = new Random();

        // Tạo file log giả lập
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < logCount; i++) {
                String logLevel = logLevels[random.nextInt(logLevels.length)];
                String timestamp = generateTimestamp();
                String message = generateLogMessage(logLevel);

                // Ghi dòng log vào file
                writer.write(timestamp + " " + logLevel + " " + message + "\n");
            }

            System.out.println("✅ File log đã được tạo tại: " + outputFile);
        } catch (IOException e) {
            System.out.println("❌ Có lỗi xảy ra khi tạo file log:");
            e.printStackTrace();
        }
    }

    // Hàm tạo timestamp ngẫu nhiên (theo định dạng yyyy-MM-dd HH:mm:ss)
    private static String generateTimestamp() {
        long currentTime = System.currentTimeMillis();
        long randomTime = currentTime - (long)(Math.random() * 1000000000L); // Random thời gian trong 1 khoảng
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date(randomTime));
    }

    // Hàm tạo thông điệp log ngẫu nhiên
    private static String generateLogMessage(String logLevel) {
        String[] infoMessages = {
            "User logged in.",
            "User logged out.",
            "Data updated successfully.",
            "Page loaded.",
            "New user registration."
        };

        String[] errorMessages = {
            "Server error occurred.",
            "Database connection failed.",
            "Timeout error.",
            "File not found.",
            "Permission denied."
        };

        String[] warnMessages = {
            "Low disk space.",
            "High memory usage.",
            "API call failed.",
            "Deprecated method used.",
            "Possible security risk detected."
        };

        switch (logLevel) {
            case "ERROR":
                return errorMessages[(int)(Math.random() * errorMessages.length)];
            case "WARN":
                return warnMessages[(int)(Math.random() * warnMessages.length)];
            default:
                return infoMessages[(int)(Math.random() * infoMessages.length)];
        }
    }
}

