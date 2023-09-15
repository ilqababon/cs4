package exercise03;

public class Singer {
    // fields
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;

    private static int totalPerformances = 0;

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
        totalPerformances++;
        earnings += noOfPeople * 100.0;
    }

    public void performForAudience(Singer otherSinger, int noOfPeople) {
        noOfPerformances++;
        otherSinger.noOfPerformances++;
        totalPerformances++;
        earnings += noOfPeople * 50.0;
        otherSinger.earnings += noOfPeople * 50.0;
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

    public static int getTotalPerformances() {
        return totalPerformances;
    }
}