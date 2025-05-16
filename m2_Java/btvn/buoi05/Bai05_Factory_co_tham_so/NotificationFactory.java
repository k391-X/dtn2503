package Bai05_Factory_co_tham_so;

public class NotificationFactory {
	public static Notification createNotification(String type) {
		if (type == null) {
			throw new IllegalArgumentException("Notification type must not be null");
		}

		switch (type.toUpperCase()) {
		case "EMAIL":
			return new EmailNotification();
		case "SMS":
			return new SMSNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknow notification type: " + type);
		}
	}
}
