package com.company;

import javax.swing.*;


public class DifficultyModel extends AbstractListModel<String> {

    private String[] difficultylist;

    public DifficultyModel(String[] hslist) {

        this.difficultylist = hslist;
    }

    @Override
    public int getSize() {
        return difficultylist.length;
    }


    @Override
    public String getElementAt(int index) {
        return difficultylist[index];


    }
}


