package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements_Soru4 {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //         ve girilen harfin karsiligini yazdirin.
        //  I : International
        //  S : Software
        //  T : Testing
        //  Q : Qualifications
        //  B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gormek istediginiz harfi giriniz.");
        char harf = scan.next().toUpperCase().charAt(0);

        switch ( harf ){

            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
                break;
            case 'T' :
                System.out.println("Testing");
                break;
            case 'Q' :
                System.out.println("Qualification");
                break;
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Yazdiginiz harf ISTQB de yok");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ABDIMF kısaltmasnda öğrenmek istediğiniz bir harfi giriniz");
        char kisaltma = scanner.next().toUpperCase().charAt(0);

        switch (kisaltma){
            case 'A':
                System.out.println("America");
                break;
            case 'B':
                System.out.println("Birleşik");
                break;
            case 'D':
                System.out.println("Devletleri");
                break;
            case 'I':
                System.out.println("International");
                break;
            case 'M':
                System.out.println("Money");
                break;
            case 'F':
                System.out.println("Foundy");
                break;
            default:
                System.out.println("verilen karaktede bir şey bulamadık. :((");
        }
    }
}
