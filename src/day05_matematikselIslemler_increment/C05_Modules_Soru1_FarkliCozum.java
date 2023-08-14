package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C05_Modules_Soru1_FarkliCozum {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip ,
        // rakamlar toplamini bulalim.
        // Soruda 4 basamakli dese de oluşturduğum kod bloğu ile kaç basamakli sayi girilirse girilsin
        // sonucu dogru şekilde verecektir.

        Scanner scanner = new Scanner(System.in);
        System.out.print("4 basamakli bir tamsayi giriniz :");
        int girilenSayi = scanner.nextInt();

        // girilen sayinin basamak sayısını bulmak için rakamı Stringleştirdik ve .length() ile uzunluğunu bulduk.
        String str = "" + girilenSayi;
        int basamakSayisi = str.length();
        System.out.println("girilen sayinin basamak sayisi :" + basamakSayisi + " dir.");


        int birlerBasamagi = 0;  // % 10 ile bulacağimiz birler basamağını katdedeceğimiz variable
        int rakamlarToplami = 0; // for döngüsü ile bize dönen birler basamaklarını toplayacagimiz bir variable


        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = girilenSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /=10; // bu sayede for göndüsünün her dönüşünde birler basamağindan kurtuluyoruz.


        }
        System.out.println("girilen sayinin basamakları toplamı :" + rakamlarToplami + " dir.");
    }
}
