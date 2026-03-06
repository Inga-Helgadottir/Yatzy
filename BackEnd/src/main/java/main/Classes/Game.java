package main.Classes;

import java.util.List;
import java.util.Objects;

public class Game {
    private static int nextId = 1;
    public int id;
    public List<YatzyCard> yatzyCard;

    public Game(List<YatzyCard> yatzyCard) {
        this.yatzyCard = yatzyCard;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<YatzyCard> getPlayers() {
        return yatzyCard;
    }

    public void setPlayers(List<YatzyCard> yatzyCard) {
        this.yatzyCard = yatzyCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && Objects.equals(yatzyCard, game.yatzyCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yatzyCard);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", players=" + yatzyCard +
                '}';
    }
}