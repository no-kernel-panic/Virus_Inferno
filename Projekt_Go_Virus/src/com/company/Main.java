package com.company;

import javax.swing.*;
import java.io.IOException;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Panstwo china = new Panstwo(144000000, 50000, PanstwaNazwy.CHINA, 0.107f, 1f, 100000, 685, 10317);
        Panstwo uruguay = new Panstwo(3500000, 0, PanstwaNazwy.URUGUAY, 0.05f, 1.201f, 10000, 1150, 10283);
        Panstwo poland = new Panstwo(37900000, 0, PanstwaNazwy.POLAND, 0.06f, 1.2f, 11000, 1140, 10282);
        Panstwo canada = new Panstwo(37500000, 0, PanstwaNazwy.CANADA, 0.07f, 1.109f, 12000, 1130, 10281);
        Panstwo usa = new Panstwo(328200000, 0, PanstwaNazwy.USA, 0.8f, 0.108f, 13000, 1125, 10280);
        Panstwo central_america = new Panstwo(47500000, 0, PanstwaNazwy.CENTRAL_AMERICA, 0.9f, 1.107f, 14000, 101120, 10257);
        Panstwo argentina = new Panstwo(44500000, 0, PanstwaNazwy.ARGENTINA, 0.0f, 1.106f, 15000, 1115, 10256);
        Panstwo brasil = new Panstwo(209500000, 0, PanstwaNazwy.BRASIL, 0.01f, 1.105f, 16000, 1110, 10255);
        Panstwo peru = new Panstwo(32000000, 0, PanstwaNazwy.PERU, 0.02f, 1.104f, 17000, 1100, 10254);
        Panstwo venezuela = new Panstwo(28900000, 0, PanstwaNazwy.VENEZUELA, 0.03f, 1.103f, 18000, 1090, 10253);
        Panstwo great_britain = new Panstwo(66600000, 0, PanstwaNazwy.GREAT_BRITAIN, 0.04f, 1.102f, 19000, 1050, 10252);
        Panstwo iceland = new Panstwo(365000, 0, PanstwaNazwy.ICELAND, 0.05f, 1.101f, 20000, 1000, 10251);
        Panstwo scandinavia = new Panstwo(21000000, 0, PanstwaNazwy.SCANDINAVIA, 0.06f, 1.1f, 21000, 970, 10250);
        Panstwo southern_europe = new Panstwo(100500000, 0, PanstwaNazwy.SOUTHERN_EUROPE, 0.07f, 1.09f, 22000, 920, 10154);
        Panstwo eastern_europe = new Panstwo(200500000, 0, PanstwaNazwy.EASTERN_EUROPE, 0.08f, 1.08f, 23000, 860, 10153);
        Panstwo western_europe = new Panstwo(200500000, 0, PanstwaNazwy.WESTERN_EUROPE, 0.09f, 1.07f, 24000, 810, 10152);
        Panstwo congo = new Panstwo(84000000, 0, PanstwaNazwy.CONGO, 0.1f, 1.06f, 25000, 760, 10151);
        Panstwo east_africa = new Panstwo(537900000, 0, PanstwaNazwy.EAST_AFRICA, 0.101f, 1.05f, 26000, 710, 10150);
        Panstwo madagascar = new Panstwo(26500000, 0, PanstwaNazwy.MADAGASCAR, 0.102f, 0, 0, 0, 10100);
        Panstwo egypt = new Panstwo(98500000, 0, PanstwaNazwy.EGYPT, 0.103f, 1.04f, 28000, 708, 1087);
        Panstwo north_africa = new Panstwo(195000000, 0, PanstwaNazwy.NORTH_AFRICA, 0.104f, 1.03f, 29000, 707, 1088);
        Panstwo south_africa = new Panstwo(100500000, 0, PanstwaNazwy.SOUTH_AFRICA, 0.105f, 1.02f, 30000, 685, 1089);
        Panstwo afghanistan = new Panstwo(40000000, 0, PanstwaNazwy.AFGHANISTAN, 0.106f, 1.01f, 31000, 675, 0);
        Panstwo india = new Panstwo(1353000000, 0, PanstwaNazwy.INDIA, 0.108f, 0.9f, 33000, 675, 10316);
        Panstwo russia = new Panstwo(144500000, 0, PanstwaNazwy.RUSSIA, 0.109f, 0.8f, 34000, 655, 10315);
        Panstwo japan = new Panstwo(126000000, 0, PanstwaNazwy.JAPAN, 0.2f, 0, 0, 0, 10300);
        Panstwo mongolia = new Panstwo(3100000, 0, PanstwaNazwy.MONGOLIA, 0.201f, 0.7f, 35000, 605, 10205);
        Panstwo southeast_asia = new Panstwo(200500000, 0, PanstwaNazwy.SOUTHEAST_ASIA, 0.202f, 0.6f, 36000, 555, 10203);
        Panstwo australia = new Panstwo(25000000, 0, PanstwaNazwy.AUSTRALIA, 0.203f, 0, 0, 0, 10210);
        Panstwo new_guinea = new Panstwo(8000000, 0, PanstwaNazwy.NEW_GUINEA, 0.204f, 0, 0, 0, 10200);
        Panstwo middle_east = new Panstwo(411000000, 0, PanstwaNazwy.MiDDLE_EAST, 0.205f, 0.5f, 37000, 385, 10101);
        Panstwo indonesia = new Panstwo(267500000, 0, PanstwaNazwy.INDONESIA, 0.206f, 0, 38000, 375, 10099);
        Panstwo greenland = new Panstwo(56000000, 0, PanstwaNazwy.GREENLAND, 0.207f, 0, 39000, 365, 10090);


        for (Panstwo panstwo : Gui.listaPanstwa) {
            Panstwo.globalnaPopulacja += panstwo.lokalnaPopulacja;
            Panstwo.globalnaLiczbaZakazonych += panstwo.lokalnaLiczbaZakazonych;
        }
        Collections.addAll(uruguay.listPolaczeniaSamochodowa, peru, argentina, brasil);
        Collections.addAll(uruguay.listPolaczeniaLotnicza, peru, argentina, venezuela, usa, western_europe);
        Collections.addAll(uruguay.listPolaczeniaKolejowa, argentina, brasil, venezuela);
        Collections.addAll(uruguay.listPolaczeniaAutobusowy, brasil, venezuela);
        Collections.addAll(uruguay.listPolaczeniaMorskie, argentina);

        Collections.addAll(peru.listPolaczeniaSamochodowa, argentina, brasil, venezuela, uruguay);
        Collections.addAll(peru.listPolaczeniaKolejowa, uruguay, venezuela, brasil);
        Collections.addAll(peru.listPolaczeniaLotnicza, southern_europe, central_america, usa, poland, congo);
        Collections.addAll(peru.listPolaczeniaAutobusowy, venezuela, brasil);
        Collections.addAll(peru.listPolaczeniaMorskie, central_america);

        Collections.addAll(argentina.listPolaczeniaLotnicza, brasil, poland, southern_europe, australia, usa);
        Collections.addAll(argentina.listPolaczeniaSamochodowa, uruguay, peru);
        Collections.addAll(argentina.listPolaczeniaKolejowa, venezuela, uruguay, peru);
        Collections.addAll(argentina.listPolaczeniaAutobusowy, venezuela, peru);
        Collections.addAll(argentina.listPolaczeniaMorskie, brasil);

        Collections.addAll(brasil.listPolaczeniaSamochodowa, venezuela, uruguay, peru);
        Collections.addAll(brasil.listPolaczeniaLotnicza, usa, canada, venezuela, eastern_europe, scandinavia);
        Collections.addAll(brasil.listPolaczeniaKolejowa, venezuela, peru, central_america);
        Collections.addAll(brasil.listPolaczeniaAutobusowy, venezuela, peru);
        Collections.addAll(brasil.listPolaczeniaMorskie, north_africa);

        Collections.addAll(venezuela.listPolaczeniaSamochodowa, central_america, peru, brasil);
        Collections.addAll(venezuela.listPolaczeniaLotnicza, western_europe, north_africa, poland, scandinavia, madagascar);
        Collections.addAll(venezuela.listPolaczeniaKolejowa, usa, central_america, canada);
        Collections.addAll(venezuela.listPolaczeniaAutobusowy, central_america, canada);
        Collections.addAll(venezuela.listPolaczeniaMorskie, usa);

        Collections.addAll(central_america.listPolaczeniaSamochodowa, usa, venezuela);
        Collections.addAll(central_america.listPolaczeniaLotnicza, canada, greenland, great_britain, south_africa, argentina);
        Collections.addAll(central_america.listPolaczeniaKolejowa, canada, usa, venezuela);
        Collections.addAll(central_america.listPolaczeniaAutobusowy, usa, venezuela);
        Collections.addAll(central_america.listPolaczeniaMorskie, venezuela);

        Collections.addAll(usa.listPolaczeniaSamochodowa, central_america, canada);
        Collections.addAll(usa.listPolaczeniaLotnicza, great_britain, japan, china, australia, russia);
        Collections.addAll(usa.listPolaczeniaKolejowa, venezuela, central_america, canada);
        Collections.addAll(usa.listPolaczeniaAutobusowy, central_america, canada);
        Collections.addAll(usa.listPolaczeniaMorskie, greenland);

        Collections.addAll(canada.listPolaczeniaSamochodowa, usa);
        Collections.addAll(canada.listPolaczeniaLotnicza, greenland, japan, iceland, eastern_europe, western_europe);
        Collections.addAll(canada.listPolaczeniaKolejowa, usa, central_america, venezuela);
        Collections.addAll(canada.listPolaczeniaAutobusowy, usa, central_america);
        Collections.addAll(canada.listPolaczeniaMorskie, greenland);

        Collections.addAll(greenland.listPolaczeniaLotnicza, usa, great_britain, russia, iceland, southern_europe);
        Collections.addAll(greenland.listPolaczeniaMorskie, poland, north_africa, venezuela, eastern_europe, brasil);

        Collections.addAll(iceland.listPolaczeniaLotnicza, great_britain, scandinavia, western_europe, china, afghanistan);
        Collections.addAll(iceland.listPolaczeniaMorskie, great_britain, scandinavia, western_europe, poland, usa, canada);

        Collections.addAll(great_britain.listPolaczeniaLotnicza, usa, china, japan, south_africa, poland);
        Collections.addAll(great_britain.listPolaczeniaMorskie, usa, canada, greenland, iceland, north_africa, south_africa, poland);

        Collections.addAll(scandinavia.listPolaczeniaSamochodowa, eastern_europe);
        Collections.addAll(scandinavia.listPolaczeniaLotnicza, russia, mongolia, china, australia, middle_east);
        Collections.addAll(scandinavia.listPolaczeniaKolejowa, poland, southern_europe, eastern_europe);
        Collections.addAll(scandinavia.listPolaczeniaAutobusowy, poland, eastern_europe);
        Collections.addAll(scandinavia.listPolaczeniaMorskie, poland);

        Collections.addAll(western_europe.listPolaczeniaSamochodowa, poland, southern_europe);
        Collections.addAll(western_europe.listPolaczeniaLotnicza, north_africa, egypt, great_britain, usa, china);
        Collections.addAll(western_europe.listPolaczeniaKolejowa, poland, eastern_europe, russia);
        Collections.addAll(western_europe.listPolaczeniaAutobusowy, poland, eastern_europe);
        Collections.addAll(western_europe.listPolaczeniaMorskie, north_africa);

        Collections.addAll(poland.listPolaczeniaLotnicza, japan, china, western_europe, uruguay, southeast_asia);
        Collections.addAll(poland.listPolaczeniaSamochodowa, western_europe, southern_europe, eastern_europe);
        Collections.addAll(poland.listPolaczeniaKolejowa, eastern_europe, afghanistan, middle_east);
        Collections.addAll(poland.listPolaczeniaAutobusowy, eastern_europe, afghanistan);
        Collections.addAll(poland.listPolaczeniaMorskie, great_britain);

        Collections.addAll(eastern_europe.listPolaczeniaSamochodowa, poland, russia, scandinavia, afghanistan, southern_europe);
        Collections.addAll(eastern_europe.listPolaczeniaLotnicza, china, mongolia, southeast_asia, new_guinea, east_africa);
        Collections.addAll(eastern_europe.listPolaczeniaKolejowa, russia, mongolia, china);
        Collections.addAll(eastern_europe.listPolaczeniaAutobusowy, russia, mongolia);
        Collections.addAll(eastern_europe.listPolaczeniaMorskie, russia);

        Collections.addAll(southern_europe.listPolaczeniaSamochodowa, poland, middle_east, eastern_europe, western_europe);
        Collections.addAll(southern_europe.listPolaczeniaLotnicza, east_africa, india, indonesia, japan, australia);
        Collections.addAll(southern_europe.listPolaczeniaKolejowa, middle_east, india, china);
        Collections.addAll(southern_europe.listPolaczeniaAutobusowy, middle_east, india);
        Collections.addAll(southern_europe.listPolaczeniaMorskie, egypt);

        Collections.addAll(north_africa.listPolaczeniaSamochodowa, egypt, congo, east_africa);
        Collections.addAll(north_africa.listPolaczeniaLotnicza, india, middle_east, southeast_asia, madagascar, uruguay);
        Collections.addAll(north_africa.listPolaczeniaKolejowa, congo, east_africa, south_africa);
        Collections.addAll(north_africa.listPolaczeniaAutobusowy, congo, east_africa);
        Collections.addAll(north_africa.listPolaczeniaMorskie, uruguay);

        Collections.addAll(egypt.listPolaczeniaSamochodowa, north_africa, east_africa);
        Collections.addAll(egypt.listPolaczeniaLotnicza, russia, madagascar, india, china, mongolia);
        Collections.addAll(egypt.listPolaczeniaKolejowa, north_africa, congo, south_africa);
        Collections.addAll(egypt.listPolaczeniaAutobusowy, north_africa, congo);
        Collections.addAll(egypt.listPolaczeniaMorskie, middle_east);

        Collections.addAll(congo.listPolaczeniaSamochodowa, north_africa, east_africa, south_africa);
        Collections.addAll(congo.listPolaczeniaLotnicza, south_africa, egypt, middle_east, southern_europe, mongolia);
        Collections.addAll(congo.listPolaczeniaKolejowa, egypt, north_africa, east_africa);
        Collections.addAll(congo.listPolaczeniaAutobusowy, north_africa, east_africa);
        Collections.addAll(congo.listPolaczeniaMorskie, brasil);

        Collections.addAll(east_africa.listPolaczeniaSamochodowa, south_africa, congo, egypt, north_africa);
        Collections.addAll(east_africa.listPolaczeniaLotnicza, madagascar, usa, peru, china, india);
        Collections.addAll(east_africa.listPolaczeniaKolejowa, north_africa, egypt);
        Collections.addAll(east_africa.listPolaczeniaAutobusowy, north_africa, egypt);
        Collections.addAll(east_africa.listPolaczeniaMorskie, madagascar);

        Collections.addAll(south_africa.listPolaczeniaSamochodowa, congo, east_africa);
        Collections.addAll(south_africa.listPolaczeniaLotnicza, india, middle_east, afghanistan, argentina, brasil);
        Collections.addAll(south_africa.listPolaczeniaKolejowa, congo, north_africa, egypt);
        Collections.addAll(south_africa.listPolaczeniaAutobusowy, congo, north_africa);
        Collections.addAll(south_africa.listPolaczeniaMorskie, madagascar);

        Collections.addAll(madagascar.listPolaczeniaLotnicza, australia, new_guinea, southern_europe, great_britain, canada);
        Collections.addAll(madagascar.listPolaczeniaMorskie, australia, new_guinea, india, east_africa, south_africa, middle_east);

        Collections.addAll(australia.listPolaczeniaLotnicza, china, russia, new_guinea, southeast_asia, indonesia);
        Collections.addAll(australia.listPolaczeniaMorskie, china, russia, new_guinea, southeast_asia, indonesia, mongolia);

        Collections.addAll(indonesia.listPolaczeniaLotnicza, southeast_asia, russia, poland, scandinavia, middle_east);
        Collections.addAll(indonesia.listPolaczeniaMorskie, china, russia, new_guinea, southeast_asia, indonesia, mongolia);


        Collections.addAll(new_guinea.listPolaczeniaLotnicza, middle_east, china, usa, north_africa, western_europe);
        Collections.addAll(new_guinea.listPolaczeniaMorskie, china, russia, new_guinea, southeast_asia, indonesia, mongolia);

        Collections.addAll(southeast_asia.listPolaczeniaSamochodowa, india, china);
        Collections.addAll(southeast_asia.listPolaczeniaLotnicza, australia, japan, peru, scandinavia, greenland, iceland);
        Collections.addAll(southeast_asia.listPolaczeniaKolejowa, india, middle_east, afghanistan);
        Collections.addAll(southeast_asia.listPolaczeniaAutobusowy, india, middle_east);
        Collections.addAll(southeast_asia.listPolaczeniaMorskie, india);


        Collections.addAll(china.listPolaczeniaSamochodowa, mongolia, southeast_asia, india, afghanistan, russia);
        Collections.addAll(china.listPolaczeniaLotnicza, usa, canada, iceland, eastern_europe, southern_europe, middle_east);
        Collections.addAll(china.listPolaczeniaKolejowa, russia, eastern_europe, poland);
        Collections.addAll(china.listPolaczeniaAutobusowy, russia, eastern_europe);
        Collections.addAll(china.listPolaczeniaMorskie, japan);

        Collections.addAll(mongolia.listPolaczeniaSamochodowa, china, russia);
        Collections.addAll(mongolia.listPolaczeniaLotnicza, afghanistan, middle_east, congo, new_guinea, madagascar);
        Collections.addAll(mongolia.listPolaczeniaKolejowa, china, india, southeast_asia);
        Collections.addAll(mongolia.listPolaczeniaAutobusowy, china, southeast_asia);
        Collections.addAll(mongolia.listPolaczeniaMorskie, japan);

        Collections.addAll(russia.listPolaczeniaSamochodowa, eastern_europe, afghanistan, china, mongolia);
        Collections.addAll(russia.listPolaczeniaLotnicza, usa, greenland, central_america, south_africa, middle_east);
        Collections.addAll(russia.listPolaczeniaKolejowa, eastern_europe, poland, western_europe);
        Collections.addAll(russia.listPolaczeniaAutobusowy, eastern_europe, poland);
        Collections.addAll(russia.listPolaczeniaMorskie, eastern_europe);

        Collections.addAll(japan.listPolaczeniaLotnicza, china, venezuela, middle_east, australia, southeast_asia);
        Collections.addAll(japan.listPolaczeniaMorskie, china, venezuela, middle_east, australia, southeast_asia, china);

        Collections.addAll(india.listPolaczeniaSamochodowa, southeast_asia, china, afghanistan, middle_east);
        Collections.addAll(india.listPolaczeniaLotnicza, russia, uruguay, mongolia, china, brasil);
        Collections.addAll(india.listPolaczeniaKolejowa, southeast_asia, afghanistan, eastern_europe);
        Collections.addAll(india.listPolaczeniaAutobusowy, southeast_asia, afghanistan);
        Collections.addAll(india.listPolaczeniaMorskie, southeast_asia);

        Collections.addAll(afghanistan.listPolaczeniaSamochodowa, russia, eastern_europe, middle_east, china, india);
        Collections.addAll(afghanistan.listPolaczeniaLotnicza, central_america, japan, east_africa, north_africa, egypt);
        Collections.addAll(afghanistan.listPolaczeniaKolejowa, eastern_europe, southern_europe, china);
        Collections.addAll(afghanistan.listPolaczeniaAutobusowy, eastern_europe, china);

        Collections.addAll(middle_east.listPolaczeniaSamochodowa, southern_europe, eastern_europe, afghanistan, india);
        Collections.addAll(middle_east.listPolaczeniaLotnicza, east_africa, north_africa, congo, south_africa, madagascar);
        Collections.addAll(middle_east.listPolaczeniaKolejowa, afghanistan, india, china);
        Collections.addAll(middle_east.listPolaczeniaAutobusowy, afghanistan, india);
        Collections.addAll(middle_east.listPolaczeniaMorskie, india);

        Gui.wybranyPanstwo = china;

        SwingUtilities.invokeLater(() -> {
            try {
                new Gui();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }
}
