package Json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateUsersJson {
    public static void main(String[] args) {
        String fileName = "users.json";
        int totalUsers = 100_000; // Bạn có thể tăng lên 1_000_000 hoặc hơn

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("[\n");

            for (int i = 0; i < totalUsers; i++) {
                int age = 20 + (i % 50); // Tuổi từ 20 đến 69
                String userJson = String.format(
                    "  {\"name\": \"User%d\", \"age\": %d, \"address\": \"Address %d\", \"email\": \"user%d@example.com\"}",
                    i, age, i, i
                );

                writer.write(userJson);
                if (i < totalUsers - 1) {
                    writer.write(",\n");
                } else {
                    writer.write("\n");
                }
            }

            writer.write("]");
            System.out.println("✅ Tạo file users.json thành công với " + totalUsers + " người dùng.");
        } catch (IOException e) {
            System.out.println("❌ Lỗi khi tạo file:");
            e.printStackTrace();
        }
    }
}