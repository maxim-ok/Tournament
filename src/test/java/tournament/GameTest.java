package tournament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GameTest {


    Game game = new Game();

    Player player1 = new Player(1, "Hulk", 8);
    Player player2 = new Player(2, "Thor", 5);
    Player player3 = new Player(3, "Thanos", 10);
    Player player4 = new Player(4, "CapAmerica", 5);

    @Test
    public void shouldFindAllRegPlayers() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);

        game.findAllRegPlayers();

        Collection<Player> actual = game.findAllRegPlayers();
        Player[] expected = {player1, player2, player3, player4};

        System.out.println(actual.toString());
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected, actual.toArray());

    }

    @Test
    public void shouldFindByName() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);

        game.findPlayerByName("Hulk");

        Collection<Player> actual = game.findPlayerByName("Hulk");
        Player[] expected = {player1};

        System.out.println(actual.toString());
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected, actual.toArray());
    }





}


