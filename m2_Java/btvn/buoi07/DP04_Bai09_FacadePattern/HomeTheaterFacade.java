package DP04_Bai07_FacadePattern;

public class HomeTheaterFacade {
	private DVDPlayer dvd;
	private Projector projector;
	private SoundSystem sound;
	
	public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
		this.dvd = dvd;
		this.projector = projector;
		this.sound = sound;
	}
	
	public void watchMovie(String movie) {
		System.out.println("🎬 Chuẩn bị xem phim...");
		projector.on();
		projector.setWideScreen();
		sound.on();
		sound.setVolume(8);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("🛑 Dừng xem phim...");
		dvd.off();
		sound.off();
		projector.off();
	}
}
