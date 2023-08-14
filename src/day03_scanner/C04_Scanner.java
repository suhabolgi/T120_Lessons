package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen isminizi giriniz.");

        String girilenIsim = scanner.nextLine(); // metotlardan .next olsaydı ilk kelimeyi alırdı.

        System.out.println("Lütfen soyisminizi giriniz.");

        String girilenSoyIsim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz.");

        int girilenYas = scanner.nextInt();

        System.out.println("İsminiz :" + girilenIsim);
        System.out.println("Soyisminiz :" + girilenSoyIsim);
        System.out.println("Yaşınız :" + girilenYas);
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");

        // peki tüm bu sonuç çıktılarını tek bir sout ile yapabilirmiydik. Evet. sout içerisindeki bir stringin alt
        //devam etmesini istersek Stringin alt satıra geçmesini istediğimiz kısma \n yazın.

        System.out.println("İsminiz :" + girilenIsim + "\nSoyisminiz :"
                + girilenSoyIsim + "\nYaşınız :" + girilenYas + "\nKaydınız başarıyla alınmıştır.");




    }
}
