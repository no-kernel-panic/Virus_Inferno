package com.company;

public class TaskPojaczeniaKolejowa implements Runnable {

    @Override
    public void run() {

        if (!Gui.jestPrzerwana)

            for (Panstwo panstwo : Gui.listaPanstwa) {

                for (Panstwo panstwo1 : panstwo.listPolaczeniaKolejowa) {

                    panstwo.przyjmowachPodroznych(panstwo1, ((int) (Math.random() * (panstwo1.maxPaciag - 300)) + 300)); // random number between 500 and 1200
                    panstwo1.przyjmowachPodroznych(panstwo, ((int) (Math.random() * (panstwo.maxPaciag - 300)) + 300));
                    panstwo.pieniadze += 10;
                    panstwo1.pieniadze += 10;
                }

            }
    }

}


