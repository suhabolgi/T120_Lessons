package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C09_NestedIfStatementsSorular_soru4 {
    public static void main(String[] args) {

        // Soru 4-
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise
        // “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.print("haftanın istediğiniz bir gününün adını girin :");
        String gunAdi = scanner.next().toUpperCase();

        int tatileKalanGun = 6;
        if (gunAdi.equals("PAZARTESİ")) {
            tatileKalanGun -= 1;
            System.out.println("Şimdi çalışma zamanı, tatile " + tatileKalanGun + " gün var.");
        } else if (gunAdi.equals("SALI")) {
            tatileKalanGun -= 2;
            System.out.println("Şimdi çalışma zamanı, tatile " + tatileKalanGun + " gün var.");
        } else if (gunAdi.equals("ÇARŞAMBA")) {
            tatileKalanGun -= 3;
            System.out.println("Şimdi çalışma zamanı, tatile " + tatileKalanGun + " gün var.");

        } else if (gunAdi.equals("PERŞEMBE")) {
            tatileKalanGun -= 4;
            System.out.println("Şimdi çalışma zamanı, tatile " + tatileKalanGun + " gün var.");

        } else if (gunAdi.equals("CUMA")) {
            tatileKalanGun -= 5;
            System.out.println("Şimdi çalışma zamanı, tatile " + tatileKalanGun + " gün var.");

        } else if (gunAdi.equals("CUMARTESİ")) {
            System.out.println("Simdi dinlenme zamani");
        } else if (gunAdi.equals("PAZAR")) {
            System.out.println("Simdi dinlenme zamani");

        }

    }
}
