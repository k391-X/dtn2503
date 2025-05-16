package Bai06_Mo_rong_Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {
	private static final Map<String, Supplier<Product>> registry = new HashMap<>();

	// Dang ki vao lop factory
	public static void register(String type, Supplier<Product> supplier) {
		registry.put(type.toLowerCase(), supplier);
	}

	// Tao doi tuong tu factory
	public static Product create(String type) {
		Supplier<Product> supplier = registry.get(type.toLowerCase());

		if (supplier == null) {
			throw new IllegalArgumentException("No product registered for type: " + type);
		}

		return supplier.get();
	}
}
