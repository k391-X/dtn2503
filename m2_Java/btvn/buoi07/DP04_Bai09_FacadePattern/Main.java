package DP04_Bai07_FacadePattern;

public class Main {

	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();
		Projector projector = new Projector();
		SoundSystem sound = new SoundSystem();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);
		
		homeTheater.watchMovie("Avenger: Endgame");
		System.out.println("----------");
		homeTheater.endMovie();
	}

}
