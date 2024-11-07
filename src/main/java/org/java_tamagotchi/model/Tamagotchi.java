package org.java_tamagotchi.model;

public class Tamagotchi {
    private final String name;
    private final TamagotchiType type;
    private int age;
    private int hunger;
    private int happiness;
    private int energy;
    private boolean isAlive;

    public Tamagotchi(String name, TamagotchiType type) {
        this.name = name;
        this.type = type;
        this.age = 0;
        this.hunger = 50;
        this.happiness = 0;
        this.energy = 50;
        this.isAlive = true;
    }

    public void feed() {
        if(hunger > 10) {
            hunger -= 10;
            energy += 5;
            System.out.println(name + " has been feed.");
        } else {
            System.out.println(name + " is full.");
        }
    }

    public void logInfo() {
        if(isAlive) {
            System.out.println(name + " " + type.toString() + " happiness: " + happiness + " age: " + age + " hunger: " + hunger + " energy: " + energy);
        } else {
            System.out.println(name + " is no longer with us.");
        }
    }
}
