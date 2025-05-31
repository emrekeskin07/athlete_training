public abstract class Player {

    protected String name;
    protected String position;
    protected String team;
    protected int energy;

    public Player() {
        this.name = "";
        this.position = "";
        this.team = "";
        this.energy = 100;
    }

    public Player(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.energy = 100;
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', position='" + position + "', team='" + team + "', energy=" + energy + "}";
    }

    public abstract void doTraining();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Player))
            return false;
        Player other = (Player) obj;
        return this.name.equals(other.name) && this.position.equals(other.position)
                && this.team.equals(other.team) && this.energy == other.energy;
    }
}
