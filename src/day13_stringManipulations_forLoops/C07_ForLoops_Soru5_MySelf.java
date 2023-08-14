package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru5_MySelf {
    public static void main(String[] args) {

        // Soru-5
        // Kullanicidan 20'den kucuk bir sayi alıp,
        // bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den kucuk bir sayi girin.");
        int girilenSayi = scanner.nextInt();

        int faktoryelSayi = 1 ; // loop calistiginde sırasi gelen her sayinin carpimi yapılıp faktoryelinin
                                // hesaplanacagi bir sayac olusturdum ve 0 oldugunda yutan olacagi
                                // icin 1 degeri ile baslattim.

        // girilan sayı ör 5 ise 5,4,3,2,1 olarak sırali sekilde azaltilarak carpilacaği icin i-- kullandim.

        for (int i = girilenSayi ; i >= 1 ; i--){
            faktoryelSayi *=i; // i nin default olarak verdigimiz 1 degeri ile carpimi 1 dir.
                               // ve  faktoryelSayi degiskenine atanir. <=========
        }
        System.out.println("Girilen sayinin faktoryel degeri : " + faktoryelSayi +" dir.");

    }
}
