package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {

    public static void main(String[] args) {

        // SORU- 4 ==>

        //Soru 4 :
        //
        // main metoddta Kullanicidan bir sifre isteyip,
        // oluşturacağımız bir metodda asagidaki sartlari kontrol edin
        // ve metoddan TRUE ya da FALSE dondurun.

        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // tum sartlari saglanincaya kadar tekrar deger isteyin
        // ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        // Bu soruyu day 17 de çözdük ama JAVA da daha profesyonel kodlama için 2 düzeltme yapacağiz

        // 1. Düzeltme
        // while looğun içindeki parantezin içi true olduğu müddetce loop çalışır.
        // bu soruda sonuç variable'ı boolean deger iceriyor. ama sorunun mabtıigi acisindan
        // sonuç false olduğu nuddetce loop calismali.

        // 2. düzeltme :
        // while loop her çalistiginda, Scanner scanner = new Scanner (System.in=
        // çalisiyor ve yeni bir obje olusturuyor. bunun yerine daha güzekl olanı looptan önce
        // objeyi olusturup, loopu icerisnde sadece deger atamasi yapmaktir.


        boolean sonuc = false;
        Scanner scanner;      // 2. düzeltle Scanner'i disari aldik
        String sifre ;


        while (!sonuc){                             // sonuc == false ==> 1. düzeltme yailan satir.
            scanner = new Scanner(System.in);       // 2. duzeltme, sadece scanner'a değer atadik.
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }
        System.out.println("Sifreniz basariyla kaydedildi");
    }
    public static boolean sifreKontrolEt(String sifre){
        int sayac = 0 ; // sayac hatalari saysin
        //         - ilk harf kucuk harf olmali
        char ilkHarf= sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("ilk karakter kucuk harf olmali");
            sayac++;
        }
        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }
        //         - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        //         - uzunlugu en az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
            sayac++;
        }
        if (sayac == 0){
            return true;
        }else{
            return false;
        }
    }
}


