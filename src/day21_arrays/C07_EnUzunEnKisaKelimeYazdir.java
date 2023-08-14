package day21_arrays;

public class C07_EnUzunEnKisaKelimeYazdir {
    public static void main(String[] args) {

        // Soru 6-
        // Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"süha BOLGI", "emre BAYRAM", "ufuk AYDAN AYDIN", "ahmet BULUTLUOZ"};

        enUzunEnKisaYazdir(isimler);



    }
    public static void enUzunEnKisaYazdir(String[] isimler){
        String enKisaKelime = isimler[0];       // başlangıç değeri olması içi 0 yazıldı
        String enUzunKelime = isimler[0];       // başlangıç değeri olması içi 0 yazıldı

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }


        }
        System.out.println("en uzun isim : " + enUzunKelime);
        System.out.println("en kısa isim : " + enKisaKelime);

    }
}
