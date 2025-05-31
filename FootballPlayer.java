public class FootballPlayer extends Player {
    private int assists;
    private int goals;

    public FootballPlayer() {
        super();
        this.assists = 0;
        this.goals = 0;
    }

    public FootballPlayer(String name, String position, String team, int assists, int goals) {
        super(name, position, team);
        this.assists = assists;
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", energy=" + energy +
                ", assists=" + assists +
                ", goals=" + goals +
                '}';
    }

    @Override
    public void doTraining() {

        energy -= 50;
        if (energy < 0) {
            energy = 0;
        }
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
