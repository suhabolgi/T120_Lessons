package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz.");
        int ilkSayi = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        int ikinciSayi =scanner.nextInt();

        int temp = ilkSayi; // boş vir variable oluşturduk ve ilk sayıyı ona atadık. ilk sayı boş kaldı.
        ilkSayi = ikinciSayi ; // ilk sayıya ikinci sayının değerini atadık ilk sayımız yeni sayısını aldı.
        ikinciSayi = temp; //boş variable atadığımı ilk sayıyı ikinci sayıya atadık ve değişim tamamlandı.

        System.out.println("ilk sayının yeni değeri :" + ilkSayi);
        System.out.println("ikinci sayının yeni değeri :" + ikinciSayi);


    }
}
