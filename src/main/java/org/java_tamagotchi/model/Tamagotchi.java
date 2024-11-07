package org.java_tamagotchi.model;

public class Tamagotchi {
    private final String name;
    private final TamagotchiType type;
    private final int age;
    private final int hunger;
    private final int happiness;
    private final int energy;
    private final boolean isAlive;

    public Tamagotchi(String name, TamagotchiType type) {
        this.name = name;
        this.type = type;
        this.age = 0;
        this.hunger = 50;
        this.happiness = 0;
        this.energy = 50;
        this.isAlive = true;
    }

    public void logInfo() {
        if(isAlive) {
            System.out.println(name + " " + type.toString() + " happiness: " + happiness + " age: " + age + " hunger: " + hunger + " energy: " + energy);
        } else {
            System.out.println(name + " is no longer with us.");
        }
    }
}
