package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Xin chào! Đây là dòng đầu tiên.\n");
            writer.write("Đây là dòng thứ hai.");
            writer.close();
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}