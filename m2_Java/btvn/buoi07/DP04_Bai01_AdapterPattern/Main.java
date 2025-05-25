package DP04_Bai01_AdapterPattern;

public class Main {

	public static void main(String[] args) {
		MediaPlayer player = new NewAudioPlayer();
		
		player.play("mp3", "song.mp3");
		player.play("mp4", "video.mp4");
		player.play("vlc", "movie.vlc");
		player.play("avi", "film.avi");  // Khong ho tro
	}

}
