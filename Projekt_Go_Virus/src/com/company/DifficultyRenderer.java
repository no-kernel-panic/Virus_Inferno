package com.company;

import javax.swing.*;
import java.awt.*;

public class DifficultyRenderer implements ListCellRenderer<String> {


    Font fontStart = new Font("Chernobyl", Font.PLAIN, 60);

    @Override
    public Component getListCellRendererComponent(JList<? extends String> jList, String s, int i, boolean b, boolean b1) {
        JLabel difficultyLabel = new JLabel(s);


        String a = ((DifficultyModel) jList.getModel()).getElementAt(i);

        if (b && a.equals("EASY")) {
            difficultyLabel.setForeground(Color.yellow);
            Gui.difficulty = 5000;
        }

        if (b && a.equals("MEDIUM")) {
            difficultyLabel.setForeground(Color.yellow);
            Gui.difficulty = 3000;
        }

        if (b && a.equals("HARD")) {
            difficultyLabel.setForeground(Color.yellow);
            Gui.difficulty = 1000;
        }

        difficultyLabel.setOpaque(true);
        difficultyLabel.setBackground(Color.black);
        difficultyLabel.setFont(fontStart);

        return difficultyLabel;
    }

}

