package day12_stringManipulations;

import java.util.Scanner;

public class C05_StringManipulations_Soru6_MySelf {
    public static void main(String[] args) {
        // Soru 6 :
        // Kullanicidan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina /:) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümle girin. \nCümle :");
        String cumle = scanner.next();

        int cumleUzunluk = cumle.length();

        if (cumleUzunluk % 2 == 0) {
            System.out.println(cumle.substring(0, cumleUzunluk / 2) + ":)" +
                    cumle.substring(cumleUzunluk / 2));

        } else {
            System.out.println(cumle.substring(0, cumleUzunluk / 2) + ":)" +
                    cumle.substring(cumleUzunluk / 2+1));
        }

    }
}

