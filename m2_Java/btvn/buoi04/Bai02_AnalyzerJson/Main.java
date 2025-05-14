package Json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "users.json";
        String outputFile = "filtered_users.csv";

        try (
            BufferedWriter csvWriter = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Ghi header cho CSV
            csvWriter.write("Name,Age,Address,Email");
            csvWriter.newLine();

            // Setup parser JSON
            JsonFactory factory = new JsonFactory();
            JsonParser parser = factory.createParser(new File(inputFile));
            ObjectMapper mapper = new ObjectMapper();

            if (parser.nextToken() != JsonToken.START_ARRAY) {
                System.out.println("❌ File JSON không bắt đầu bằng một mảng!");
                return;
            }

            int count = 0;

            // Đọc từng user trong mảng
            while (parser.nextToken() == JsonToken.START_OBJECT) {
                User user = mapper.readValue(parser, User.class);

                if (user.getAge() > 30) {
                    csvWriter.write(String.format("%s,%d,%s,%s",
                        user.getName(), user.getAge(), user.getAddress(), user.getEmail()));
                    csvWriter.newLine();
                    count++;
                }

                if (count % 10000 == 0 && count != 0) {
                    System.out.println("🔄 Đã lọc được " + count + " người dùng...");
                }
            }

            parser.close();
            System.out.println("✅ Đã hoàn thành! Tổng số người dùng thỏa điều kiện: " + count);
            System.out.println("📁 Kết quả lưu tại: " + outputFile);
        } catch (IOException e) {
            System.out.println("❌ Có lỗi xảy ra:");
            e.printStackTrace();
        }
    }
}
