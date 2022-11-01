package tournament;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Objects;

public class Player implements Comparable<Player> {


    private int id;
    private String name;
    private int strength;


    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && strength == player.strength && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, strength);
    }

    public int getStrength() {
        return strength;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public String toString() {
        return name;

    }



    @Override
    public int compareTo(Player playerStrength) {
        if (strength < playerStrength.strength) {
            return 1;

        }
        if (strength > playerStrength.strength) {
            return 2;

        }
        return 0;


    }
}

