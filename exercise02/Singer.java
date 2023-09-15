package exercise02;

public class Singer {
    // fields
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;

    // constructor
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }

    // methods
    public void performForAudience(int noOfPeople) {
        noOfPerformances++;
        earnings += noOfPeople * 100;
    }

    public void changeFavSong(Song song) {
        favoriteSong = song;
    } 

    // getters
    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }
}