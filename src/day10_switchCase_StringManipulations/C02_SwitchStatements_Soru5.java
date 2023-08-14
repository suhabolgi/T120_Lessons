package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements_Soru5 {
    public static void main(String[] args) {

        // Soru- 5 ==> Kullanicidan gun numarasini alip, hafta içi ya da haftasonu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz.");
        int gunNo = scanner.nextInt();

        switch ( gunNo ){
            case 1 :
                System.out.println("Hafta ici");
                break;
            case 2 :
                System.out.println("Hafta ici");
                break;
            case 3 :
                System.out.println("Hafta ici");
                break;
            case 4 :
                System.out.println("Hafta ici");
                break;
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
                System.out.println("Hafta Sonu");
                break;
            case 7 :
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gun numarasini 1 ile 7 arasinda giriniz.");



        }

    }
}
