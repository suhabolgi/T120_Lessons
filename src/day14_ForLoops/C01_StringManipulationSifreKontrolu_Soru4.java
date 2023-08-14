package day14_ForLoops;

import java.util.Scanner;

public class C01_StringManipulationSifreKontrolu_Soru4 {
    public static void main(String[] args) {

        // SORU- 4 ==>

        // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        // ilk harf kucuk harf olmali
        // son karakter rakam olmali
        // sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali.

        // SORU da iki yönetini de kullanabiliriz.

        // sayaç olusturup, her adımın dogrulugunu birer birer artirip en sonda sayac == 4 ise sifre basarilidir.
        // diger yontem flag yöntemidir. herrhangi bir deger atayin.
        // eger uygun olmayan bir durum var ise flag'i degistir. True ise False yap, 1 ise 2 yap önemli degil
        // önemli olan degistirmek. en sonra flagi konrol ettigimde , flag degismisse sifremiz BASARİSİZ dir.

        // flagi basta TRUE yapalim her uygun olmayan durumda FALSE degeri atayalim.

        boolean flag = true;
        // şartlar birbirinden bagimsiz oldugundan bagimsiz if cumleleri kullanalim.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi girin.");
        String sifre = scanner.nextLine();

        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf<= 'z')){

            System.out.println("ilk karakter kucuk harf olamli");
            flag = false;
        }

        char sonKArakter = sifre.charAt(sifre.length()-1);

        if (!(sonKArakter >= '0' && sonKArakter <= '9')){ // bunu sağlamiyorsa yapacağim bir şey var o yüzden !
            System.out.println("Son karakter rakam olmali");
            flag = false;

        }

        // sifre bosluk icermemeli

        if (sifre.contains(" ")){

            System.out.println("sifre bosluk icermemeli");
            flag = false;
        }

        // uzunluğu en az 10 karakter olmali,

        if (!(sifre.length() >= 10)){  // 10 ya da daha buyuk degilse diye yine ! ile paranteze alalim.

            System.out.println("sifrenin uzunluğu en az 10 karakter olmali");
            flag = false;

        }
       // if (!(flag == false))

        if (flag){
            System.out.println("sifreniz basarili sekilde kaydedildi.");
        }










    }
}
