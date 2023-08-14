package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements_Soru2 {
    public static void main(String[] args) {
        //SORU-2
        // Kullanicidan notunu isteyin 50 ve üzeri ise "sinifi gectin"
        // değilse "maalesef kaldin" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin.");
        double not =scanner.nextDouble();

        if (not >= 50) System.out.println("Sinifi gectin.");
        if (not < 50) System.out.println("Maalesef kaldin.");

        /*

        Eğer bir sart icin iki durum soz konusu ise her durumu ayri ayri kontrol etmek yerine
        tek bir kontrol ile de yapilabilir.

        Bagimsiz if cumlelerinden farki, if else cumlelerinde ya if body'si ya da else body'si calisir.
        İkisinin ayni anda calismasi söz konusu degildir.
        İkisinin de calismamasi söz konusu degildir.

        */


        if (not >=  50 ){
            System.out.println("Sinifi gectin.");
        }else {
            System.out.println("Maalesef kaldin");
        }

    }
}
