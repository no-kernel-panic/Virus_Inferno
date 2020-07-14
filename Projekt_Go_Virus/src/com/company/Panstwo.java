package com.company;

import java.util.ArrayList;
import java.util.List;

public class Panstwo {


    static int totalScore;
    static int globalnaLiczbaZmarlych;
    static int globalnaLiczbaZakazonych;
    static int globalnaPopulacja;
    Enum nazwa;
    int lokalnaPopulacja;
    int pomocniczalokalnaPopulacja;
    int lokalnaLiczbaZakazonych;
    int lokalnaLiczbaZmarlych;
    int pomoczniczaZmarlych;
    int pieniadze;
    float procentLokalnyZakazonych;
    float procentSmiertelnosc;
    float procentPredkoscWirusa;
    float limitZakazonychKriterum;
    float limitPanstwosasiadKriterium;
    int limitZmarlychKriterium;
    int limitDataKriterium;
    int zwrostwPopulacjiKriterium;
    int atomicPoints;
    int maxSamochod;
    int maxAutobus;
    int maxPaciag;
    int maxSamolot;
    int maxMorska;

    //keeping the list of countries connecting with (this)

    List<Panstwo> listPolaczeniaLotnicza;
    List<Panstwo> listPolaczeniaSamochodowa;
    List<Panstwo> listPolaczeniaKolejowa;
    List<Panstwo> listPolaczeniaAutobusowy;
    List<Panstwo> listPolaczeniaMorskie;

    public Panstwo(int lokalnaPopulacja, int lokalnaLiczbaZakazonych, PanstwaNazwy nazwa, float limitZakazonychKriterum,
                   float limitPanstwosasiadKriterium, int limitZmarlychKriterium, int limitDataKriterium, int zwrostwPopulacjiKriterium) {

        this.lokalnaPopulacja = lokalnaPopulacja;
        this.lokalnaLiczbaZakazonych = lokalnaLiczbaZakazonych;
        this.limitZakazonychKriterum = limitZakazonychKriterum;
        this.limitPanstwosasiadKriterium = limitPanstwosasiadKriterium;
        this.limitZmarlychKriterium = limitZmarlychKriterium;
        this.limitDataKriterium = limitDataKriterium;
        this.zwrostwPopulacjiKriterium = zwrostwPopulacjiKriterium;
        this.pomocniczalokalnaPopulacja = lokalnaPopulacja;
        this.nazwa = nazwa;
        procentLokalnyZakazonych = (float) this.lokalnaLiczbaZakazonych / (float) this.lokalnaPopulacja * 100;
        procentSmiertelnosc = 0.0005f;
        procentPredkoscWirusa = 0.005f;
        pieniadze = 0;
        maxSamochod = 8;
        maxAutobus = 72;
        maxPaciag = 1200;
        maxMorska = 3000;
        maxSamolot = 365;
        atomicPoints = 0;
        listPolaczeniaLotnicza = new ArrayList<>();
        listPolaczeniaSamochodowa = new ArrayList<>();
        listPolaczeniaKolejowa = new ArrayList<>();
        listPolaczeniaAutobusowy = new ArrayList<>();
        listPolaczeniaMorskie = new ArrayList<>();
        Gui.listaPanstwa.add(this);
    }

    public void przyjmowachPodroznych(Panstwo panstwo, int liczbaPazazerow) {
        {
            lokalnaPopulacja += liczbaPazazerow;
            panstwo.lokalnaPopulacja -= liczbaPazazerow;
            zarazacOsobe(panstwo, liczbaPazazerow);
        }

    }

    public void zarazacOsobe(Panstwo panstwo, int liczbaPazazerow) {

        float lokalnaLiczbaZakazonychWPodrozu = (float) liczbaPazazerow * panstwo.procentLokalnyZakazonych; //% of country infected = % of travellers infected
        lokalnaLiczbaZakazonych += (int) lokalnaLiczbaZakazonychWPodrozu;
        Panstwo.globalnaLiczbaZmarlych += (int) lokalnaLiczbaZakazonychWPodrozu;

    }

    @Override
    public String toString() {
        return this.nazwa.toString();
    }
}


