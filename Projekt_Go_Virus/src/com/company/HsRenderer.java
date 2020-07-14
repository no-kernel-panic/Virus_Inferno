package com.company;


import javax.swing.*;
import java.awt.*;

public class HsRenderer implements ListCellRenderer<String> {

    Font fontHighscores = new Font("Chernobyl", Font.PLAIN, 30);

    @Override
    public Component getListCellRendererComponent(JList<? extends String> jList, String s, int i, boolean b, boolean b1) {


        JLabel hslabel = new JLabel(s);
        hslabel.setForeground(Color.red);
        hslabel.setOpaque(true);
        hslabel.setBackground(Color.black);
        hslabel.setFont(fontHighscores);
        return hslabel;

    }
}
