package day10_switchCase_StringManipulations;

public class C05_Equals {
    public static void main(String[] args) {

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";

        System.out.println(str1 == str2);// false

        System.out.println(str3 == str4.toLowerCase()); // mehmet == mehmet false

        System.out.println(str2 == str3.toUpperCase()); // MEHMET == MEHMET false

        /*


        String'lerde == bekledigimiz sonucları DONMEYEBILIR . Sebebi String class ını
        olustururken yapilan bazi özlliklerdir.
        Bu konu ilerde detaylica anlatilacaktir.

        Verilen iki String'in METİNSEL olarak ayni olup olmadigini kontrol etmek icin == yerine
        equals() metodu kullanilir.

        equals () 'u bire bir ayni olan iki metin icin TRUE
        farkli metinler icin FALSE degerini DÖNDÜRÜR (uretir).
        Bu karsilastirmada metin ayni olmasi yaninda büyük-kücük harf durumunu da kontrol eder.. CASE SENSETIVE.

        Eger case sensetive olamdan metinkleri karsilastirmak istersek
        equalsIgnoreCase() metodunu kullanilir.

        */

            // str1.equals(str2), str1 str2 ye eşit mi sorusunu sorar ve cevabi TRUE ya da FALSE olarak dondurur.

        System.out.println(str1.equals(str2));      // Mehmet -- MEHMET FALSE
        System.out.println(str3.equals(str4.toLowerCase())); // mehmet -- mehmet    TRUE
        System.out.println(str2.equals(str3.toUpperCase()));    // MEHMET-- MEHMET   TRUE

        System.out.println(str1.equalsIgnoreCase(str2));   // Mehmet -- MEHMET TRUE
        System.out.println(str1.equalsIgnoreCase(str3));    // Mehmet -- mehmet TRUE
        System.out.println(str3.equalsIgnoreCase(str4));    // mehmet -- MEHmet TRUE,


        System.out.println(str1.contentEquals("Mehmet"));   // TRUE


    }
}
