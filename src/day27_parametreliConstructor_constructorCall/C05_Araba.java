package day27_parametreliConstructor_constructorCall;

public class C05_Araba {
    String marka = "marka yok";
    String model = "model yok";
    int yil = 1990;
    int fiyat;
    String renk = "renk belirtilmedi";



    // parametreli konsractor oluşturmanın kolay yolu code generate const.


    public C05_Araba(String marka, String model, int yil, int fiyat, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.renk = renk;
    }

    public C05_Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public C05_Araba() {
    }

    public C05_Araba(String marka, int fiyat, String renk) {
        this.marka = marka;
        this.fiyat = fiyat;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "C05_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
