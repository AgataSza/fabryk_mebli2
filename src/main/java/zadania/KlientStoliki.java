package zadania;

import zadania.meble.Meble;
import zadania.meble.Stoliki;

public class KlientStoliki implements FabrykaMebli {

    @Override
    public Meble stworzMebleAbra() {
        Stoliki stoliki = new Stoliki();
        stoliki.iloscNog(1);
        stoliki.materialBlat("dabA");
        stoliki.materialNogi("sosnaA");
        return stoliki;
    }

    @Override
    public Meble stworzMebleFebra() {
        Stoliki stoliki = new Stoliki();
        stoliki.iloscNog(2);
        stoliki.materialBlat("dabF");
        stoliki.materialNogi("sosnaF");
        return stoliki;
    }
}
