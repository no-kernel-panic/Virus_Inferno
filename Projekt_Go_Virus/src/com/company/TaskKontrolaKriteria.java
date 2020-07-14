package com.company;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TaskKontrolaKriteria implements Runnable {

    boolean koniecGry;

    public static void appendStrToFile(String fileName, // appendStrToFile method taken from https://stackoverflow.com/questions/1625234/how-to-append-text-to-an-existing-file-in-java
                                       String str) {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            out.write(str);
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    @Override
    public void run() {

        while (true) {

            if (!Gui.jestPrzerwana) {

                Gui.populacjaLabel.setText("Population: " + Gui.wybranyPanstwo.lokalnaPopulacja);
                Gui.totalScoreLabel.setText("Total Score: " + Panstwo.totalScore);
                Gui.lokalnaLiczbaZakazonychLabel.setText("" + Gui.wybranyPanstwo.lokalnaLiczbaZakazonych);
                Gui.liczbaZmarlychLabel.setText("" + Gui.wybranyPanstwo.lokalnaLiczbaZmarlych);
                Gui.pieniadzeLabel.setText("$ " + Gui.wybranyPanstwo.pieniadze);
                Gui.atomicPointsLabel.setText("[" + Gui.wybranyPanstwo.atomicPoints);

                //Interrupt with all train connections of the certain country if exceeds data criteria:

                if (Gui.wybranyPanstwo.listPolaczeniaKolejowa.isEmpty()) {
                    Gui.listaKolejowaLabel.setText("There are no train connections");
                    Gui.listaKolejowaLabel.setForeground(Color.red);

                } else if (Gui.wybranyPanstwo.limitDataKriterium > WatekCzas.data) {

                    Gui.listaKolejowaLabel.setText(Gui.wybranyPanstwo.listPolaczeniaKolejowa.toString());
                    Gui.listaKolejowaLabel.setForeground(Color.orange);

                } else {

                    for (Panstwo panstwo : Gui.listaPanstwa)

                        panstwo.listPolaczeniaKolejowa.remove(Gui.wybranyPanstwo);
                    Gui.wybranyPanstwo.listPolaczeniaKolejowa.clear();
                }

                //Interrupt with all sea connections of the certain country if exceeds increase in population criteria

                if (Gui.wybranyPanstwo.listPolaczeniaMorskie.isEmpty()) {

                    Gui.listaMorskaLabel.setText("There are no sea connections");
                    Gui.listaMorskaLabel.setForeground(Color.red);

                } else if (Gui.wybranyPanstwo.lokalnaPopulacja - Gui.wybranyPanstwo.pomocniczalokalnaPopulacja < Gui.wybranyPanstwo.zwrostwPopulacjiKriterium) {

                    Gui.listaMorskaLabel.setText(Gui.wybranyPanstwo.listPolaczeniaMorskie.toString());
                    Gui.listaMorskaLabel.setForeground(Color.orange);

                } else {
                    Gui.wybranyPanstwo.listPolaczeniaMorskie.clear();

                    for (Panstwo panstwo : Gui.listaPanstwa)
                        panstwo.listPolaczeniaMorskie.remove(Gui.wybranyPanstwo);
                }

                //Interrupt with all car connections of the certain country if one neighbour country reaches the infected criteria

                if (Gui.wybranyPanstwo.listPolaczeniaSamochodowa.isEmpty()) {

                    Gui.listaSamochodowaLabel.setText("There are no car connections");
                    Gui.listaSamochodowaLabel.setForeground(Color.red);

                } else {

                    Gui.listaSamochodowaLabel.setText(Gui.wybranyPanstwo.listPolaczeniaSamochodowa.toString());
                    Gui.listaSamochodowaLabel.setForeground(Color.orange);

                    for (Panstwo panstwo : Gui.wybranyPanstwo.listPolaczeniaSamochodowa)

                        if (panstwo.procentLokalnyZakazonych >= Gui.wybranyPanstwo.limitPanstwosasiadKriterium) {

                            Gui.wybranyPanstwo.listPolaczeniaSamochodowa.clear();

                            for (Panstwo panstwo1 : Gui.listaPanstwa) {
                                panstwo1.listPolaczeniaSamochodowa.remove(Gui.wybranyPanstwo);
                            }
                            break; // we break because it is enough that one country has exceeded the limit to cut with all connections
                        }
                }

                //Interrupt with all air connections of the certain country if exceeds the infected criteria

                //this percentage needs to be calculated for the air criterium
                for (Panstwo panstwo : Gui.listaPanstwa)
                    panstwo.procentLokalnyZakazonych = (float) panstwo.lokalnaLiczbaZakazonych / (float) panstwo.lokalnaPopulacja * 100;

                if (Gui.wybranyPanstwo.listPolaczeniaLotnicza.isEmpty()) {

                    Gui.listaLotniczaLabel.setText("There are no air connections");
                    Gui.listaLotniczaLabel.setForeground(Color.red);

                } else if (Gui.wybranyPanstwo.procentLokalnyZakazonych < Gui.wybranyPanstwo.limitZakazonychKriterum) {

                    Gui.listaLotniczaLabel.setText(Gui.wybranyPanstwo.listPolaczeniaLotnicza.toString());
                    Gui.listaLotniczaLabel.setForeground(Color.orange);

                } else {

                    for (Panstwo panstwo : Gui.listaPanstwa)
                        panstwo.listPolaczeniaLotnicza.remove(Gui.wybranyPanstwo);
                    Gui.wybranyPanstwo.listPolaczeniaLotnicza.clear();

                }

                //Interrupt with all bus connections of the certain country if exceeds the dead criteria

                if (Gui.wybranyPanstwo.listPolaczeniaAutobusowy.isEmpty()) {

                    Gui.listaAutobusowaLabel.setText("There are no bus connections");
                    Gui.listaAutobusowaLabel.setForeground(Color.red);

                } else if (Gui.wybranyPanstwo.lokalnaLiczbaZmarlych < Gui.wybranyPanstwo.limitZmarlychKriterium) {

                    Gui.listaAutobusowaLabel.setText(Gui.wybranyPanstwo.listPolaczeniaAutobusowy.toString());
                    Gui.listaAutobusowaLabel.setForeground(Color.orange);

                } else {

                    for (Panstwo panstwo : Gui.listaPanstwa)
                        panstwo.listPolaczeniaAutobusowy.remove(Gui.wybranyPanstwo);

                    Gui.wybranyPanstwo.listPolaczeniaAutobusowy.clear();

                }

                //checking if the player loses
                if (Panstwo.globalnaLiczbaZakazonych + Panstwo.globalnaLiczbaZmarlych >= Panstwo.globalnaPopulacja) {
                    Gui.infoKoniecGrylabel.setText("Game over");
                    koniecGry = true;

                    //checking if the player wins

                } else if (Panstwo.globalnaLiczbaZakazonych == 0) {
                    Gui.infoKoniecGrylabel.setText("You win!");
                    koniecGry = true;
                }


                if (koniecGry) {

                    Gui.jestPrzerwana = true;
                    Panstwo.totalScore -= WatekCzas.data - Panstwo.globalnaLiczbaZmarlych;
                    Gui.totalScoreLabel.setBounds(320, 700, 300, 50);
                    Gui.buttonHighScores.setBounds(200, 550, 400, 100);
                    Gui.koniecGryPanel.add(Gui.buttonHighScores);
                    Gui.koniecGryPanel.add(Gui.totalScoreLabel);
                    Gui.koniecGryPanel.setVisible(true);
                    Gui.userNameTextField.addActionListener(ae -> {

                        String userName = Gui.userNameTextField.getText();
                        String fileName = "..\\Projekt_Go_Virus\\src\\com\\company\\highscores.txt";
                        String str = userName + ": " + Panstwo.totalScore + System.lineSeparator();
                        appendStrToFile(fileName, str);

                    });

                }
            }
        }
    }

}