package day08_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin,
        // sayi 3 e bolunuyorsa 3'ün kati
        // sayi 5 e bolunuyorsa 5'ün kati
        // ikisine de bolunuyorsa super sayi
        //ikisine de bolunmuyorsa yaramaz sayi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi girin");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3==0 && girilenSayi % 5 == 0){
            System.out.println("super sayi");
        } else if (girilenSayi % 5 == 0) {
            System.out.println("5 in kati");
        } else if (girilenSayi % 3 == 0) {
            System.out.println("3 un kati");
        } else {
            System.out.println("yaramaz sayi");
        }
    }
}
