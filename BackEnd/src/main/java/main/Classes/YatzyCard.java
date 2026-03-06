package main.Classes;

import java.util.Objects;

public class YatzyCard {
    private static int nextId = 1;
    public int id;
    public Player player;
    public int ones;
    public int twoes;
    public int threes;
    public int fours;
    public int fives;
    public int sixes;

    public YatzyCard(Player player) {
        this.player = player;
        this.ones = -1;
        this.twoes = -1;
        this.threes = -1;
        this.fours = -1;
        this.fives = -1;
        this.sixes = -1;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getOnes() {
        return ones;
    }

    public void setOnes(int ones) {
        if(this.ones == -1){
            this.ones = ones;
        }
    }

    public int getTwoes() {
        return twoes;
    }

    public void setTwoes(int twoes) {
        if(this.twoes == -1){
            this.twoes = twoes;
        }
    }

    public int getThrees() {
        return threes;
    }

    public void setThrees(int threes) {
        if(this.threes == -1){
            this.threes = threes;
        }
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        if(this.fours == -1){
            this.fours = fours;
        }
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        if(this.fives == -1){
            this.fives = fives;
        }
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        if(this.sixes == -1){
            this.sixes = sixes;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YatzyCard yatzyCard = (YatzyCard) o;
        return id == yatzyCard.id && ones == yatzyCard.ones && twoes == yatzyCard.twoes && threes == yatzyCard.threes && fours == yatzyCard.fours && fives == yatzyCard.fives && sixes == yatzyCard.sixes && Objects.equals(player, yatzyCard.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, player, ones, twoes, threes, fours, fives, sixes);
    }

    @Override
    public String toString() {
        return "YatzyCard{" +
                "id=" + id +
                ", player=" + player +
                ", ones=" + ones +
                ", twoes=" + twoes +
                ", threes=" + threes +
                ", fours=" + fours +
                ", fives=" + fives +
                ", sixes=" + sixes +
                '}';
    }
}