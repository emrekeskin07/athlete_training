public class Demo {
    public static void main(String[] args) {

        Player[] players = new Player[4];

        FootballPlayer footballPlayer1 = new FootballPlayer("Cristiano", "Forward", "Al Nasr", 99, 15);
        FootballPlayer footballPlayer2 = new FootballPlayer("Emre", "Midfield", "Real Madrid", 85, 20);
        VolleyballPlayer volleyballPlayer1 = new VolleyballPlayer("Sude", "Blocker", "Beşiktaş", 80, 4);
        VolleyballPlayer volleyballPlayer2 = new VolleyballPlayer("Tuğberk", "Hitter", "Vakıfbank", 75, 4);

        players[0] = footballPlayer1;
        players[1] = footballPlayer2;
        players[2] = volleyballPlayer1;
        players[3] = volleyballPlayer2;

        System.out.println("");
        System.out.println("Before  training:");
        for (Player player : players) {
            System.out.println(player.toString());
        }

        for (Player player : players) {
            player.doTraining();
        }
        System.out.println("");
        System.out.println("After training:");

        for (Player player : players) {
            System.out.println(player.toString());
        }
    }
}
