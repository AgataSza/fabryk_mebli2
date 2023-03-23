package zadania.meble;

import com.google.gson.Gson;

public class Szafki extends Meble {

    public int iloscNog;
    public int iloscPolek;
    public String material;

    public void iloscNog(int iloscNog) {
        this.iloscNog = iloscNog;
    }
    public void iloscPolek(int iloscPolek) {
        this.iloscPolek = iloscPolek;
    }
    public void material(String material) {
        this.material = material;
    }
    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
