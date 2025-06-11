package ObiectConstructor;

public class Avion {
    //Constructor = are ca rol sa initializeze variabilele unei Clase
    //recunoatem un constructor dupa numele clasei
    //intr-o clasa putem avea "n" constructori care se diferentiaza dupa numarul sau tipul de parametrii
    //exista 2 tipuri de constructori: cu parametrii sau fara parametrii
    //intr-o clasa avem tot timpul un constructor default (fara parametrii)
    //constructorul trebuie sa fie public
    //obiect = instanta unei clase
    //dintr-o clasa putem sa facem mai multe obiecte
    //ca sa initializam un obiect ne folosim de cuvantul "new"
    //cand se initializeaza un obiect se apeleaza constructorul clasei

        public String tip;
        public String marca;
        public String model;
        public Integer capacitatePasageri;
        public String tipCombustibil;
        public Integer numarBagaje;
//aceasta varianta de mai jos este scrisa de mana linie cu linie
//        public Avion (String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
//            this.tip = tip;
//            this.marca = marca;
//            this.model = model;
//            this.capacitatePasageri = capacitatePasageri;
//            this.tipCombustibil = tipCombustibil;
//        }
    //cand intr-o clasa avem un parametru si o variabila cu acelasi nume diferentierea se face cu acest this.
    // acest this. pus in fata tot timpul pointeaza catre variabila din interiorul clasei

    //varianta rapida este: click dreapta -> Generate -> constructor -> selectam toate variabilele din clasa

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului este:" + tip);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Model avionului este: " + model);
        System.out.println("Capacitatea Avionului este: "+ capacitatePasageri);
        System.out.println("Tipul combustibilului folosit este: " + tipCombustibil);
        if (numarBagaje != null) {
            System.out.println("Numar de bagaje ale avionului sunt: " + numarBagaje);
        } else {
            System.out.println("Avionul nu are bagaje");
        }

    }
}
