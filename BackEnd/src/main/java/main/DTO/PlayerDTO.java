package main.DTO;
import main.Classes.Player;
import java.util.Objects;

public class PlayerDTO {
    public int id;
    public String name;

    public PlayerDTO(Player player){
        if(player != null){
            this.id = player.getId();
            this.name = player.getName();
         }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerDTO player = (PlayerDTO) o;
        return id == player.id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name=" + name +
                "}";
    }
}