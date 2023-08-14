package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan bir tamsayı alın ve karesini yazdırın.
        // Scanner ile kullanıcıdan bir bilgiyi 3 adımda alabiliriz.
        // 1. adım : Scanner objesi oluşturmak.

        Scanner scanner = new Scanner(System.in) ;

        // 2. adım : kuulanıcıya ne istediğinizi söyleyin.

        System.out.println("Lütfen bir tamsayı giriniz.");

        // 3. adım: istediğiniz datanın türüne uygun bir variable oluşturun.
        //                 ve scanner objesini kullanarak uygun metofla
        //                  kullanıcının giridği değeri alın.

        int girilenSayi = scanner.nextInt();

        // artık kullanıcının girdiği sayı kod ortamımıza kaydedildi.
        // bu variable ı istediğimiz şekilde kullanırız.

        System.out.println("girilen sayının karesi : " + girilenSayi*girilenSayi);


    }
}
