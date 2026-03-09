package main;

import main.Classes.Player;
import main.Classes.YatzyCard;
import main.functionalities.DiceFunctionality;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class YatzyApplication {

    private static DiceFunctionality diceFunctionality;

    public YatzyApplication(DiceFunctionality diceFunctionality) {
        YatzyApplication.diceFunctionality = diceFunctionality;
    }

    public static void main(String[] args) {
        SpringApplication.run(YatzyApplication.class, args);

        System.out.println("-------------------------OUTPUT-------------------------");
        List<Integer> diceThrow = new ArrayList<>();
        diceThrow.add(3);
        diceThrow.add(3);
        diceThrow.add(3);

    }
}


//        List<Integer> diceThrow = new ArrayList<>();
//        diceThrow.add(5);
//        diceThrow.add(2);
//        diceThrow.add(3);
//        diceThrow.add(3);
//        diceThrow.add(3);
//        diceThrow.add(6);


//Player p = new Player("Sarah");
//YatzyCard yc = new YatzyCard(p);
//        yc.setOnes(2);
//        yc.setTwoes(4);
//        System.out.println(yc.toStringCard());