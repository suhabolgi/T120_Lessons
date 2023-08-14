package day07_ifStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri_Soru1 {
    public static void main(String[] args) {

        // SORU-1==> Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi girin");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 5 == 0)
            System.out.println("Sayi 5'in tam katidir.");
        if (girilenSayi % 5 == 0)
            System.out.println("sayi 5 in tam katidir");
        if (!(girilenSayi % 5 == 0)){
            System.out.println("girilen sayi 5 in katı değildir."); // orijinal cevapta yok ancak ben ilave ettim.
        }
    }
}
