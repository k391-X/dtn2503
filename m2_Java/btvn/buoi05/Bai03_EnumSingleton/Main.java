package Bai03_EnumSingleton;

public class Main {

	public static void main(String[] args) {
		// Goi lan 1 
		DatabaseConnection conn1 = DatabaseConnection.INSTANCE;
		conn1.connect();
		
		// Goi lan 2
		DatabaseConnection conn2 = DatabaseConnection.INSTANCE;
		conn2.connect();
		
		System.out.println("Cung instance: " + (conn1 == conn2));
		System.out.println("Trang thai ket noi: " +conn2.isConnected());
		
		// Ngat ket noi
		conn1.disconnect();

	}

}
