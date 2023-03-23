package meble;

import org.junit.Test;
import zadania.KlientStoliki;
import zadania.KlientSzafki;
import zadania.meble.Meble;

public class MebleTest {
    @Test
    public void testStolikowA() {
        Meble stolikAbra = new KlientStoliki().stworzMebleAbra();
        System.out.println(stolikAbra.toString());
    }
    @Test
    public void testSzafkiA() {
        Meble szafkiAbra = new KlientSzafki().stworzMebleAbra();
        System.out.println(szafkiAbra.toString());
    }
    @Test
    public void testSzafkiF() {
        Meble szafkiFebra = new KlientSzafki().stworzMebleFebra();
        System.out.println(szafkiFebra.toString());
    }
}
