package day27_parametreliConstructor_constructorCall;

public class C03_Araba {

    String marka = "marka yok";
    String model = "model yok";
    int yil = 1990;
    int fiyat;
    String renk = "renk belirtilmedi";


    C03_Araba() { // oluşturulan konstructor

        // herhangi bir Class'a görünür bir konsrucor oluşturursak
        // default constructor silinir,
        // daha önce default constructoru kullanan başka class'larda
        // default constructor'un silinmesi sorunu doğar'

        // soruna yol açmamak için default yerine parametresiz
        // bir CONSTRUCTOR oluşturmaliyiz.

    }

    C03_Araba(String mrk, String mdl, int yl, int fyt, String rnk) {
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        renk = rnk;


    }


    @Override
    public String toString() {
        return "Araba Bilgileri ==>" +
                "\nmarka='" + marka + '\'' +
                "\nodel='" + model + '\'' +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat +
                "\nrenk='" + renk + '\'' +
                "\nrenk='" + renk + '\'' +
                '}';
    }
}
