package day34_inheritance;

public class HRunner {

    public static void main(String[] args) {
        GAvciKuslar avciKusKartal = new GAvciKuslar();
        // AvciKuslar Classindan aldiği özellikler

        avciKusKartal.hareket(); // ucarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence(); // pencelidir
        avciKusKartal.gaga(); // sivri gagali

        //Kuslar Classindan aldiği özellikler

        avciKusKartal.kanat(); //kanatlidirlar
        avciKusKartal.solunum(); //akcigerle nefes alirlar
        avciKusKartal.cogalma(); // yumurtayla cogalirlar

        // Hayvanlar Classindan aldiği özellikler

        avciKusKartal.omur(); // yasar ve olurler






    }
}
