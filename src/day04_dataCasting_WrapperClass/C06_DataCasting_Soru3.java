package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C06_DataCasting_Soru3 {
    public static void main(String[] args) {
        // Soru 3-
        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("şimdi bir sayi girin");
        int girilenSayi = scanner.nextInt();
        byte sonHali = (byte) girilenSayi;

        System.out.println("girilen sayinin byte data tipine eşiti : " + sonHali +" dir.");


    }
}
