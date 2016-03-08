package chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setArtist( "아이유" );
		song.setTitle( "좋은날" );
		song.setAlbum( "Real" );
		song.setComposer( "이민수" );
		song.setTrack( 3 );
		song.setYear( 2010 );
		
		song.show();

		Song song2 = new Song( "아이유", "좋은날", "Real", "이민수", 3, 2010 );
		song2.show();
		
		Song song3 = new Song( "이사랑", "다비치" );
		Song song4 = new Song( "Always", "윤미래" );
		
	}
}