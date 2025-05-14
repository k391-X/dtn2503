package LogServer;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class LogAnalyzer {
    public static void main(String[] args) {
        String inputFile = "server.log";  // File log đầu vào
        String outputFile = "log_report.txt";  // File báo cáo đầu ra

        // Lưu trữ số lần xuất hiện của các sự kiện
        Map<String, Integer> eventCounts = new HashMap<>();
        List<Long> infoTimestamps = new ArrayList<>();
        List<Long> errorTimestamps = new ArrayList<>();

        // Đọc file log và phân tích
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Phân tích dòng log theo định dạng
                String[] parts = line.split(" ", 3);  // Chia thành timestamp, log level và message

                if (parts.length < 3) continue;  // Nếu dòng không hợp lệ, bỏ qua

                String timestamp = parts[0] + " " + parts[1];  // timestamp format: yyyy-MM-dd HH:mm:ss
                String logLevel = parts[2].split(" ")[0];  // INFO, ERROR, WARN
                String message = parts[2].substring(logLevel.length()).trim();  // Message sau log level

                // Chuyển timestamp thành thời gian tính bằng miliseconds
                long timestampMillis = convertToTimestampMillis(timestamp);

                // Đếm số lần xuất hiện của mỗi sự kiện
                eventCounts.put(logLevel, eventCounts.getOrDefault(logLevel, 0) + 1);

                // Tính thời gian giữa các sự kiện INFO và ERROR
                if (logLevel.equals("INFO")) {
                    infoTimestamps.add(timestampMillis);
                } else if (logLevel.equals("ERROR")) {
                    errorTimestamps.add(timestampMillis);
                }
            }

            // Tính thời gian trung bình giữa các sự kiện INFO và ERROR
            long totalDuration = 0;
            int count = 0;
            for (int i = 0; i < Math.min(infoTimestamps.size(), errorTimestamps.size()); i++) {
                totalDuration += Math.abs(infoTimestamps.get(i) - errorTimestamps.get(i));
                count++;
            }

            long averageDuration = (count > 0) ? totalDuration / count : 0;

            // Ghi kết quả vào file báo cáo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write("Báo cáo thống kê log:\n");
                writer.write("Sự kiện INFO: " + eventCounts.getOrDefault("INFO", 0) + " lần\n");
                writer.write("Sự kiện ERROR: " + eventCounts.getOrDefault("ERROR", 0) + " lần\n");
                writer.write("Sự kiện WARN: " + eventCounts.getOrDefault("WARN", 0) + " lần\n");
                writer.write("Thời gian trung bình giữa INFO và ERROR: " + formatDuration(averageDuration) + "\n");
                writer.write("📁 Kết quả lưu tại: " + outputFile);
                System.out.println("✅ Báo cáo đã được ghi vào " + outputFile);
            }

        } catch (IOException e) {
            System.out.println("❌ Có lỗi xảy ra khi đọc hoặc ghi file:");
            e.printStackTrace();
        }
    }

    // Hàm chuyển đổi timestamp sang millis
    private static long convertToTimestampMillis(String timestamp) {
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = format.parse(timestamp);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Hàm định dạng thời gian từ millis sang "HH:mm:ss"
    private static String formatDuration(long durationMillis) {
        long hours = TimeUnit.MILLISECONDS.toHours(durationMillis);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(durationMillis) - TimeUnit.HOURS.toMinutes(hours);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(durationMillis) - TimeUnit.MINUTES.toSeconds(minutes) - TimeUnit.HOURS.toSeconds(hours);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
