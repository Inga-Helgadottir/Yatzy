package main.DTO;
import main.Classes.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameDTO {
    private static int nextId = 1;
    public int id;
    public List<YatzyCardDTO> yatzyCards;

    public GameDTO(List<YatzyCardDTO> yatzyCard) {
        this.yatzyCards = yatzyCard;
        this.id = nextId;
        nextId++;
    }

    public static List<GameDTO> getDtos(List<Game> games){
        List<GameDTO> gamedtos = new ArrayList<>();
        games.forEach(game -> gamedtos.add(new GameDTO(game)));
        return gamedtos;
    }

    public GameDTO(Game game){
        if(game != null){
            this.id = game.getId();
            this.yatzyCards = YatzyCardDTO.getDtos(game.getYatzyCards());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<YatzyCardDTO> getYatzyCards() {
        return yatzyCards;
    }

    public void setYatzyCards(List<YatzyCardDTO> yatzyCards) {
        this.yatzyCards = yatzyCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameDTO game = (GameDTO) o;
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