package main.resources;

import main.Classes.Game;
import main.Classes.Player;
import main.Classes.YatzyCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class YatzyApplication {

    public static void main(String[] args) {
        SpringApplication.run(YatzyApplication.class, args);
        System.out.println("-------------------------OUTPUT-------------------------");
        Player p = new Player( "string na1me");
        Player p2 = new Player( "stri2ng name");
        Player p3 = new Player( "stri3ng name");
        YatzyCard yc = new YatzyCard(p);
        YatzyCard yc2 = new YatzyCard(p2);
        YatzyCard yc3 = new YatzyCard(p3);
        List<YatzyCard> yatzyCards = new ArrayList<>();
        yatzyCards.add(yc);
        yatzyCards.add(yc2);
        yatzyCards.add(yc3);
        Game game = new Game(yatzyCards);
        yc.setOnes(1);
        yc.setOnes(5);
        System.out.println(game.getYatzyCards());
        System.out.println(yc.getOnes());
    }

}
