package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C09_NestedIfStatementsSorular_soru2 {
    public static void main(String[] args) {
        //Soru 2-
        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.print("aldığınız ürün adedini girin :");
        int urunAdet = scanner.nextInt();                       // müşteriden ürün adedini aldık.

        System.out.print("aldığınız ürünün liste fiyarını girin :");
        double listeFiyati = scanner.nextDouble();              // müşteriden liste fiyatının aldık.

        System.out.println("Müşteri kartınız var mı: \nEvet ise E : \nHayır ise H : ");
        char kartVarMi = scanner.next().toUpperCase().charAt(0); // müşteriye kartı var mı sorusunun cevanını aldık.


        if (kartVarMi == 'E') {
            if (urunAdet <= 0) {
                System.out.println("ürün adedini yanlış girdiniz. \nLütfen kontrol ederek tekrar girin.");

            } else if (urunAdet < 10) {
                System.out.println("indrim kazandınız. İndirimli tutar :" + (urunAdet * listeFiyati * 0.90) +
                        " Liradır.");

            } else if (urunAdet > 10) {
                System.out.println("indrim kazandınız. İndirimli tutar :" + (urunAdet * listeFiyati * 0.85) +
                        " liradır.");
            }
        } else if (kartVarMi == 'H') {
            if (urunAdet <= 0) {
                System.out.println("ürün adedini yanlış girdiniz. \nLütfen kontrol ederek tekrar girin.");

            } else if (urunAdet < 10) {
                System.out.println("indrim kazandınız. İndirimli tutar :" + (urunAdet * listeFiyati * 0.85) +
                        " Liradır.");

            } else if (urunAdet > 10) {
                System.out.println("indrim kazandınız. İndirimli tutar :" + (urunAdet * listeFiyati * 0.8) +
                        " liradır.");

            } else {
                System.out.println("girdiğiniz kart bilgisi hatalıdır. " +
                        "\nMüşteri kartınız var ise EVET : \nMüşteri katınız yoksa HAYIR : ");
            }


        }


    }
}








