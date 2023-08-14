package day11_stringManipulations;

import java.util.Scanner;

public class C10_IndexOf_Soru1_MySelf {
    public static void main(String[] args) {
        // Soru 1 :
        // Kullanicidan bir String ve aranacak metin alin.
        // String’in aranan metni icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("İstediğiniz bir cümle yazın. \nCümle :");
        String metin = scanner.nextLine();

        System.out.print("lütfen metinde aramak istediğiniz bir kelime girin. \nKelime :");
        String arananKelime = scanner.next();

        if (metin.contains(arananKelime)){
            System.out.println("aradiğiniz :" + arananKelime + ", kelimesi yazdiğiniz metinde vardir. ");

        }
        else {
            System.out.println("aradiğiniz :" + arananKelime + ", kelimesi yazdiğiniz metinde YOKTUR. ");
        }

    }
}
