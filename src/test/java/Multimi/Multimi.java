package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    // colectie de obiecte care fac parte dintr-o anumita cateorie, care au o conditie ce le uneste pe toate
    // se pot reprezenta prin mai multe metode
    // array, list, map

    @Test
    public void metodatest() {
//        colegiCurs();
//        colegiCursLista();
//        categoriiObiecte();
        oraseleTarii();
    }

    //exemplu array
    public void colegiCurs() {
        String[] colegi = new String[5];
        colegi[0] = "Ana";
        colegi[1] = "Bianca";
        colegi[2] = "Claudiu";
        colegi[3] = "David";
        colegi[4] = "Emanuela";
        for (int i = 0; i < colegi.length; i++) {
            System.out.println("Numele colegului este: " + colegi[i]);
        }
    }

    // exemplu lista
    public void colegiCursLista() {
        List<String> colegi = new ArrayList<String>();
        colegi.add("Ana");
        colegi.add("Bianca");
        colegi.add("Claudiu");
        colegi.add("David");
        colegi.add("Emanuela");
        int i = 0;
        while (i < colegi.size()) {
            System.out.println("Numele colegului este: " + colegi.get(i));
            i++;
        }
    }

    // exemplu map
    // map -> cheie=valoare
    public void categoriiObiecte() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    public void oraseleTarii() {
        HashMap<String, List<String>> clasificare = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Brasov");
        oraseRomania.add("Constanta");
        oraseRomania.add("Sibiu");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Florenta");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Valencia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Malaga");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));

        }
    }
}
