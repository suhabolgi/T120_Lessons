package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenmeyenIsimleriSil {
    public static void main(String[] args) {

        // Soru 3-
        // Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun


        String[] arr = {"merhmet", "Ramazan", "Ozan", "Berk", "emre", "Ercan", "Demir"};

        List<String> isimler = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            isimler.add(arr[i]);

        }
        System.out.println("isimler listesi : " + isimler);
        System.out.println(istenmeyenleriSil(isimler, "r"));
    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String istenmeyenHarf) {
        // isim sildiğimizde indeks kayacaktır.bu da bazı elementlerin kontrol edilmemesine,
        // ve indexOutOfBouns hatasına sebep olabilir. bunun yerine verilen listeden isim silmek
        // yerine başka bir boş liste oluşturalım.
        // silinmeyecek elemanları o yeni listeye ekleyip, yeni listeyi döndürelim.

        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(istenmeyenHarf)) {
                yeniList.add(isimler.get(i));
            }
        }
        return yeniList;
    }
}
