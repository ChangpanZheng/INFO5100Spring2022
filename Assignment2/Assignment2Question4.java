import java.util.Comparator;

public class Assignment2Question4 {
    public static void main(String[] args) {

    }
}

class Player {
    private String name;
    private int score;

    public Player() {
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() == o2.getScore()) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o2.getScore() - o1.getScore();
        }
    }
}
