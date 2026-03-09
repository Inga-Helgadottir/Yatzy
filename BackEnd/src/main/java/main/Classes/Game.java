package main.Classes;

import java.util.List;
import java.util.Objects;

public class Game {
    private static int nextId = 1;
    public int id;
    public List<YatzyCard> yatzyCards;

    public Game(List<YatzyCard> yatzyCard) {
        this.yatzyCards = yatzyCard;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<YatzyCard> getYatzyCards() {
        return yatzyCards;
    }

    public void setYatzyCards(List<YatzyCard> yatzyCards) {
        this.yatzyCards = yatzyCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && Objects.equals(yatzyCards, game.yatzyCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yatzyCards);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", yatzyCard=" + yatzyCards +
                "}";
    }
}