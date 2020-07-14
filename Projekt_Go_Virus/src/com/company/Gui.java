package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Gui extends JFrame {


    static int difficulty = 0;
    static boolean jestPrzerwana;
    static List<Panstwo> listaPanstwa = new ArrayList<>();
    static Panstwo wybranyPanstwo;
    static JTextField userNameTextField;
    static JPanel koniecGryPanel;
    static JLabel infoKoniecGrylabel;
    static JLabel populacjaLabel;
    static JLabel lokalnaLiczbaZakazonychLabel;
    static JLabel dataLabel;
    static JLabel listaLotniczaLabel;
    static JLabel przerwanaIconLabel;
    static JLabel listaSamochodowaLabel;
    static JLabel listaMorskaLabel;
    static JLabel listaKolejowaLabel;
    static JLabel konsolaLabel;
    static JLabel listaAutobusowaLabel;
    static JLabel liczbaZmarlychLabel;
    static JLabel pieniadzeLabel;
    static JLabel totalScoreLabel;
    static JLabel atomicPointsLabel;
    static JPanel panelMainMenu;
    static JPanel panelVirusInferno;
    static JPanel panelMaskaImage;
    static JButton buttonStart;
    static JButton buttonHighScores;
    ScheduledExecutorService servicePolaczenie = Executors.newScheduledThreadPool(8);
    ExecutorService serviceKontrolaKriteria = Executors.newSingleThreadExecutor();
    JLabel mazeczkiLabel;
    JLabel respiratoryLabel;
    JLabel uzdrowicLabel;
    JLabel wiadomosciLabel;
    JLabel dataKriteriaLabel;
    JLabel zakazonychKriteriaLabel;
    JLabel zwrostPopulacjiKriteriaLabel;
    JLabel zmarlychKriteriaLabel;
    JLabel sasiadyKriteriaLabel;
    JLabel lastactivityLabel;
    JPanel panelWorldMapImage;
    JLabel gameNameLabel;
    JLabel panstwoNaglowekLabel;
    JLabel textConnections;
    JLabel textImprovements;
    BufferedImage img;
    ImageIcon pasedIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\paused.png");
    ImageIcon infoIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\interrupt.png");
    ImageIcon samolotIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\flighticon.png");
    ImageIcon lodzIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\boaticon.png");
    ImageIcon paciagIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\trainicon.png");
    ImageIcon samochodIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\caricon.png");
    ImageIcon busIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\busicon.png");
    ImageIcon deathIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\skullicon.png");
    ImageIcon infectedIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\infected.png");
    ImageIcon mazeczkiLabelIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\mask.png");
    ImageIcon respiratorIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\respirator.png");
    ImageIcon dodawacIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\add.png");
    ImageIcon wiadomosciIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\news.png");
    ImageIcon potionIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\heal.png");
    ImageIcon timecriteriaIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\timecriterium.png");
    ImageIcon infectedCriteriaIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\sick.png");
    ImageIcon poulationCriteriaIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\people.png");
    ImageIcon sasiadyKriteriaLabelIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\sickcountry.png");
    ImageIcon deathCriteriaIcon = new ImageIcon("..\\Projekt_Go_Virus\\src\\com\\company\\images\\coffin.png");
    Font fontTitle = new Font("Chiller", Font.PLAIN, 169);
    Font fontTotalScore = new Font("Chiller", Font.PLAIN, 40);
    Font countryTitle = new Font("Chernobyl", Font.PLAIN, 81);
    Font fontStart = new Font("Chernobyl", Font.PLAIN, 60);
    Font fontPanelCountryInfo = new Font("Chernobyl", Font.PLAIN, 30);
    Font fontPanelConnections = new Font("Chernobyl", Font.PLAIN, 20);
    Font buttons = new Font("Chernobyl", Font.PLAIN, 20);
    JPanel panelPanstwaButtons;
    JPanel panelUlepszen;
    JPanel panelPanstwaInfo;
    JButton buttonExit;
    JButton bInfoSamochod;
    JButton bInfoSamolot;
    JButton bInfoBus;
    JButton bInfoPaciag;
    JButton bInfoMorskie;
    JButton bDodacMazeczki;
    JButton bDodacRespirator;
    JButton bUzdrowicPopulacji;
    JButton bScarePeople;
    JButton bHurryUp;
    JButton bPrevent;
    JButton bBabyBoom;
    JButton b6FeetUnder;
    JButton bKeepThemOut;
    JButton bCanada;
    JButton bUsa;
    JButton bGreenland;
    JButton bCentralAmerica;
    JButton bArgentina;
    JButton bBrazil;
    JButton bPeru;
    JButton bVenezuela;
    JButton bGreatBritain;
    JButton bIceland;
    JButton bPoland;
    JButton bScandinavia;
    JButton bSouthernEurope;
    JButton bEasternEurope;
    JButton bWesternEurope;
    JButton bCongo;
    JButton bEastAfrica;
    JButton bEgypt;
    JButton bMadagascar;
    JButton bNorthAfrica;
    JButton bSouthAfrica;
    JButton bAfghanistan;
    JButton bChina;
    JButton bIndia;
    JButton bRussia;
    JButton bJapan;
    JButton bMongolia;
    JButton bSoutheastAsia;
    JButton bAustralia;
    JButton bIndonesia;
    JButton bNewGuinea;
    JButton bMiddleEast;
    JButton bUruguay;

    {
        try {
            img = ImageIO.read(new File("..\\Projekt_Go_Virus\\src\\com\\company\\images\\Captura.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Gui() throws IOException {

        super("VIRUS INFERNO");
        setSize(1500, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.black);
        setResizable(false);

        //  Front mas image pannel:

        panelMaskaImage = new JPanel();
        panelMaskaImage.setBackground(Color.black);
        panelMaskaImage.add(new JLabel(new ImageIcon(ImageIO.read(new File("..\\Projekt_Go_Virus\\src\\com\\company\\images\\virus.png")))));

        //Title pannel:

        panelVirusInferno = new JPanel();
        panelVirusInferno.setBounds(350, 520, 900, 200);
        panelVirusInferno.setBackground(Color.black);

        //Start Button:

        buttonStart = new JButton("New Game");
        buttonStart.setBorder(null);
        buttonStart.setFont(fontStart);
        buttonStart.setBackground(Color.black);
        buttonStart.setForeground(Color.yellow);
        buttonStart.addActionListener(actionEvent -> {

            if (!jestPrzerwana) {

                //Second Button start:

                JButton redButtonstart = new JButton("Start");
                redButtonstart.setForeground(Color.red);
                redButtonstart.setBackground(Color.black);
                redButtonstart.setFont(fontStart);
                redButtonstart.setBorder(null);

                //Difficuly window:

                JFrame poziomTrudonsci = new JFrame("Difficulty");

                //MVC list:

                String[] list = {"EASY", "MEDIUM", "HARD"};
                JList<String> difficultyList = new JList<>(list);
                difficultyList.setCellRenderer(new DifficultyRenderer());
                difficultyList.setModel(new DifficultyModel(list));

                poziomTrudonsci.add(difficultyList);
                poziomTrudonsci.add(redButtonstart, BorderLayout.SOUTH);
                poziomTrudonsci.setSize(400, 320);
                poziomTrudonsci.setLocationRelativeTo(null);
                poziomTrudonsci.setVisible(true);

                redButtonstart.addActionListener(actionEvent1 -> {

                    if (difficulty != 0) { //only start if difficulty is set

                        poziomTrudonsci.setVisible(false);

                        mainScene(); //Load every Gui element in the mainscene

                        // the exec services for the connections and threads for time and virus spread:

                        servicePolaczenie.scheduleAtFixedRate(new TaskpojaczeniaSamochodowa(), 10, 5, SECONDS);
                        servicePolaczenie.scheduleAtFixedRate(new TaskPojaczeniaAutobusowy(), 50, 10, SECONDS);
                        servicePolaczenie.scheduleAtFixedRate(new TaskPojaczeniaKolejowa(), 20, 15, SECONDS);
                        servicePolaczenie.scheduleAtFixedRate(new TaskpojaczeniaLotnicza(), 20, 20, SECONDS);
                        servicePolaczenie.scheduleAtFixedRate(new TaskPojaczeniaMorskie(), 20, 30, SECONDS);

                        Runnable data = () -> {
                            WatekCzas.dataInc();
                        };
                        Thread threadData = new Thread(data);
                        threadData.start();

                        Runnable rozpwirus = () -> {
                            WatekRozpWirusa.rozpWirusa();
                        };
                        Thread threadRozpWirus = new Thread(rozpwirus);
                        threadRozpWirus.start();

                    }

                });

            } else { //resuming the game if its paused

                jestPrzerwana = false;
                Gui.panelMainMenu.setVisible(false);
                Gui.panelVirusInferno.setVisible(false);
                Gui.panelMaskaImage.setVisible(false);
                Gui.lokalnaLiczbaZakazonychLabel.setVisible(true);
                Gui.liczbaZmarlychLabel.setVisible(true);
                przerwanaIconLabel.setVisible(false);

                //re-run threads

                Runnable data = () -> {
                    WatekCzas.dataInc();
                };
                Thread threadData = new Thread(data);
                threadData.start();


                Runnable rozpwirus = () -> {
                    WatekRozpWirusa.rozpWirusa();
                };

                Thread threadRozpWirus = new Thread(rozpwirus);
                threadRozpWirus.start();

            }
        });


        // Highscores Button:

        buttonHighScores = new JButton("High Scores");
        buttonHighScores.setBackground(Color.black);
        buttonHighScores.setForeground(Color.yellow);
        buttonHighScores.setBorder(null);
        buttonHighScores.setFont(fontStart);
        buttonHighScores.addActionListener(actionEvent -> {

            //HighScores window:

            JFrame highscoresFrame = new JFrame("highsores");

            //MVC Model:

            JList<String> hslist = new JList<>();
            hslist.setModel(new HighScoresModel());
            hslist.setCellRenderer(new HsRenderer());

            highscoresFrame.add(new JScrollPane(hslist));
            highscoresFrame.setSize(400, 300);
            highscoresFrame.setLocationRelativeTo(null);
            highscoresFrame.setVisible(true);

        });

        //Exit button:

        buttonExit = new JButton("Exit");
        buttonExit.setBackground(Color.black);
        buttonExit.setForeground(Color.yellow);
        buttonExit.setBorder(null);
        buttonExit.setFont(fontStart);
        buttonExit.addActionListener(actionEvent -> {
            System.exit(0);
        });


        //Panel for start, highscores, and exit buttons:

        panelMainMenu = new JPanel(new GridLayout(3, 0));
        panelMainMenu.setBounds(540, 750, 400, 200);
        panelMainMenu.add(buttonStart);
        panelMainMenu.add(buttonHighScores);
        panelMainMenu.add(buttonExit);
        panelMainMenu.setOpaque(false);

        //Game paused image:

        przerwanaIconLabel = new JLabel();
        przerwanaIconLabel.setBounds(1200, 200, 300, 200);
        przerwanaIconLabel.setIcon(pasedIcon);
        przerwanaIconLabel.setVisible(false);

        //Game name label

        gameNameLabel = new JLabel("VIRUS INFERNO");
        gameNameLabel.setForeground(Color.yellow);
        gameNameLabel.setFont(fontTitle);
        panelVirusInferno.add(gameNameLabel);


        //adding to the JFrame (this) the mainmenu components:

        add(przerwanaIconLabel);
        add(panelMainMenu);
        add(panelVirusInferno);
        add(panelMaskaImage);

        setVisible(true);
    }


    public void mainScene() {

        //instantiating the country buttons:

        bCanada = new JButton(" 33 : 3CANADA");
        bUsa = new JButton(" 32 : USA");
        bGreenland = new JButton(" 18 : GREENLAND");
        bCentralAmerica = new JButton(" 31 : CENTRAL_AMERICA");
        bArgentina = new JButton(" 27 : ARGENTINA");
        bBrazil = new JButton(" 26 : BRASIL");
        bPeru = new JButton(" 28 : PERU");
        bVenezuela = new JButton(" 30 : VENEZUELA");
        bGreatBritain = new JButton(" 15 : GREAT_BRITAIN");
        bIceland = new JButton(" 17 : ICELAND");
        bPoland = new JButton(" 12 : POLAND");
        bScandinavia = new JButton(" 16 : SCANDINAVIA");
        bSouthernEurope = new JButton(" 13 : SOUTHERN_EUROPE");
        bEasternEurope = new JButton(" 11 : EASTERN_EUROPE");
        bWesternEurope = new JButton(" 14 : WESTERN_EUROPE");
        bCongo = new JButton(" 23 : CONGO");
        bEastAfrica = new JButton(" 22 : EAST_AFRICA");
        bEgypt = new JButton(" 20 : EGYPT");
        bMadagascar = new JButton(" 25 : MADAGASCAR");
        bNorthAfrica = new JButton(" 21 : NORTH_AFRICA");
        bSouthAfrica = new JButton(" 24 : SOUTH_AFRICA");
        bAfghanistan = new JButton(" 5 : AFGHANISTAN");
        bChina = new JButton(" 1 : CHINA");
        bIndia = new JButton(" 6 : INDIA");
        bRussia = new JButton(" 4 : RUSSIA");
        bJapan = new JButton(" 2 : JAPAN");
        bMongolia = new JButton(" 3 : MONGOLIA");
        bSoutheastAsia = new JButton(" 7 : SOUTHEAST_ASIA");
        bAustralia = new JButton(" 10 : AUSTRALIA");
        bIndonesia = new JButton(" 8 : INDONESIA");
        bNewGuinea = new JButton(" 9 : NEW_GUINEA");
        bMiddleEast = new JButton(" 19 : MiDDLE_EAST");
        bUruguay = new JButton(" 29 : URUGUAY");

        //Hiding the mainmenu components:

        panelMainMenu.setVisible(false);
        panelVirusInferno.setVisible(false);
        panelMaskaImage.setVisible(false);

        //The time shown:

        dataLabel = new JLabel();
        dataLabel.setBounds(1250, 0, 1200, 100);
        dataLabel.setForeground(Color.lightGray);
        dataLabel.setFont(fontStart);

        //The big label with the country name:

        panstwoNaglowekLabel = new JLabel();
        panstwoNaglowekLabel.setBounds(250, 0, 1200, 100);
        panstwoNaglowekLabel.setForeground(Color.yellow);
        panstwoNaglowekLabel.setFont(countryTitle);

        //Green icon with the infected counter:

        lokalnaLiczbaZakazonychLabel = new JLabel();
        lokalnaLiczbaZakazonychLabel.setBounds(0, 150, 200, 80);
        lokalnaLiczbaZakazonychLabel.setToolTipText("The infected increase at a speed of :" + wybranyPanstwo.procentPredkoscWirusa);
        lokalnaLiczbaZakazonychLabel.setFont(fontPanelCountryInfo);
        lokalnaLiczbaZakazonychLabel.setForeground(Color.green);
        lokalnaLiczbaZakazonychLabel.setIcon(infectedIcon);

        //Skull icon with the death counter:

        liczbaZmarlychLabel = new JLabel();
        liczbaZmarlychLabel.setBounds(0, 250, 200, 80);
        liczbaZmarlychLabel.setToolTipText("The deaths increase at a speed of :" + wybranyPanstwo.procentSmiertelnosc);
        liczbaZmarlychLabel.setFont(fontPanelCountryInfo);
        liczbaZmarlychLabel.setForeground(Color.red);
        liczbaZmarlychLabel.setIcon(deathIcon);

        //The country money:

        pieniadzeLabel = new JLabel();
        pieniadzeLabel.setBounds(5, 350, 200, 80);
        pieniadzeLabel.setToolTipText("Money is earned from connections");
        pieniadzeLabel.setFont(fontStart);
        pieniadzeLabel.setForeground(Color.white);

        //The player totalScore:

        totalScoreLabel = new JLabel();
        totalScoreLabel.setBounds(700, 60, 1000, 80);
        totalScoreLabel.setFont(fontTotalScore);
        totalScoreLabel.setForeground(Color.cyan);

        //The Last Activity header:

        lastactivityLabel = new JLabel("last activity");
        lastactivityLabel.setBounds(430, 0, 350, 30);
        lastactivityLabel.setFont(fontPanelCountryInfo);
        lastactivityLabel.setForeground(Color.white);

        //The last activity console:

        konsolaLabel = new JLabel("Heal some people to earn -");
        konsolaLabel.setBounds(430, 30, 350, 50);
        konsolaLabel.setForeground(Color.cyan);
        konsolaLabel.setFont(fontPanelConnections);

        //The local country population:

        populacjaLabel = new JLabel();
        populacjaLabel.setBounds(300, 50, 1200, 100);
        populacjaLabel.setFont(fontPanelCountryInfo);
        populacjaLabel.setForeground(Color.white);

        //The atomic points:

        atomicPointsLabel = new JLabel();
        atomicPointsLabel.setBounds(0, 450, 200, 80);
        atomicPointsLabel.setFont(fontStart);
        atomicPointsLabel.setToolTipText("Atomic points are earned from healing population using the heal improvement");
        atomicPointsLabel.setForeground(Color.cyan);

        //Connections header:

        textConnections = new JLabel("Connections:");
        textConnections.setBounds(150, 0, 450, 50);
        textConnections.setFont(fontPanelCountryInfo);
        textConnections.setForeground(Color.pink);

        //Improvements header:

        textImprovements = new JLabel("Improvements:");
        textImprovements.setBounds(900, 0, 450, 50);
        textImprovements.setFont(fontPanelCountryInfo);
        textImprovements.setForeground(Color.pink);

        //Infected control criteria (for interrupting faster the air connections):

        zakazonychKriteriaLabel = new JLabel();
        zakazonychKriteriaLabel.setBounds(1060, 70, 400, 90);
        zakazonychKriteriaLabel.setIcon(infectedCriteriaIcon);
        //Buy improvement button:
        bPrevent = new JButton();
        bPrevent.setBounds(0, 5, 20, 20);
        bPrevent.setToolTipText("<html>Prevent. Reduces the local infected criteria by 50% <br>" +
                "Buy for 10000 Atomic Points<html>");
        bPrevent.setIcon(dodawacIcon);
        bPrevent.addActionListener(actionEvent -> {

            if (wybranyPanstwo.atomicPoints >= 10000) {
                wybranyPanstwo.atomicPoints -= 10000;
                wybranyPanstwo.limitZakazonychKriterum -= (int) (wybranyPanstwo.limitZakazonychKriterum * 0.5f); //reduce infected criteria by 10 %
                konsolaLabel.setForeground(Color.cyan);
                konsolaLabel.setText("Bought Prevent. Spent - 10000");
                konsolaLabel.addKeyListener(new PrzerwacEvent());

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - ");
            }

        });
        zakazonychKriteriaLabel.add(bPrevent);

        //population increase criteria (for interrupting faster with the sea connections):

        zwrostPopulacjiKriteriaLabel = new JLabel();
        zwrostPopulacjiKriteriaLabel.setBounds(1060, 170, 400, 90);
        zwrostPopulacjiKriteriaLabel.setIcon(poulationCriteriaIcon);
        //Buy Babyboom button:
        bBabyBoom = new JButton();
        bBabyBoom.setBounds(0, 5, 20, 20);
        bBabyBoom.setToolTipText("<html> Baby boom. Increase the country population by 0.0001 %<br>" +
                "Buy for 3000 Atomic Points<html>");
        bBabyBoom.setIcon(dodawacIcon);

        bBabyBoom.addActionListener(actionEvent -> {

            if (wybranyPanstwo.atomicPoints >= 3000) {
                wybranyPanstwo.atomicPoints -= 3000;

                Panstwo.globalnaPopulacja += (int) (wybranyPanstwo.lokalnaPopulacja * 0.0001f);
                wybranyPanstwo.lokalnaPopulacja += (int) (wybranyPanstwo.lokalnaPopulacja * 0.0001f); //increase by 20 % population

                konsolaLabel.setForeground(Color.cyan);
                konsolaLabel.setText("Bought Baby boom. Spent - 10000");

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - .");
            }

        });
        zwrostPopulacjiKriteriaLabel.add(bBabyBoom);

        //Neighbour country infected criteria (for interrupting faster with car connections)

        sasiadyKriteriaLabel = new JLabel();
        sasiadyKriteriaLabel.setBounds(1060, 255, 400, 90);
        sasiadyKriteriaLabel.setToolTipText("");
        sasiadyKriteriaLabel.setIcon(sasiadyKriteriaLabelIcon);
        //Buy keeptheout button:
        bKeepThemOut = new JButton();
        bKeepThemOut.setBounds(0, 5, 20, 20);
        bKeepThemOut.setToolTipText("<html> Keep them out. Reduce your neighbour-country-infected-criteria by half<br>" +
                "Buy for 10000 Atomic Points <html>");
        bKeepThemOut.setIcon(dodawacIcon);
        bKeepThemOut.addActionListener(actionEvent -> {

            if (wybranyPanstwo.atomicPoints >= 10000) {
                wybranyPanstwo.atomicPoints -= 10000;
                wybranyPanstwo.limitPanstwosasiadKriterium /= 2;
                konsolaLabel.setForeground(Color.cyan);
                konsolaLabel.setText("Bought Keep them out. Spent - 10000");

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - .");
            }
        });

        sasiadyKriteriaLabel.add(bKeepThemOut);

        //Time criteria (for interrupting faster with train connections)

        dataKriteriaLabel = new JLabel();
        dataKriteriaLabel.setBounds(950, 70, 400, 90);
        dataKriteriaLabel.setIcon(timecriteriaIcon);
        //Buy Hurry Up button:
        bHurryUp = new JButton();
        bHurryUp.setToolTipText("<html>Hurry Up!. Increase your time criteria by half<br>" +
                "Buy for 10000 Atomic Points<html>");
        bHurryUp.setBounds(0, 5, 20, 20);
        bHurryUp.setIcon(dodawacIcon);
        bHurryUp.addActionListener(actionEvent -> {

            if (wybranyPanstwo.atomicPoints >= 10000) {
                wybranyPanstwo.atomicPoints -= 10000;
                wybranyPanstwo.limitDataKriterium /= 2;// reduce data criteria by half
                konsolaLabel.setForeground(Color.cyan);
                konsolaLabel.setText("Bought Hurry Up!. Spent - 10000");

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - .");
            }
        });
        dataKriteriaLabel.add(bHurryUp);

        //Investing in public health (Mask feature) for decreasing speed of infection:

        mazeczkiLabel = new JLabel();
        mazeczkiLabel.setBounds(950, 171, 400, 90);
        mazeczkiLabel.setForeground(Color.blue);
        mazeczkiLabel.setIcon(mazeczkiLabelIcon);
        //Buy mazeczki button:
        bDodacMazeczki = new JButton();
        bDodacMazeczki.setBounds(0, 5, 20, 20);
        bDodacMazeczki.setToolTipText("<html>Masks. They are reducing the country speed of infection by 50 percent<br>" +
                "Buy at a cost of: 10000 Atomic Points<html>");
        bDodacMazeczki.setIcon(dodawacIcon);
        bDodacMazeczki.addActionListener(actionEvent -> {
            if (wybranyPanstwo.atomicPoints >= 10000) {
                wybranyPanstwo.atomicPoints -= 10000;
                wybranyPanstwo.procentPredkoscWirusa -= wybranyPanstwo.procentPredkoscWirusa * 0.5f;

                konsolaLabel.setForeground(Color.cyan);
                konsolaLabel.setText("Bought Masks. Spent - 10000");

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - .");
            }
        });

        mazeczkiLabel.add(bDodacMazeczki);

        //Death criteria (for interrupting faster with bus connections):

        zmarlychKriteriaLabel = new JLabel();
        zmarlychKriteriaLabel.setBounds(830, 70, 400, 90);
        zmarlychKriteriaLabel.setIcon(deathCriteriaIcon);
        //Buy 6 feet under button:
        b6FeetUnder = new JButton();
        b6FeetUnder.setBounds(0, 5, 20, 20);
        b6FeetUnder.setToolTipText("<html>6 feet under. Reduce the death criteria by half<br>" +
                "Buy for 10000 Atomic Points<html>");
        b6FeetUnder.setIcon(dodawacIcon);
        b6FeetUnder.addActionListener(actionEvent -> {
            if (wybranyPanstwo.atomicPoints >= 10000) {
                wybranyPanstwo.atomicPoints -= 10000;
                wybranyPanstwo.limitZmarlychKriterium /= 2;// reduce death criteria by 10%
                konsolaLabel.setText("Bought 6 feet under. Spent - 10000");

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - .");
            }
        });
        zmarlychKriteriaLabel.add(b6FeetUnder);

        //Investing in public health (Respirator feature) for decreasing speed of infection:

        respiratoryLabel = new JLabel();
        respiratoryLabel.setBounds(830, 171, 400, 90);
        respiratoryLabel.setIcon(respiratorIcon);
        //Buy respirator button:
        bDodacRespirator = new JButton();
        bDodacRespirator.setToolTipText("<html>Respirators. They are reducing the country mortality rate by 50% <br>" +
                "Buy for 10000 Atomic Points<html>");
        bDodacRespirator.setBounds(0, 5, 20, 20);

        bDodacRespirator.setIcon(dodawacIcon);
        bDodacRespirator.addActionListener(actionEvent -> {
            if (wybranyPanstwo.atomicPoints >= 10000) {
                wybranyPanstwo.atomicPoints -= 10000;
                wybranyPanstwo.procentSmiertelnosc -= wybranyPanstwo.procentSmiertelnosc * 0.5f;
                konsolaLabel.setText("Bought Respiratos. Spent - 10000");

            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough - .");
            }
        });
        respiratoryLabel.add(bDodacRespirator);

        //Investing in public health: Heal population (for earning score and atomic points):

        uzdrowicLabel = new JLabel();
        uzdrowicLabel.setBounds(780, 250, 400, 90);
        uzdrowicLabel.setIcon(potionIcon);
        //Buy heal button:
        bUzdrowicPopulacji = new JButton();
        bUzdrowicPopulacji.setBounds(50, 5, 20, 20);
        bUzdrowicPopulacji.setToolTipText("<html>Heal Population. For every person healed you earn Atomic Points<br>" +
                "Buy for $300<html>");
        bUzdrowicPopulacji.setIcon(dodawacIcon);
        bUzdrowicPopulacji.addActionListener(actionEvent -> {

            if (wybranyPanstwo.pieniadze >= 300) {
                wybranyPanstwo.pieniadze -= 300;
                if (wybranyPanstwo.lokalnaLiczbaZakazonych <= 20 && wybranyPanstwo.lokalnaLiczbaZakazonych > 0) {

                    wybranyPanstwo.lokalnaLiczbaZakazonych = 0; // if country has 20 or less infected and avoiding going on negative
                    Panstwo.totalScore += 20 * difficulty / 500;// the more difficult it is, the less points you get
                    wybranyPanstwo.atomicPoints += 1000;

                } else if (wybranyPanstwo.lokalnaLiczbaZakazonych - (int) (wybranyPanstwo.lokalnaLiczbaZakazonych * 0.05f) >= 0) { //if more than 20 infected

                    Panstwo.totalScore += (int) (wybranyPanstwo.lokalnaLiczbaZakazonych * 0.1f) * difficulty / 500;
                    wybranyPanstwo.atomicPoints += (int) (wybranyPanstwo.lokalnaLiczbaZakazonych * 0.1f); // 1 point per every healed person
                    wybranyPanstwo.lokalnaLiczbaZakazonych -= (int) (wybranyPanstwo.lokalnaLiczbaZakazonych * 0.1f);
                }

                konsolaLabel.setForeground(Color.green);
                konsolaLabel.setText("Healed some people. Spent $ 300");


            } else {
                konsolaLabel.setForeground(Color.red);
                konsolaLabel.setText("You dont have enough $");
            }

        });
        uzdrowicLabel.add(bUzdrowicPopulacji);

        //Spread the bad news ( to reduce amount of passengers travelling out)

        wiadomosciLabel = new JLabel();
        wiadomosciLabel.setBounds(950, 250, 400, 90);
        wiadomosciLabel.setIcon(wiadomosciIcon);
        //Buy Scare people button:
        bScarePeople = new JButton();
        bScarePeople.setBounds(0, 5, 20, 20);
        bScarePeople.setToolTipText("<html> Scare people. Reduce by 10% people travelling outside the country<br>" +
                "Buy for 3000 Atomic Points");
        bScarePeople.setIcon(dodawacIcon);
        bScarePeople.addActionListener(actionEvent -> {
            if (wybranyPanstwo.atomicPoints >= 3000)
                wybranyPanstwo.atomicPoints -= 3000;

            wybranyPanstwo.maxAutobus -= wybranyPanstwo.maxAutobus * 0.1f;
            wybranyPanstwo.maxSamolot -= wybranyPanstwo.maxSamolot * 0.1f;
            wybranyPanstwo.maxPaciag -= wybranyPanstwo.maxPaciag * 0.1f;
            wybranyPanstwo.maxSamochod -= wybranyPanstwo.maxSamochod * 0.1f;
            wybranyPanstwo.maxMorska -= wybranyPanstwo.maxMorska * 0.1f;

        });
        wiadomosciLabel.add(bScarePeople);


        //bus connection list:

        listaAutobusowaLabel = new JLabel();
        listaAutobusowaLabel.setBounds(10, 50, 1000, 80);
        listaAutobusowaLabel.setFont(fontPanelConnections);
        listaAutobusowaLabel.setIcon(busIcon);


        //info button:

        bInfoBus = new JButton();
        bInfoBus.setBounds(0, 5, 20, 20);
        bInfoBus.setIcon(infoIcon);
        bInfoBus.setIconTextGap(-7);
        bInfoBus.setBackground(Color.black);
        bInfoBus.addActionListener(actionEvent -> {
            JLabel bus = new JLabel("<html>Bus connections will interrupt if this country reaches " + wybranyPanstwo.limitZmarlychKriterium + " deaths.<br>" +
                    " To interrupt it faster, reduce the criteria by purchasing a boostup (See icon on the right) <br> More info: Bus connections are ocurring every 2 days. Each connection increases the country budget by $5.<br>" +
                    "This country sends out a maximum of " + wybranyPanstwo.maxAutobus + " passengers per connection, from which a max of " + (int) (wybranyPanstwo.maxAutobus * wybranyPanstwo.procentLokalnyZakazonych) + " people is infected. </html>");
            bus.setHorizontalTextPosition(SwingConstants.LEADING);

            bus.setIcon(deathCriteriaIcon);

            JOptionPane.showMessageDialog(null,
                    bus,
                    "Bus Connections", JOptionPane.INFORMATION_MESSAGE);

        });
        listaAutobusowaLabel.add(bInfoBus);
        //Air connection list:

        listaLotniczaLabel = new JLabel();
        listaLotniczaLabel.setBounds(10, 110, 1000, 80);
        listaLotniczaLabel.setFont(fontPanelConnections);
        listaLotniczaLabel.setIcon(samolotIcon);


        //Info button:

        bInfoSamolot = new JButton();
        bInfoSamolot.setBounds(0, 5, 20, 20);
        bInfoSamolot.setIcon(infoIcon);
        bInfoSamolot.setIconTextGap(-7);
        bInfoSamolot.setBackground(Color.black);
        bInfoSamolot.addActionListener(actionEvent -> {
            JLabel plane = new JLabel("<html>Plane connections will interrupt if this country reaches " + (int) (wybranyPanstwo.limitZakazonychKriterum * wybranyPanstwo.lokalnaPopulacja / 100) + " infected.<br>" +
                    " To interrupt it faster, reduce the criteria by purchasing a boostup (See icon on the right) <br> More info: Plane connections are ocurring every 4 days. Each connection increases the country budget by $20.<br>" +
                    "This country sends out a maximum of " + wybranyPanstwo.maxSamolot + " passengers per connection, from which a maximum of a max of " + (int) (wybranyPanstwo.maxSamolot * wybranyPanstwo.procentLokalnyZakazonych) + " people is infected. </html>");
            plane.setHorizontalTextPosition(SwingConstants.LEADING);

            plane.setIcon(infectedCriteriaIcon);

            JOptionPane.showMessageDialog(null,
                    plane,
                    "Air Connections", JOptionPane.INFORMATION_MESSAGE);

        });
        listaLotniczaLabel.add(bInfoSamolot);
        //Sea connection list:

        listaMorskaLabel = new JLabel();
        listaMorskaLabel.setBounds(10, 170, 1000, 80);
        listaMorskaLabel.setFont(fontPanelConnections);
        listaMorskaLabel.setIcon(lodzIcon);


        //Info button:

        bInfoMorskie = new JButton();
        bInfoMorskie.setBounds(0, 5, 20, 20);
        bInfoMorskie.setIcon(infoIcon);
        bInfoMorskie.setIconTextGap(-7);
        bInfoMorskie.setBackground(Color.black);
        bInfoMorskie.addActionListener(actionEvent -> {
            //Icon and list label:
            JLabel sea = new JLabel("<html>Sea connections will interrupt if the population increases by " + wybranyPanstwo.zwrostwPopulacjiKriterium + " people.<br>" +
                    " To interrupt it faster, reduce the criteria by purchasing a boostup (See icon on the right) <br> More info: Sea connections are ocurring every 6 days. Each connection increases the country budget by $30.<br>" +
                    "This country sends out a maximum of " + wybranyPanstwo.maxMorska + " passengers per connection, from which a max of " + (int) (wybranyPanstwo.maxMorska * wybranyPanstwo.procentLokalnyZakazonych) + " people is infected. </html>");
            sea.setHorizontalTextPosition(SwingConstants.LEADING);

            sea.setIcon(poulationCriteriaIcon);

            JOptionPane.showMessageDialog(null,
                    sea,
                    "Car Connections", JOptionPane.INFORMATION_MESSAGE);
        });
        listaMorskaLabel.add(bInfoMorskie);

        //Car connection list:

        listaSamochodowaLabel = new JLabel();
        listaSamochodowaLabel.setBounds(10, 230, 1000, 80);
        listaSamochodowaLabel.setFont(fontPanelConnections);
        listaSamochodowaLabel.setIcon(samochodIcon);


        //Info Button:

        bInfoSamochod = new JButton();
        bInfoSamochod.setBounds(0, 5, 20, 20);
        bInfoSamochod.setIcon(infoIcon);
        bInfoSamochod.setIconTextGap(-7);
        bInfoSamochod.setBackground(Color.black);
        bInfoSamochod.addActionListener(actionEvent -> {
            JLabel car = new JLabel("<html>Car connections will interrupt if any of the bordering country number of infected reaches the " + wybranyPanstwo.limitPanstwosasiadKriterium + " % of it's population.<br>" +
                    " To interrupt it faster, reduce the criteria by purchasing a boostup (See icon on the right) <br> More info: Car connections are ocurring every day. Each connection increases the country budget by $2.<br>" +
                    "This country sends out a maximum of " + wybranyPanstwo.maxSamochod + " passengers per connection, from which a max of " + (int) (wybranyPanstwo.maxSamochod * wybranyPanstwo.procentLokalnyZakazonych) + " people is infected. </html>");
            car.setHorizontalTextPosition(SwingConstants.LEADING);

            car.setIcon(sasiadyKriteriaLabelIcon);

            JOptionPane.showMessageDialog(null,
                    car,
                    "Car Connections", JOptionPane.INFORMATION_MESSAGE);

        });
        listaSamochodowaLabel.add(bInfoSamochod);
        //Train connection list:

        listaKolejowaLabel = new JLabel();
        listaKolejowaLabel.setBounds(10, 290, 1000, 80);
        listaKolejowaLabel.setFont(fontPanelConnections);
        listaKolejowaLabel.setIcon(paciagIcon);


        //info Butto:

        bInfoPaciag = new JButton();
        bInfoPaciag.setBounds(0, 5, 20, 20);
        bInfoPaciag.setIconTextGap(-7);
        bInfoPaciag.setIcon(infoIcon);
        bInfoPaciag.setBackground(Color.black);
        bInfoPaciag.addActionListener(actionEvent -> {
            //Icon and list label:
            JLabel train = new JLabel("<html>Train connections will interrupt automatically after day " + wybranyPanstwo.limitDataKriterium + ".<br>" +
                    " To interrupt it sooner, reduce the criteria by purchasing a boostup (See icon on the right) <br> More info: Train connections are ocurring every 3 days. Each connection increases the country budget by $10.<br>" +
                    "This country sends out a maximum of " + wybranyPanstwo.maxPaciag + " passengers per connection, from which a max of " + (int) (wybranyPanstwo.maxPaciag * wybranyPanstwo.procentLokalnyZakazonych) + " people is infected. </html>");
            train.setHorizontalTextPosition(SwingConstants.LEADING);

            train.setIcon(timecriteriaIcon);

            JOptionPane.showMessageDialog(null,
                    train,
                    "Train connections", JOptionPane.INFORMATION_MESSAGE);
        });
        listaKolejowaLabel.add(bInfoPaciag);


        //Instatiating the improvement panel and adding its elements:

        panelUlepszen = new JPanel();
        panelUlepszen.setBounds(230, 600, 1255, 400);
        panelUlepszen.setLayout(null);
        panelUlepszen.add(panstwoNaglowekLabel);
        panelUlepszen.add(listaAutobusowaLabel);
        panelUlepszen.add(listaLotniczaLabel);
        panelUlepszen.add(listaMorskaLabel);
        panelUlepszen.add(listaSamochodowaLabel);
        panelUlepszen.add(listaKolejowaLabel);
        panelUlepszen.add(lastactivityLabel);
        panelUlepszen.add(konsolaLabel);
        panelUlepszen.add(textConnections);
        panelUlepszen.add(textImprovements);
        panelUlepszen.add(mazeczkiLabel);
        panelUlepszen.add(respiratoryLabel);
        panelUlepszen.add(uzdrowicLabel);
        panelUlepszen.add(wiadomosciLabel);
        panelUlepszen.add(dataKriteriaLabel);
        panelUlepszen.add(zakazonychKriteriaLabel);
        panelUlepszen.add(zwrostPopulacjiKriteriaLabel);
        panelUlepszen.add(zmarlychKriteriaLabel);
        panelUlepszen.add(sasiadyKriteriaLabel);
        panelUlepszen.setBackground(Color.black);

        //userNameTextField for highscores:
        userNameTextField = new JTextField("ENTER YOUR NAME AND PRESS ENTER");
        userNameTextField.setBounds(320, 650, 200, 40);
        userNameTextField.setVisible(true);

        //End of game panel:

        koniecGryPanel = new JPanel();
        koniecGryPanel.setBounds(430, 100, 800, 900);
        koniecGryPanel.setBackground(Color.black);
        koniecGryPanel.setVisible(false);
        koniecGryPanel.setLayout(null);
        koniecGryPanel.add(userNameTextField);
        infoKoniecGrylabel = new JLabel();
        infoKoniecGrylabel.setBounds(100, 200, 800, 200);
        infoKoniecGrylabel.setFont(fontTitle);
        infoKoniecGrylabel.setForeground(Color.yellow);
        koniecGryPanel.add(infoKoniecGrylabel);

        //Right pannel with country information:

        panelPanstwaInfo = new JPanel();
        panelPanstwaInfo.setBounds(1285, 4, 200, 1300);
        panelPanstwaInfo.setLayout(null);
        panelPanstwaInfo.setBackground(Color.black);
        panelPanstwaInfo.add(pieniadzeLabel);
        panelPanstwaInfo.add(atomicPointsLabel);
        panelPanstwaInfo.add(lokalnaLiczbaZakazonychLabel);
        panelPanstwaInfo.add(liczbaZmarlychLabel);

        // Panel with the country buttons:

        panelPanstwaButtons = new JPanel();
        panelPanstwaButtons.setBounds(0, -8, 240, 981);
        panelPanstwaButtons.setLayout(new GridLayout(33, 0));
        panelPanstwaButtons.setOpaque(false);

        // List for setting up every button

        List<JButton> bCountryList = new ArrayList<>();

        Collections.addAll(bCountryList, bChina, bJapan, bMongolia, bRussia,
                bAfghanistan, bIndia, bSoutheastAsia, bIndonesia, bNewGuinea,
                bAustralia, bEasternEurope, bPoland, bSouthernEurope, bWesternEurope,
                bGreatBritain, bScandinavia, bIceland, bGreenland, bMiddleEast, bEgypt,
                bNorthAfrica, bEastAfrica, bCongo, bSouthAfrica, bMadagascar, bBrazil,
                bArgentina, bPeru, bUruguay, bVenezuela, bCentralAmerica, bUsa, bCanada);


        for (JButton button : bCountryList) {
            button.setBackground(Color.black);
            button.setBorder(null);
            button.setFont(buttons);
            button.setHorizontalAlignment(SwingConstants.LEFT);
            button.setForeground(Color.lightGray);

            panelPanstwaButtons.add(button);
            button.addActionListener(actionEvent -> {
                for (Panstwo panstwo : listaPanstwa)
                    if (button.getText().contains(panstwo.nazwa.toString())) {
                        wybranyPanstwo = panstwo;
                        panstwoNaglowekLabel.setText(panstwo.nazwa.toString());
                        serviceKontrolaKriteria.execute(new TaskKontrolaKriteria());
                    }
            });
        }

        // Instantiating background image pannel:
        panelWorldMapImage = new JPanel();
        panelWorldMapImage.add(new JLabel(new ImageIcon(img)));

        // Setting up a small typing area to add a keylistener for pausing the game

        JTextField typingArea = new JTextField(" Click here and press esc to pause the game");
        typingArea.setBounds(910, 5, 250, 20);
        typingArea.setOpaque(false);
        typingArea.setForeground(Color.yellow);
        typingArea.setBorder(null);
        typingArea.addKeyListener(new PrzerwacEvent());


        //adding the components to the JFrame (this)
        add(typingArea);
        add(koniecGryPanel);
        add(panstwoNaglowekLabel);
        add(totalScoreLabel);
        add(populacjaLabel);
        add(dataLabel);
        add(panelUlepszen);
        add(panelPanstwaInfo);
        add(panelPanstwaButtons);
        add(panelWorldMapImage);


        bChina.doClick();// we start the game with one country selected to avoid nullpointer exception
    }

}

