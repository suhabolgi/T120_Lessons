package day07_ifStatements;

public class C02_bagimsizIfCumleleri {
    public static void main(String[] args) {
        /*
            1- Eger boolean sarttan sonra {} kullanilmazsa
                Java if body'si olarak ilk ; kadar olan bolumu alir digerleri if body'sinin disinda kalir.

            2- if cumlesinde {} kullanmaz ve boolean sartin sonuna  ; yazarsaniz if body'si hicbir islem yapmaz
                cunku if body'si yoktur.

           ÖZETLE

           3-  if body'si tek satirdan olusuyorsa {} kullanmanize gerek yok ancak if body'si birden fazla satirdan
            olusuyorsa MUTLAKA {} kullanmalisiniz.
        */


        int a = 35 ;
        int b = 30 ;

        if (a<b) {
            System.out.println("a b'den küçük 1");
            System.out.println("a b'den küçük 2");
            System.out.println("a b'den küçük 3");
        }
        if (a % 2 == 0)
            System.out.println("a 2 ile tam bolunuyor 1"); // ilk ; olan kisim if body'sidir.
            System.out.println("a 2 ile tam bolunuyor 2"); // sonraki satirlarin if body'si ile ilgisi yoktur.
            System.out.println("a 2 ile tam bolunuyor 3");

    }
}
 // beyin yanmadı yusuf