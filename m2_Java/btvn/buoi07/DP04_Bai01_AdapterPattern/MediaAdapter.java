package DP04_Bai01_AdapterPattern;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedPlayer;
	
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("mp4")) {
			advancedPlayer = new Mp4Player();
		} else if (audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer = new VlcPlayer();
		}
	}
	
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp4")) {
			System.out.println(fileName);
			advancedPlayer.playMp4(fileName);
		} else if (audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer.playVlc(fileName);
		}
	}
}
