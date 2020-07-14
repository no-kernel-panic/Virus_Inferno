package com.company;

public class TaskPojaczeniaAutobusowy implements Runnable {

    @Override
    public void run() {

        if (!Gui.jestPrzerwana)

            for (Panstwo panstwo : Gui.listaPanstwa) {
                for (Panstwo panstwo1 : panstwo.listPolaczeniaAutobusowy) {

                    panstwo.przyjmowachPodroznych(panstwo1, ((int) (Math.random() * (panstwo1.maxAutobus - 10)) + 10)); // random number between 8 and 1
                    panstwo1.przyjmowachPodroznych(panstwo, ((int) (Math.random() * (panstwo.maxAutobus - 10)) + 10));
                    panstwo.pieniadze += 5;
                    panstwo1.pieniadze += 5;
                }
            }
    }

}
