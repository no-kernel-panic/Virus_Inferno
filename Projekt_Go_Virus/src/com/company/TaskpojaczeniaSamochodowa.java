package com.company;


public class TaskpojaczeniaSamochodowa implements Runnable {

    @Override
    public void run() {

        if (!Gui.jestPrzerwana)

            for (Panstwo panstwo : Gui.listaPanstwa) {

                for (Panstwo panstwo1 : panstwo.listPolaczeniaSamochodowa) {

                    panstwo.przyjmowachPodroznych(panstwo1, ((int) (Math.random() * (panstwo1.maxSamochod - 1)) + 1)); // random number between 8 and 1
                    panstwo1.przyjmowachPodroznych(panstwo, ((int) (Math.random() * (panstwo.maxSamochod - 1)) + 1));
                    panstwo.pieniadze += 2;
                    panstwo1.pieniadze += 2;



                }

            }
    }

}



