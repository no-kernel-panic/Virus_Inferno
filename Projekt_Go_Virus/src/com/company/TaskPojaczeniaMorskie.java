package com.company;

public class TaskPojaczeniaMorskie implements Runnable {

    @Override
    public void run() {

        if (!Gui.jestPrzerwana)

            for (Panstwo panstwo : Gui.listaPanstwa) {

                for (Panstwo panstwo1 : panstwo.listPolaczeniaMorskie) {

                    panstwo.przyjmowachPodroznych(panstwo1, ((int) (Math.random() * (panstwo1.maxMorska - 300)) + 300)); // random number between 300 and 3000
                    panstwo1.przyjmowachPodroznych(panstwo, ((int) (Math.random() * (panstwo.maxMorska - 300)) + 300));
                    panstwo.pieniadze += 30;
                    panstwo1.pieniadze += 30;

                }
            }
    }

}