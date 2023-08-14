package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C06_DataCasting_Soru2_Cozum2_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char harf = scanner.next().toLowerCase().charAt(0);
sonrakiHarfMetodu(harf);

    }

    public static char sonrakiHarfMetodu(char harf) {

        int harfinAsciisi = harf;

        for (int i = 1; i <= 3; i++) {
            harfinAsciisi++;
            char sonrakiHarf = (char) harfinAsciisi;
            System.out.print(sonrakiHarf + " ");

        }
        return harf;
    }
}
