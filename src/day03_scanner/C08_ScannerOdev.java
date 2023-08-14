package day03_scanner;

import java.util.Scanner;

public class C08_ScannerOdev {
    public static void main(String[] args) {

        //Soru 8 (Interview)- Kullanicidan iki sayi alip,
        // ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in); // ilk olarak tarayıcı ojjemi oluşturdum.

        System.out.println("Lütfen ilk sayıyı girin"); // 1. sayımızı kullanıcıdan istedik.
        int ilkSayi = scanner.nextInt(); // kullanıcının gireceği sayıya uygun bir değişken tanımadım.

        System.out.println("Lütfen ikinci sayıyı girin."); // 2. sayımızı da kullanıcıdan istedik.
        int ikinciSayi = scanner.nextInt(); // kullanıcının gireceği sayıya uygun bir değişken tanımadım.

        // 1. Yöntem : Atama yapmadan doğrudan sayıların yerlerini swap ediyorum.
        System.out.println("ilk sayımızın yeni değeri :" + (ilkSayi * 0 + ikinciSayi) + " oldu.");
        System.out.println("ikinci sayımızın yeni değeri :" + (ikinciSayi * 0 + ilkSayi) + " oldu.");

        System.out.println("...................................................");

        //2. Yöntem : Atama işlemi yaparak sayıların yerlerini swap ediyorum.
        ilkSayi = ilkSayi + ikinciSayi ;   // 10 + 20 = 30
        ikinciSayi = ilkSayi - ikinciSayi; // 30 - 10 = 20
        ilkSayi = ilkSayi - ikinciSayi ;   // 20 + 20 = 10;

        System.out.println("ilk sayımızın yeni değeri :" + ilkSayi + " oldu.");
        System.out.println("ikinci sayımızın yeni değeri :" + ikinciSayi + " oldu.");







    }
}
