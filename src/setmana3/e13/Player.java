package setmana3.e13;

public class Player implements Comparable<Player>{
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        if(points > o.getPoints()) return -1;
        else if(points < o.getPoints()) return +1;
        else return 0;
    }
}
