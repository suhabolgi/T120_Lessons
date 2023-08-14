package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

//        kullanicidan pozitif bir tamsayi alin sayinin tek ya da cift oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayi girin");

        int sayi = scanner.nextInt();

        if (sayi %2 == 0){
            System.out.println("sayi cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        //  If Else ile yapabilecegimiz islemleri daha kisa yazabilmek icin TERNARY kullanilir

        System.out.println(sayi % 2 == 0 ? "Cift Sayi"  : "Tek sayi");

    }
}
