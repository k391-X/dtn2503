package File;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class LogAnalyzer {

	public static void main(String[] args) {
		String inputFile = "application.log";
		String outputFile = "keyword_frequency.txt";

		int lineCount = 0;

		System.out.println("🔍 Đang đọc file: " + inputFile);

		Map<String, Integer> frequencyMap = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			lineCount++;
			if (lineCount % 100000 == 0) {
				System.out.println("📄 Đã đọc " + lineCount + " dòng...");
			}

			String line;

			while ((line = br.readLine()) != null) {
				// Tách từ theo khoảng trắng + ký tự đặc biệt
				String[] words = line.split("[\\s\\p{Punct}]+");

				for (String word : words) {
					if (!word.isEmpty()) {
						word = word.toLowerCase();
						frequencyMap.put(word, frequencyMap.getOrDefault(words, 0) + 1);
					}
				}
			}

			System.out.println("✅ Đọc xong file. Tổng số dòng: " + lineCount);
			System.out.println("📊 Số lượng từ khác nhau thu thập được: " + frequencyMap.size());

		} catch (IOException e) {
			System.out.println("❌ Lỗi khi đọc file: " + e.getMessage());
			return;
		}

		// Ghi vào file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
				writer.write(entry.getKey() + ": " + entry.getValue());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("❌ Lỗi khi ghi file: " + e.getMessage());
		}

	}

}
