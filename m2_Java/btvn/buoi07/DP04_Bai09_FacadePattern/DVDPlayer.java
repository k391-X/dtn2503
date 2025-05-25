package DP04_Bai07_FacadePattern;

public class DVDPlayer {
	public void on() {
		System.out.println("DVD Player bật");
	}

	public void play(String movie) {
		System.out.println("Đang chạy phim: " + movie);
	}
	
	public void off() {
		System.out.println("DVD Player tắt");
	}
}
