package day14_ForLoops;

import java.util.Scanner;

public class C07_StringTertenYazdirma_Soru9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tersten yazdirmak istediğiniz bir metin girin.");
        String metin = scanner.nextLine();

        // Java Candır. sondan başlamak gerekir mantiği ile çözümü kolay olıur.

        for (int i = metin.length()-1 ; i >= 0 ; i--) {
            System.out.print(metin.charAt(i));

        }
        System.out.println("");
        // terse çevrilmiş halini kaydedelim

        String tersMetin = "";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin +=metin.charAt(i);

        }
        System.out.println("terse çevrilen metin :" + tersMetin);
    }
}
