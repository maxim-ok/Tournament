package tournament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class GameTest {


    Game game = new Game();

    Player player1 = new Player(1, "Hulk", 8);
    Player player2 = new Player(2, "Thor", 5);
    Player player3 = new Player(3, "Thanos", 10);
    Player player4 = new Player(4, "CapAmerica", 5);
    Player player5 = new Player(5, "Superman", 5);

   /* @Test
    public void shouldFindAllRegPlayers() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);


        game.findAllRegPlayers();

       // String[] key = hashMap.keySet().toArray(new String[0]);

        Map<String, Player> actual = game.findAllRegPlayers();
        String[] act = actual.keySet().toArray(new String[0]);
        Player[] expected = {player1, player2, player3, player4, player5};


        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(act));


        assertArrayEquals(expected, act);



    }*/

    @Test
    public void shouldFindByName() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);

        game.findPlayerByName("Hulk");

        String actual = game.findPlayerByName("Hulk");
        String expected = "Hulk";

        assertEquals(expected, actual);
    }


    @Test
    public void shouldReturnWinner1() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);

        game.round("Thanos", "Thor");

        int actual = game.round("Thanos", "Thor");
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnWinner2() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);

        game.round("Thor", "Thanos");

        int actual = game.round("Thor", "Thanos");
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnDraw() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);

        game.round("Superman", "Thor");

        int actual = game.round("Superman", "Thor");
        int expected = 0;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldReturnException1() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);

        assertThrows(NotFoundException.class, () -> {
            game.round("TonyStark", "Thor");
        });
    }

    @Test
    public void shouldReturnException2() {

        game.registration(player1);
        game.registration(player2);
        game.registration(player3);
        game.registration(player4);
        game.registration(player5);

        assertThrows(NotFoundException.class, () -> {
            game.round("Thor", "TonyStark");
        });
    }





}


