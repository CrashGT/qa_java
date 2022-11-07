package com.example;

import java.util.List;

public class Lion {
    private Kitten kitten;
    private Predator predator;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.kitten = feline;
        this.predator = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }


    public int getKittens() {
        return kitten.getKittens();
    }
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
