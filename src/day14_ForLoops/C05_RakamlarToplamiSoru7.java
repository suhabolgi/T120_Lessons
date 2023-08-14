package day14_ForLoops;

import java.util.Scanner;

public class C05_RakamlarToplamiSoru7 {
    public static void main(String[] args) {

        // day13_C07_ForLoops_Soru7 de çözüldü.
        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi ;  // 1453
        int basamakSayisi = (sayi+"").length(); // 4

        int birlerBasmagi = 0;
        int rakamlarToplami = 0 ;



        for (int i = 1; i <=basamakSayisi ; i++) {
            birlerBasmagi = sayi % 10;
            rakamlarToplami += birlerBasmagi;
            sayi /= 10;
        }
        System.out.println("Girilen " + girilenSayi +" sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
