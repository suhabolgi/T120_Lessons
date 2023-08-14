package day14_ForLoops;

import java.util.Scanner;

public class C04_ForLoops_FaktoryelSoru5 {
    public static void main(String[] args) {

        // kendim day13_C07_ForLoops_Soru5 te çözdüm. orada for () farkli yazip çözdum.

        // Soru-5
        // Kullanicidan 20'den kucuk bir sayi alıp,
        // bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 20 den kucuk bir tamsayi girin");
        int girilenSayi = scanner.nextInt();

        int carpim = 1;

        for (int i = 1; i <=girilenSayi; i++) {
            carpim *= i;

        }
        System.out.println("girilen sayi olan : " + girilenSayi + " ! =" + carpim);

    }
}
