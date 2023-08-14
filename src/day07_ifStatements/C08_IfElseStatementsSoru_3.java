package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatementsSoru_3 {
    public static void main(String[] args) {

        // SORU-Kullanicidan Yasini isteyin, 65 yas ve uzeri ise "Emekli olabilirsin,
        // yoksa emekli olabilmesi icin calisması gereken yil sayisini yazin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yasinizi girin.");
        int girilenYas = scanner.nextInt();
        int eksikyil = 65 - girilenYas;

        if (girilenYas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olabilmek icin :" + eksikyil + " yil daha calismaniz gereklidir.");
        }



    }
}
