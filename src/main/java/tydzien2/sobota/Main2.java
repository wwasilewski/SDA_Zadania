package tydzien2.sobota;

import java.util.ArrayList;
import java.util.List;

public class Main2
{
    public static void main(String[] args) {
        Osoba3 jan = new Osoba3("jan", "kowalski");
        Pracownik zdzislaw = new Pracownik("zdzislaw", "Kwiatkowski", 2100);
        Student gracjan = new Student("gracjan", "frywolny", 2345);

        jan.opiszSie();
        zdzislaw.opiszSie();
        gracjan.opiszSie();

        List<Osoba3> listaOsob = new ArrayList<Osoba3>();
        listaOsob.add(jan);
        listaOsob.add(zdzislaw);
        listaOsob.add(gracjan);

    }


}
