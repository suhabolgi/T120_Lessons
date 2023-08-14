package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C06_SwitchStatements_Soru7 {
    public static void main(String[] args) {
        // kullanıcıdan bir burç adı iste ve onun hangi ayları kapsadığini yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen girmek istediğiniz bir burcun numarasını girin.");
        System.out.println("koç :1 \nboğa :2 \nikizler:3 \nyengeç :4 \naslan :5 \nbaşak :6" +
                "\nterazi :7 \nakrep :8 \nyay :9 \noğlak :10 \nkova :11 \nalık :12");

        int girilenBurc = scanner.nextInt();

        switch (girilenBurc) {
            case 1:
                System.out.println("21 Mart- 20 Nisan");
                break;
            case 2:
                System.out.println("21 Nisan – 20 Mayıs");
                break;
            case 3:
                System.out.println("21 Mayıs – 21 Haziran");
                break;
            case 4:
                System.out.println("22 Haziran – 22 Temmuz");
                break;
            case 5:
                System.out.println("23 Temmuz – 23 Ağustos");
                break;
            case 6:
                System.out.println("24 Ağustos – 23 Eylül");
                break;
            case 7:
                System.out.println("24 Eylül – 23 Ekim");
                break;
            case 8:
                System.out.println("24 Ekim – 22 Kasım");
                break;
            case 9:
                System.out.println("23 Kasım – 21 Aralık");
                break;
            case 10:
                System.out.println("22 Aralık – 20 Ocak");
                break;
            case 11:
                System.out.println("21 Ocak – 19 Şubat");
                break;
            case 12:
                System.out.println("20 Şubat – 20 Mart");
                break;
            default:
                System.out.println("girdiğinz sayı yanliştır.");
        }
    }
}
