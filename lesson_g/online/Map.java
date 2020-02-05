package ru.geekbrains.lesson_g.online;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int GAME_MODE_HVH = 0;
    public static final int GAME_MODE_HVA = 1;

    Map() {
        setBackground(Color.BLACK);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("game mode: %d\nfieldSize: %d\nwinLength: %d",
                gameMode, fieldSizeX, winLength);
    }
}