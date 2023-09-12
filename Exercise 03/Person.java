package exercise03;

public class Person {
    // fields
    private String name;
    private int age;
    private double money;
    private double earningsPerHour;
    private String favGenre;

    //constructors
    public Person(String name, int age, double money, double earningsPerHour, String genre) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.earningsPerHour = earningsPerHour;
        this.favGenre = genre;
    }

    //methods
    public void work(int hours) {
        money += (earningsPerHour * hours);
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public double getEarningsPerHour() {
        return earningsPerHour;
    }

    public String getFavGenre() {
        return favGenre;
    }

    // setters
    public void setFavGenre(String genre) {
        favGenre = genre;
    }
}