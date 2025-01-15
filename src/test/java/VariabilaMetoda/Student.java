package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    // clasa= sablon care defineste proprietatile si comportamentul unei entitati specifice - in cazul nostru Studentul

    // intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa ai mai multe clase cu acelasi nume)

    // intr-o clasa putem defini proprietatile si actiunile entotatii

    // variabila=propietatea unei clase

    // variabilele pot fi de 2 feluri: global si local

    // variabilele globale = sunt vizibile peste tot in proiect

    // variabilele locale = sunt vizibile doar in locul unde le-am declarat

    // ca sa definim o variabila globala : accesscontrol (public) tip variabila nume variabila

    // in momentul in care definim o variabila nu este obligatoriu sa ii dam o valoare - valoare se da pe parcurs

    // metoda=actiunea unei clase

    // exista 2 tipuri de metode: void si return

    // void - sunt cele mai folosite, executa actiunea si iti da posilitatea sa vezi rezultatul pe care l-ai facut.

    // return - sunt metode ce excuta actiunea si o returneaza doar mie


    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Strada;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;




@Test
    public void prezentareStudent() {
    Nume = "Coco";
    Prenume = "Crina";
    Varsta = 10;
    Strada = "Valea Plopilor";
    Inaltime = 165.5;
    Greutate = 25f;
    Sex = 'F';
    AreDiploma = false;

    System.out.println("Numele studentului este: " + Nume + " " + Prenume);
    System.out.println("Adresa studentului este: " + Strada);
    System.out.println("Are varsta de: " + Varsta + " Ani");
    System.out.println("Are inaltimea de: " + Inaltime + " m");
    System.out.println("Greutatea lui este: " + Greutate + " Kg");
    System.out.println("Sexul Studentului: " + Sex);
    System.out.println("Are diploma? " + AreDiploma);

    calculMedie();
}
    public void calculMedie(){
        Integer nota1=9;
        Integer nota2=8;
        Integer nota3=7;
        Integer medie=(nota1+nota2+nota3)/3;
        System.out.println("Media studentului este: " +medie);
    }
}
