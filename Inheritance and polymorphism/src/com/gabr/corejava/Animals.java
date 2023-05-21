package com.gabr.corejava;

public class Animals {

    protected Animal[] animals;

    public Animals(Animal[] animals) {
        this.animals = animals;
    }

    public void sound() {
        for (Animal animal : animals)
            animal.makeSound();
    }

}
