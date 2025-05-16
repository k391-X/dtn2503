package Bai03_EnumSingleton;

public enum DatabaseConnection {
	INSTANCE; // Chi co mot instance duy nhat
	
	// Vi du mo phong ket noi toi database
	private boolean connected = false;
	
	public void connect() {
		if (!connected) {
			// Gia lap ket noi
			System.out.println("Connecting to database ... ");
			connected = true;
		} else {
			System.out.println("Already connected");
		}
	}
	
	public void disconnect() {
		if (connected) {
			System.out.println("Disconnecting from database ...");
			connected = false;
		} else {
			System.out.println("Already disconnected");
		}
	}
	
	public boolean isConnected() {
		return connected;
	}
}
