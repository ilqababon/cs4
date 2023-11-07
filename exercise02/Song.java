package exercise02;

public class Song {
    private String title;
    private int noOfListens;
    private String genre;
    private int length; // in seconds

    // constructor
    public Song(String title, int noOfListens, String genre, int length) {
        this.title = title;
        this.noOfListens = noOfListens;
        this.genre = genre;
        this.length = length;
    }

    // methods
    public void addListens(int newListens) {
        noOfListens += newListens;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public int getNoOfListens() {
        return noOfListens;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }
}