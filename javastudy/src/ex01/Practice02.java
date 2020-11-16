package ex01;

class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(this.year+"년"+this.country+"국적의"+this.artist+"가 부른"+this.title);
	}
	
	
	

}
