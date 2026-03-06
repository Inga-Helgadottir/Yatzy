package main.resources;

import main.Classes.Game;
import main.Classes.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class YatzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(YatzyApplication.class, args);
        System.out.println("hoihi");
        Player p = new Player( "string na1me", 454545);
        Player p2 = new Player( "stri2ng name", 22);
        Player p3 = new Player( "stri3ng name", 112);
        List<Player> players = new ArrayList<>();
        players.add(p);
        players.add(p2);
        players.add(p3);
        Game game = new Game(players);
        System.out.println(game);
    }

}
