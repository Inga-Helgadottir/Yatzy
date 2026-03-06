package main.Classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Game {
    private static int nextId = 1;
    public int id;
    public List<Player> players;

    public Game(List<Player> players) {
        this.players = players;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && Objects.equals(players, game.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, players);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", players=" + players +
                '}';
    }
}