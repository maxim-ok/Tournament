package tournament;

import java.util.*;

public class Game {

    protected Map<String, Player > players = new HashMap<>();


    public Map<String, Player > findAllRegPlayers() {
        return players;

    }

    public void registration(Player player) {
        players.put(player.getName(), player);
    }


    public String findPlayerByName(String name) {
        if (players.get(name).equals(name)) {

        }return name;
    }



    public int round(String name1, String name2) {

       Player player1 = players.get(name1);
       Player player2 = players.get(name2);

        int strengthPlayer1 = player1.getStrength();
        int strengthPlayer2 = player2.getStrength();

        if (strengthPlayer1 == strengthPlayer2) {

            return 0;
        }
        if (strengthPlayer1 > strengthPlayer2) {
            return 1;

        }
        return 2;


    }


}
