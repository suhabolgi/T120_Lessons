package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // Kullanıcıdan 3 basamakli bir sayi alip sayinin rakamlarini toplayip yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir sayi giriniz.");
        int girilenSayi = scanner.nextInt();

        int birlerBasamaği = 0;
        int rakamlarToplami = 0;

        // örneğimizi 125 üzerinden yapalim
        // ilk sayi için birler basamağini bulalim.

        birlerBasamaği = girilenSayi % 10;                          // 5
        rakamlarToplami = rakamlarToplami + birlerBasamaği;         // 0+5=5

        // birler masamağindaki sayiyi aldık. Artik ondan kurtulalim.

        girilenSayi = girilenSayi / 10; // 12. sayının birler basamağından kurtulduk. sayımız artık 2 basamaklidir.

        // Bu satira geldiğimizde girilen sayiyi 2 basamakli sayiya dönüştürdük.

        birlerBasamaği = girilenSayi % 10;                          // 2
        rakamlarToplami = rakamlarToplami + birlerBasamaği;         //5+2=7

        girilenSayi = girilenSayi / 10; // yeni sayimiz 2 dir.

        birlerBasamaği = girilenSayi % 10;                          // 1
        rakamlarToplami = rakamlarToplami + birlerBasamaği;         // 1+7=8

        girilenSayi = girilenSayi / 10; // artik birler basağımız kalmadi. 0 dir.


        System.out.println("Girilen sayinin rakamlari toplami :" + rakamlarToplami +" dir");
    }
}
