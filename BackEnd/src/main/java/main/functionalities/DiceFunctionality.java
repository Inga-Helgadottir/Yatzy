package main.functionalities;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DiceFunctionality {

    public List<Integer> throwDice(int numberOfDice){
        List<Integer> throwResult = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < numberOfDice; i++) {
            throwResult.add(r.nextInt(6) + 1);
        }
        return throwResult;
    }

    public int countNumberInDiceThrow(List<Integer> diceThrow, int numberToCheckFor){
        int numberCount = 0;
        for(int i = 0; i < diceThrow.size(); i++){
            if(diceThrow.get(i) == numberToCheckFor){
                numberCount++;
            }
        }
        return numberCount;
    }

    public Map<String, Integer> whereCanTheDiceThrowFit(List<Integer> diceThrow){
        Map<String, Integer> options = new HashMap<>(); //where does it fit, value
        Collections.sort(diceThrow);
        if(diceThrow.contains(1)){
            int value = countNumberInDiceThrow(diceThrow, 1);
            options.put("1's", value);
        }
        if(diceThrow.contains(2)){
            int value = countNumberInDiceThrow(diceThrow, 2);
            options.put("2's", value*2);
        }
        if(diceThrow.contains(3)){
            int value = countNumberInDiceThrow(diceThrow, 3);
            options.put("3's", value*3);
        }
        if(diceThrow.contains(4)){
            int value = countNumberInDiceThrow(diceThrow, 4);
            options.put("4's", value*4);
        }
        if(diceThrow.contains(5)){
            int value = countNumberInDiceThrow(diceThrow, 5);
            options.put("5's", value*5);
        }
        if(diceThrow.contains(6)){
            int value = countNumberInDiceThrow(diceThrow, 6);
            options.put("6's", value*6);
        }
        return options;
    }
}