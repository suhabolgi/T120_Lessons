package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //SORU- Kullanicidan pozitif bir tamsayi alin
        //      sayi 3 veya 5 ile bolunebiliyorsa
        //      "Güzel sayi" yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi girin");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0) System.out.println("Güzel sayi");
    }
}
