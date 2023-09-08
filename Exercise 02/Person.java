package exercise02;

public class Person {
    private String name;
    private String favGenre;

    public String getName() {
        return name;
    }

    public String getFavGenre() {
        return favGenre;
    }

    public void setName(String name, String genre) {
        this.name = name;
        this.favGenre = genre;
    }
}