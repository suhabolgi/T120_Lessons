package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri_Soru2 {
    public static void main(String[] args) {

        // SORU-2 Kullanicidan bir harf alin, harf ile baslayan bir farf var ise yazdirin.
        // NOT : Buyuk harf, kucuk harf hassasiyeti olmasin,
        // O ya da o yazdiğinde output Ocak olsun,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
        char girilenHarf = scanner.next().charAt(0);

        if (girilenHarf == 'a' || girilenHarf == 'A') {
            System.out.println("Aralik, Agustos");
        } else if (girilenHarf == 'e' || girilenHarf == 'E') {
            System.out.println("Eylül, Ekim");
        } else if (girilenHarf == 'h' || girilenHarf == 'H') {
            System.out.println("Haziran");
        } else if (girilenHarf == 'k' || girilenHarf == 'K') {
            System.out.println("Kasim");
        } else if (girilenHarf == 'm' || girilenHarf == 'M') {
            System.out.println("Mart, Mayis");
        } else if (girilenHarf == 't' || girilenHarf == 'T') {
            System.out.println("Temmuz");
        } else if (girilenHarf == 'n' || girilenHarf == 'N') {
            System.out.println("Nisan");
        } else if (girilenHarf == 'o' || girilenHarf == 'O') {
            System.out.println("Ocak");
        } else if (girilenHarf == 's' || girilenHarf == 'S') {
            System.out.println("Subat");
        }

    }
}
