package com.company;

public class TaskpojaczeniaLotnicza implements Runnable {

    @Override
    public void run() {

        if (!Gui.jestPrzerwana)

            for (Panstwo panstwo : Gui.listaPanstwa) { //browsing through the list of countries

                for (Panstwo panstwo1 : panstwo.listPolaczeniaLotnicza) {

                    panstwo.przyjmowachPodroznych(panstwo1, ((int) (Math.random() * (panstwo1.maxSamolot - 100)) + 100)); //outbound flight random number between 150 and 365
                    panstwo1.przyjmowachPodroznych(panstwo, ((int) (Math.random() * (panstwo.maxSamolot - 100)) + 100)); //inbound flight
                    panstwo.pieniadze += 20;
                    panstwo1.pieniadze += 20;

                }

            }

    }
}



