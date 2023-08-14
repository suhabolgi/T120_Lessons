package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatementsSoru_4 {
    public static void main(String[] args) {
        // SORU- 4
        // Kullanicidan bir karakter isteyin, girilen karakterin büyük harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf karakteri girin.");
        char girilenKarakter = scanner.next().charAt(0);

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z') {
            System.out.println("girdiğiniz harf buyuk bir harftir.");
        }else {
            System.out.println("girdiğiniz harf buyuk bir harf degildir.");
        }



    }
}
