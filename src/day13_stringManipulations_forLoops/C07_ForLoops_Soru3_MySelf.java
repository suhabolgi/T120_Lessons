package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru3_MySelf {
    public static void main(String[] args) {

        // SORU-3 ==>
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tüm sayilarin toplamini yazdirin,
        // bitis degeri baslangic değerinden kucukse ,
        // uyari yazdirip islemi sonlandirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degeri olarak pozitif bir sayi girin");
        int baslangicSayisi = scanner.nextInt();

        System.out.println("bitis degeri olarak pozitif bir sayi girin");
        int bitisSayisi = scanner.nextInt();

        if (bitisSayisi < baslangicSayisi) {
            System.out.println("uyari");
        } else {
            int toplam = 0; // iki sayi arasindaki sayilarin toplamını atayabilecegimiz bir sayac olusturduk.
            for (int i = baslangicSayisi; i <= bitisSayisi; i++) { // ForLoop'u olusturduk.
                toplam += i;
            }
            System.out.println("iki sayi arasinda kalan ardisik sayılar toplami :" + toplam);


        }


    }
}


