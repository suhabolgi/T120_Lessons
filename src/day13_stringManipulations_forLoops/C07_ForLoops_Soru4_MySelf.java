package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru4_MySelf {
    public static void main(String[] args) {

        // SORU-4 ==>
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tüm sayilarin toplamini yazdirin,
        // bitis degeri baslangic değerinden kucuk olsa da programi calistirin.

        // ilk olarak scanner olusturarak sayiları kullanicidan alalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic sayisi girin");
        int baslangicSayisi = scanner.nextInt();

        System.out.println("bitis sayisi girin");
        int bitisSayisi = scanner.nextInt();

        int toplamSayac=0; // aradaki sayilarin tolpaminin atanacağı bir variable oluturdum.

        for (int i = baslangicSayisi ; i<=bitisSayisi ; i++)
            toplamSayac +=i;
        System.out.println("ardaki tum sayilar toplami : " + toplamSayac );
    }
}
