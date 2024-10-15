package org.java_tamagotchi;

import org.java_tamagotchi.model.Tamagotchi;
import org.java_tamagotchi.model.TamagotchiType;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("hello world!");

        GamePanel gamePanel = new GamePanel();
        Tamagotchi tamagotchi = new Tamagotchi("drevzcito", TamagotchiType.DOG2);

        tamagotchi.logInfo();
        window.add(gamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}