package main.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
    private static int nextId = 1;
    public int id;
    public String name;
    public int highScore;
    public List<YatzyCard> yatzyCards;

    public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
        this.id = nextId;
        nextId++;
        yatzyCards = new ArrayList<>();
    }

    public Player(YatzyCard[] yatzyCards) {
        this.yatzyCards = List.of(yatzyCards);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && highScore == player.highScore && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, highScore);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name=" + name +
                ", highScore=" + highScore +
                '}';
    }
}