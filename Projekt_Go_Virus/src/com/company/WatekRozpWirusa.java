package com.company;

import static java.lang.Thread.sleep;

public class WatekRozpWirusa {

    synchronized
    public static void rozpWirusa() {


        while (!Gui.jestPrzerwana) {

            try {
                sleep(Gui.difficulty);// the difficulty determines the speed in which the infection spreads

                for (Panstwo panstwo : Gui.listaPanstwa) {

                    if (panstwo.lokalnaLiczbaZakazonych > 0) {

                        //the below if statement is to reassure there is no more infected than people before increasing the infected
                        if ((panstwo.lokalnaLiczbaZakazonych + (panstwo.lokalnaLiczbaZakazonych * panstwo.procentPredkoscWirusa)) <= panstwo.lokalnaPopulacja) {

                            Panstwo.globalnaLiczbaZakazonych += panstwo.lokalnaLiczbaZakazonych * panstwo.procentPredkoscWirusa;
                            panstwo.lokalnaLiczbaZakazonych += panstwo.lokalnaLiczbaZakazonych * panstwo.procentPredkoscWirusa;

                            Panstwo.totalScore -= panstwo.lokalnaLiczbaZakazonych * panstwo.procentPredkoscWirusa;

                        } else
                            panstwo.lokalnaLiczbaZakazonych = panstwo.lokalnaPopulacja;// when we reach the max infected

                        panstwo.pomoczniczaZmarlych = panstwo.lokalnaLiczbaZmarlych;
                        panstwo.lokalnaLiczbaZmarlych = panstwo.lokalnaLiczbaZmarlych + (int) (panstwo.lokalnaLiczbaZakazonych * panstwo.procentSmiertelnosc);
                        Panstwo.globalnaPopulacja -= panstwo.lokalnaLiczbaZmarlych - panstwo.pomoczniczaZmarlych; //decreasing population per every new death
                        panstwo.lokalnaPopulacja -= panstwo.lokalnaLiczbaZmarlych - panstwo.pomoczniczaZmarlych;

                        if ((panstwo.lokalnaLiczbaZakazonych - panstwo.lokalnaLiczbaZmarlych - panstwo.pomoczniczaZmarlych) >= 0)
                            panstwo.lokalnaLiczbaZakazonych -= panstwo.lokalnaLiczbaZmarlych - panstwo.pomoczniczaZmarlych;
                        else
                            panstwo.lokalnaLiczbaZakazonych = 0; //Avoiding going in negative amount of infected
                    }

                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


