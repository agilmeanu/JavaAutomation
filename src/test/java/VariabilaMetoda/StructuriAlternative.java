package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative= if-then-else; switch-case
    @Test
    public void metodatest() {
//        metodaverificarenumar(3);
//        metodaverificarenumar(9);
//        metodaverificarenumar(5);
        metodaverificarenumarParPOzitiv(-2);
        metodaverificarenumarParPOzitiv(-1);
        metodaverificarenumarParPOzitiv(0);
        metodaverificarenumarParPOzitiv(1);
        metodaverificarenumarParPOzitiv(2);


    }
    //verificam un numar mai mare decat 5
    public void metodaverificarenumar(int Valoare) {
        if (Valoare > 5) {
            System.out.println("numarul " + Valoare + " este mai mare decat 5");
        } else if (Valoare < 5) {
            System.out.println("numarul " + Valoare + " este mai mic decat 5");
        } else {
            System.out.println("numarul " + Valoare + " este egal cu 5");
        }
    }
    //verificam daca un numar este par pozitiv sau par negativ
    public void metodaverificarenumarParPOzitiv(int Valoare) {
        if (Valoare > 0) {          // daca numarul este pozitiv
            if (Valoare % 2 == 0) {            //daca valoarea este divizibila cu 2
                System.out.println("Numarul "+ Valoare+" este par pozitiv");
            } else {
                System.out.println("Numarul "+ Valoare+" este impar pozitiv");
            }
        }
        else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul "+ Valoare+" este par negativ");
            } else {
                System.out.println("Numarul " + Valoare+" este impar negativ");
            }
        }
        else if (Valoare == 0) {
            System.out.println("Numarul "+ Valoare+" este zero");
        }
    }
}
