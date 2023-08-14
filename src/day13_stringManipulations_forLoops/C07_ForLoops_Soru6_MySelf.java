package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru6_MySelf {
    public static void main(String[] args) {

        //SORU-6
        // Kullanicidan 20'den kucuk bir sayi alin,
        // sayinin faktoryel degerini hesaplayin.
        // faktoryel hesabin nasil yapidigini da konsolda yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den kucuk bir tamsayi girin.");
        int girilenSayi = scanner.nextInt();

        int faktoryel = 1;
        for (int i = girilenSayi ; i >=1 ; i--){
            faktoryel *=i ;

        }
        System.out.println("girilen :"+ girilenSayi + " nin faktoryeli " + faktoryel + " dir.") ;

        faktoryel=1;
        // sonucu 5 ! = 5 * 4 * 3 * 2 * 1 = 120  seklinde yazdirin / sayi Kullanicidan alinacak.

        String sonucGoster = girilenSayi+" ! = ";
        System.out.print(sonucGoster);

        for (int i = girilenSayi; i >=1 ; i--) {
            faktoryel *= i;

            if (i != 1){
                System.out.print(i+" * ");
            }else{
                System.out.print("1 = ");
            }
        }
        System.out.println(faktoryel);


    }
}
