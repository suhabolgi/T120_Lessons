package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C05_Modules_Soru1 {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip ,
        // rakamlar toplamini bulalim.

        Scanner scanner = new Scanner(System.in);
        System.out.println("4 basamakli bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birler = girilenSayi % 10;      // birler basamaği
        girilenSayi = girilenSayi / 10;     // birler basamagi hariç diğer kısmını verir.

        int onlar = girilenSayi % 10 ;      // onlar basamagini verir.
        girilenSayi = girilenSayi / 10;     // onlar basamagi hariç geri kalanini verir.

        int yuzler = girilenSayi % 10 ;     // yuzler basamagi
        girilenSayi = girilenSayi / 10;     // yuzler haric diger kısmını verir.

        int binler = girilenSayi % 10 ;     // binler basamagini verir.

        System.out.println("girilen sayinin rakamlari toplami : "+ (birler + onlar + yuzler + binler) +" dir.");




    }
}
