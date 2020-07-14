package com.company;

import static java.lang.Thread.sleep;

public class WatekCzas {

    public static int data;

    synchronized
    public static void dataInc() {


        while (!Gui.jestPrzerwana) {
            try {

                sleep(5000);
                data++;
                Gui.dataLabel.setText("Day: " + data);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


