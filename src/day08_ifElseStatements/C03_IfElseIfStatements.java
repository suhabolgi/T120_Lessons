package day08_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {
            // SORU
            // Ogrencinin notu 85 ve ustu ise AA,
            // (85 ve ustu degilse) 65 ve ustu ise BB,
            // (65 ve ustu de degilse) 50 ve ustu ise CC,
            // (geriye kalanlar) DD


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz.");
        double girilenNot = scanner.nextDouble();

        // if (girilenNot >=85 && girilenNot<=100){
        //     System.out.println("Notunuz AA");
        // } else if (girilenNot >= 65 && girilenNot<85) {
        //     System.out.println("Notunuz BB");
        // } else if (girilenNot >= 50 && girilenNot<65) {
        //     System.out.println("Notunuz CC");
        // } else {
        //     System.out.println("Notunuz DD");
        // }

        if (girilenNot >=85 ){
            System.out.println("Notunuz AA");
        } else if (girilenNot >= 65 ) {
            System.out.println("Notunuz BB");
        } else if (girilenNot >= 50 ) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz DD");
        }

    }
}
