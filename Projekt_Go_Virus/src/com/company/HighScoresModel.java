package com.company;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class HighScoresModel extends AbstractListModel<String> {

    List<String> hsList;
    Path path = Paths.get("..\\Projekt_Go_Virus\\src\\com\\company\\highscores.txt");

    public HighScoresModel() {

        try {
            this.hsList = Files.lines(path).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getSize() {

        return hsList.size();
    }


    @Override
    public String getElementAt(int index) {


        return hsList.get(index);
    }


}