package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public String model;
    public String culoare;
    public Integer AnFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi","Q4","Mov",2010);
        dateMasina("BMV","X4","Alb",2015);
        calculMedie(5.3, 9.5);
        calculMedie(8.3, 7.6);
    }

    public void dateMasina(String param1, String param2, String param3, Integer param4){
        marca=param1;
        model=param2;
        culoare=param3;
        AnFabricatie=param4;

        System.out.println("Marca masinii este: "+marca);
        System.out.println("Model masinii este: "+model);
        System.out.println("Culoare masinii este: "+culoare);
        System.out.println("AnFabricatie masinii este: "+AnFabricatie);
    }
    //calculam media la 2 numere
    public void calculMedie(Double nota1, Double nota2){
        Double rezultat=(nota1+nota2)/2;
        System.out.println("Media este: " +rezultat);
    }

}
