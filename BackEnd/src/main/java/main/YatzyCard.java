package main;
import java.util.List;
import java.util.Objects;

public class YatzyCard {
    public int id;
    public List<Player> players;
    public int ones;
    public int twoes;
    public int threes;
    public int fours;
    public int fives;
    public int sixes;

    public YatzyCard(int id, List<Player> players, int ones, int twoes, int threes, int fours, int fives, int sixes) {
        this.id = id;
        this.players = players;
        this.ones = ones;
        this.twoes = twoes;
        this.threes = threes;
        this.fours = fours;
        this.fives = fives;
        this.sixes = sixes;
    }

    public YatzyCard(List<Player> players) {
        this.id = id;
        this.players = players;
        this.ones = 0;
        this.twoes = 0;
        this.threes = 0;
        this.fours = 0;
        this.fives = 0;
        this.sixes = 0;
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

    public int getOnes() {
        return ones;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }

    public int getTwoes() {
        return twoes;
    }

    public void setTwoes(int twoes) {
        this.twoes = twoes;
    }

    public int getThrees() {
        return threes;
    }

    public void setThrees(int threes) {
        this.threes = threes;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YatzyCard yatzyCard = (YatzyCard) o;
        return id == yatzyCard.id && ones == yatzyCard.ones && twoes == yatzyCard.twoes && threes == yatzyCard.threes && fours == yatzyCard.fours && fives == yatzyCard.fives && sixes == yatzyCard.sixes && Objects.equals(players, yatzyCard.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, players, ones, twoes, threes, fours, fives, sixes);
    }
}