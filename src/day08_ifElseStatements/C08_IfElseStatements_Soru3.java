package day08_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements_Soru3 {
    public static void main(String[] args) {

        // SORU - 3 ==> Kullanicidan aldigi urun adedini ve liste fiyatini alin,
        //              Kullaniciya musteri karti olup olmadigini sorun.
        //              Musteri karti VARSA, 10 urunden fazla alirsa % 20, yoksa % 15 indirim yapin.
        //              Musteri karti YOKSA, 10 urunden fazla alirsa % 15, yoksa % 10 indirim yapin.

        // Soru cuzumunde önce temel iki sartimiz var. 1. si Musteri kartı varsa, 2. yoksa.
        // ilk sartımizi tespittrn sonra var olan musterinin ürün adedi alma konusunda belli sınırı asması sarti
        // 10 urunden az ise ya da fazla ise.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alinan urun adedini girin.");
        int alinanAdet = scanner.nextInt();                     // simdi ise alinan ürün adedini kaydedecegiz.

        System.out.println("Lütfen liste fiyatini girin.");
        double listeFiyati = scanner.nextDouble();              //  liste fiyatini aldik

        System.out.println("Müşteri kartiniz var mi? : Evet , E : Hayir H ");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);


        // Ana değişken kartiniz var mı yokmu sorusu olsun

        if (kartVarMi == 'E') { // Karti olanlar kismi
            //              Musteri karti VARSA, 10 urunden fazla alirsa % 20, yoksa % 15 indirim yapin.

            if (alinanAdet > 10) {
                System.out.println("%20 indirimli fiyat : " + alinanAdet * listeFiyati * 80 / 100);
            } else {
                System.out.println("%15 indirimli fiyat : " + alinanAdet * listeFiyati * 85 / 100);
            }

        } else if (kartVarMi == 'H') { // Karti olmayanlar kismi


            if (alinanAdet > 10) {
                System.out.println("%15 indirimli fiyat : " + alinanAdet * listeFiyati * 85 / 100);
            } else System.out.println("%10 indirimli fiyat : " + alinanAdet * listeFiyati * 90 / 100);

        } else {                        // Hatali kart bilgisi
            System.out.println("Kart Bilgisi Hatalidir. Lütfen Kontrol Ediniz.");
        }




    }
}
