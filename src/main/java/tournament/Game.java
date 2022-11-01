package tournament;

import java.util.*;

public class Game {

    private List<Player> players = new ArrayList<>();


    public List<Player> findAllRegPlayers() {
        return players;
    }

    public void registration(Player player) {
        players.add(player);
    }


    public int findPlayerByName(String name) {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (player.getName().equals(name)) {
                return i;
            }

        }
        return -1;
    }


    public int round(String name1, String name2) {

        int playerNum1 = findPlayerByName(name1);
        int playerNum2 = findPlayerByName(name2);


        if (findPlayerByName(name1) == -1 || findPlayerByName(name2) == -1) {
            throw new NotFoundException("Игрок с именем " + name1 + " не зарегистрирован на турнире");
        }

        int strengthPlayer1 = players.get(playerNum1).getStrength();
        int strengthPlayer2 = players.get(playerNum2).getStrength();

        if (strengthPlayer1 == strengthPlayer2) {

            return 0;
        }
        if (strengthPlayer1 > strengthPlayer2) {
            return 1;

        }
        return 2;


    }


}
