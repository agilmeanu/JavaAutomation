package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {
    @Test
    public void metodaTest() {
        Avion avion1 = new Avion("Pasageri", "Boieng", "B-130", 400, "Kerosen");
        avion1.prezentareAvion();
        Avion avion2 = new Avion ("pasageri", "Boieng", "B-100", 120, "Kerosen");
        avion2.prezentareAvion();
        Avion avion3 = new Avion("pasageri", "Boieng", "B-200", 150, "Kerosen", 600);
        avion3.prezentareAvion();
    }
}
