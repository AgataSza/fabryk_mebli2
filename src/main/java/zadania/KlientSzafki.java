package zadania;

import zadania.meble.Meble;
import zadania.meble.Szafki;


public class KlientSzafki implements FabrykaMebli {

    @Override
    public Meble stworzMebleAbra() {
        Szafki szafki = new Szafki();
        szafki.iloscNog(3);
        szafki.iloscPolek(4);
        szafki.material("sosnaA");
        return szafki;
    }

    @Override
    public Meble stworzMebleFebra() {
        Szafki szafki = new Szafki();
//        szafki.iloscNog(5);
        szafki.iloscPolek(2);
//        szafki.material("sosnaF");
        return szafki;
    }
}
