package zadania.meble;

public class Stoliki extends Meble {

    public int iloscNog;
    public String materialNogi;
    public String materialBlat;

    public void iloscNog(int iloscNog) {
        this.iloscNog = iloscNog;
    }
    public void materialNogi(String materialNogi) {
        this.materialNogi = materialNogi;
    }
    public void materialBlat(String materialBlat) {
        this.materialBlat = materialBlat;
    }
    @Override
    public String toString(){
        return "ilosc nog: " + iloscNog + ", material nogi: " + materialNogi + ", material blat: " + materialBlat;
    }
}
