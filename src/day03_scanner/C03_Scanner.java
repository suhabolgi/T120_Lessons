package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("lütfen bir double sayı giriniz.");

        double girilenDouble = scanner.nextDouble() ;

        System.out.println("lütfen bir tamsayı giriniz.");

        int girilenInteger = scanner.nextInt();

        System.out.println("iki sayının toplamı :" + (girilenInteger + girilenDouble));
        System.out.println("iki sayının çarpımı :" + girilenInteger*girilenDouble);






    }
}
