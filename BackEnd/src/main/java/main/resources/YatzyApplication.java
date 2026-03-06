package main.resources;

import main.Game;
import main.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class YatzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(YatzyApplication.class, args);
        System.out.println("hoihi");
        Player p = new Player(1, "string na1me", 454545);
        Player p2 = new Player(2, "stri2ng name", 22);
        Player p3 = new Player(3, "stri3ng name", 112);
        List<Player> players = new ArrayList<>();
        players.add(p);
        players.add(p2);
        players.add(p3);
        Game game = new Game(players);
        System.out.println(game);
    }

}
