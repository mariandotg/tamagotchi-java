package org.java_tamagotchi.model;

public class Tamagotchi {
    private final String name;
    private final TamagotchiType type;
    private final int health;
    private final int hunger;
    private final int happiness;
    private final int energy;

    public Tamagotchi(String name, TamagotchiType type) {
        this.name = name;
        this.type = type;
        this.health = 100;
        this.hunger = 100;
        this.happiness = 0;
        this.energy = 100;
    }

    public void logInfo() {
        System.out.println(name + " " + type.toString() + " " + happiness + " " + health + " " + hunger + " " + energy);
    }
}
