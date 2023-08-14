package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen çemberin yarıçapını giriniz.");

        double girilenYariCap = scanner.nextDouble();

        System.out.println("çemberin çevresi :" + 2 * 3.14 * girilenYariCap + "\nDairenin alanı :" +
                3.14 * girilenYariCap*girilenYariCap);
    }
}
