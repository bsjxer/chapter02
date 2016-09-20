package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	public Song(){
	}
	
	public Song( String artist, String title ){
		this( null, artist, null, title, null, 0 );
		
	}
	
	public Song( String album, String artist, String composer, String title, String track, int year ) { //"Real", "아이유", "이민수", "좋은날", 3, 2010
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.title = title;
		this.track = track;
		this.year = year;
		System.out.println( "새 노래를 추가하였습니다.");
	}
	
	

	public void show() {
		System.out.println(
				artist + " " +
				title + " (" +
				album + ", " +
				year + ", " +
				track + ", " +
				composer + ")");
	}
	
}
