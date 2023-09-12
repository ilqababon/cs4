package exercise03;

public class Exercise03 {
    public static void main(String[] args) {
        Person iris = new Person("Iris", 15, 10000.0, 100.0, "Rock");
        Person xangel = new Person("Xangel", 15, 5000.0, 200.0, "OPM");
        Person manu = new Person("Manu", 15, 20000.0, 50.0, "Indie");

        Song unexpectedly = new Song("Unexpectedly", 703112, "Indie", 264);
        Song cologne = new Song("Cologne", 34533010, "Rock", 164);

        Singer megumi = new Singer("Megumi Acorda", 5000, 50000.0, unexpectedly);
        megumi.performForAudience(12);
        megumi.changeFavSong(cologne);

        // add singer and test other performForAudience method
        Singer beabadoobee = new Singer("Beabadoobee", 8000, 75000.0, cologne);
        beabadoobee.performForAudience(megumi, 5);
    }
}