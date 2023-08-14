package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_Soru2_MySelf {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir sayi girin \nSayı :");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        // girilen sayıyı sayi variable 'ına atadım.
        int basamakSayisi=(girilenSayi+"").length();
        // sayıyı String hale getirip uzunluğunu yani basamak sayısını buldum
        int basamaklarToplami=0;
        int birlerBasamagi =0;

        while (sayi>0){
            birlerBasamagi = sayi%10;
            basamaklarToplami +=birlerBasamagi;
            sayi /=10;
            // en son elde kalan basamağın 10 a bölümü 0 dan küçük olacağı için Loop burada sona erer.
        }
        System.out.println("girdiğin sayının rakamları toplamı :" + basamaklarToplami + " dır.");
    }
}
