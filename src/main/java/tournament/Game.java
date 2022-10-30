package tournament;

import java.util.*;

public class Game {

    private Collection<Player> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public Collection<Player> findAllRegPlayers() {
        return players;
    }

    public void registration(Player player) {
        players.add(player);
    }


    public Collection<Player> findPlayerByName(String name) {
        for (Player player : players) {
            if ((name.equals(player.getName()))) {
            }
            return Collections.singleton(player);
        }
        return null;
    }


    public void round(String name1, String name2) {

        if (findPlayerByName(name1) == null) {
            throw new NotFoundException("Игрок с именем " + name1 + " не зарегистрирован на туринире");

        } else if (findPlayerByName(name2) == null) {
            throw new NotFoundException("Игрок с именем " + name2 + " не зарегистрирован на туринире");
        }


    }


}
