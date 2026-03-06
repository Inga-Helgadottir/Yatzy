package main;

import java.util.Objects;

public class Player {
    public int id;
    public String name;
    public int highScore;

    public Player(int id, String name, int highScore) {
        this.id = id;
        this.name = name;
        this.highScore = highScore;
    }

    public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
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