package DP04_Bai01_AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {
	public void playMp4(String fileName) {
		// Khong ho tro
	}

	public void playVlc(String fileName) {
		System.out.println("Playing vlc file: " + fileName);
	}
}
