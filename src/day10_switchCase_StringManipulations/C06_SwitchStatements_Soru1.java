package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C06_SwitchStatements_Soru1 {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("adını yazdirmak istediğiniz bir rakam girin :");
        int girilenRakam = scanner.nextInt();

        switch (girilenRakam){
            case 0 :
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("girilen şekilde bir rakam bulamadım");
        }

    }
}
