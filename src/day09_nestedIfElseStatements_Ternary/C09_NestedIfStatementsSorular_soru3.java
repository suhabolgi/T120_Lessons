package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C09_NestedIfStatementsSorular_soru3 {
    public static void main(String[] args) {
        //Soru 3-
        // Kullanicidan bir sayi alin
        // sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("istediğiniz bir sayiyi yazın :");
        int sayi = scanner.nextInt(); // kullanıcıdan bir sayi aldık.

        if (sayi % 2 == 1 || sayi % 2 == -1) {
            if (sayi > 0) {
                System.out.println("girdiğiniz " + sayi + " sayısı tek ve pozitif bir sayıdır.");
            } else {
                System.out.println("girdiğiniz " + sayi + " sayısı tek ve negatif bir sayıdır.");
            }

        } else if (sayi % 2 == 0) {

            if (sayi % 10 == 0) {
                System.out.println("girdiğiniz " + sayi + " sayısı çift ve pozitif bir sayıdır." +
                        "\n10 ile tam bölünebilir.");
            } else {
                System.out.println("girdiğiniz " + sayi + " sayısı pozitif çift sayıdır ancak \n10 ile tam" +
                        "bölünemez");
            }
        }
    }
}
