package day03_scanner;

import java.util.Scanner;

public class C09_Examples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bugünü anlatan en fazla 2 kelimelik bir cümle girin");

        for(int i=0; i<=10; i++){
            String girilenKelime = scanner.next();
            System.out.println(girilenKelime);
        }

    }
}
