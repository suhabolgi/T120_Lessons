package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_Soru2_MySelf_ForLooplaCozdum {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        System.out.println("soruyu önce for Loop ile cözeceğim");

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir sayi girin :");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi;// giriken sayıyı sayi variable 'ına atadım


        int basamakSayisi = (sayi+"").length(); // sayının basamak sayısını almak için önce stringleştirdim
        // ve .length() metodu ile basamak sayisini buldum.
        System.out.println("girdiğiniz : " + sayi+ " sayisinin basamak sayisi "+basamakSayisi);

        int rakamlartoplam = 0; // basamaklar gelen rakamların toplanacağı variable oluşturum.
        int birlerBasamak = 0; // for döngüsünde, elde edeğimiz birler basamaklarını sonrasında yine Loop içerisinde
        // toplamSayi variable'ina ekleyeceğiz.



        for (int i = 1; i <= basamakSayisi; i++) {// burada forLoop'umuza kaç defa döndereceğimizi ve ,şartımızı ve artş
            // miktarini belirledik
            birlerBasamak = sayi % 10;
            // burada sayımızın 10 ile bölümünden
            // kalan sayı bize birler basamağını döndürecek
            rakamlartoplam += birlerBasamak;
            // elde edilen birler basamağını toplama ekliyoruz.
            sayi /=10;
            // ikinci aşamada ise birler basamağını topladığimiz
            // sayının  birler basamağından kurtularak, diğer
            // basamaklarını sırayla işlemek olacak.



        }
        System.out.println("RAkamlar toplamı ise :"+ rakamlartoplam);


        }


    }

