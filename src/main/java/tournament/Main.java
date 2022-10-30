package tournament;

public class Main {


    public static void main(String[] args) {

        Game game = new Game();

        Player player1 = new Player(1, "Hulk", 8);
        Player player2 = new Player(2, "Thor", 5);
        Player player3 = new Player(3, "Thanos", 10);


       game.registration(player1);
       game.registration(player2);
       game.registration(player3);

       game.round("Jack", "Lox");
















    }
}
