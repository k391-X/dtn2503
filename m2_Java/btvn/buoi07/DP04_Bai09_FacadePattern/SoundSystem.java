package DP04_Bai07_FacadePattern;

public class SoundSystem {
	public void on() {
		System.out.println("Hệ thống âm thanh bật");
	}

	public void setVolume(int level) {
		System.out.println("Âm lượng được đặt ở mức: " + level);
	}
	
	public void off() {
		System.out.println("Hệ thống âm thanh tắt");
	}
}
