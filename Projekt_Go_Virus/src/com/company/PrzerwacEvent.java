package com.company;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PrzerwacEvent extends KeyAdapter {

    public PrzerwacEvent() {

    }

    @Override
    public void keyPressed(KeyEvent event) {


        if (event.getKeyCode() == KeyEvent.VK_ESCAPE) {

            Gui.jestPrzerwana = true;
            Gui.panelMainMenu.setVisible(true);
            Gui.panelVirusInferno.setVisible(true);
            Gui.panelMaskaImage.setVisible(true);
            Gui.lokalnaLiczbaZakazonychLabel.setVisible(false);
            Gui.liczbaZmarlychLabel.setVisible(false);
            Gui.przerwanaIconLabel.setVisible(true);
            Gui.buttonStart.setText("RESUME");


        }


    }


}


