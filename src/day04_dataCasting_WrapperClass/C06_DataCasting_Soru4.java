package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C06_DataCasting_Soru4 {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum
        // isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sırasiyla 2 tane ondalikli sayi girin");
        System.out.print("1. sayi :");
        double birinciSayi = scanner.nextInt();
        System.out.print("2. sayi :");
        double ikinciSayi = scanner.nextInt();

        System.out.println((int)(birinciSayi/ikinciSayi));


    }
}
