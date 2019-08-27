package fr.leroideskiwis.justeprix;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class InputChecker{

    private int random;
    private int input;

    public InputChecker(int random, int input){
        this.random = random;
        this.input = input;

    }

    public void checkAndRun(Consumer<Integer> higher, Consumer<Integer> lower, Consumer<Integer> equals){

        if(random > input)
            higher.accept(input);
        else if(random < input)
            lower.accept(input);
        else
            equals.accept(input);

    }

}
