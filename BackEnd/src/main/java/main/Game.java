package main;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Game {
    public int id;
    public Player[] players;

    public Game(int id, Player[] players) {
        this.id = id;
        this.players = players;
    }

    public Game(List<Player> players) {
        this.players = players.toArray(new Player[0]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && Objects.deepEquals(players, game.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Arrays.hashCode(players));
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", players=" + Arrays.toString(players) +
                '}';
    }
}