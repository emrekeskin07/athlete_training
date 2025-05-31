public class VolleyballPlayer extends Player {
    private int blocks;
    private int points;

    public VolleyballPlayer() {
        super();
        this.blocks = 0;
        this.points = 0;
    }

    public VolleyballPlayer(String name, String position, String team, int blocks, int points) {
        super(name, position, team);
        this.blocks = blocks;
        this.points = points;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", energy=" + energy +
                ", blocks=" + blocks +
                ", points=" + points +
                '}';
    }

    @Override
    public void doTraining() {

        energy -= 30;
        if (energy < 0) {
            energy = 0;
        }
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
