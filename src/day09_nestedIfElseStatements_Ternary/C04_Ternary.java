package day09_nestedIfElseStatements_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {
        // İnput olarak verilen bir sayinin 3 ile tam bolunup bolunmedigini bulun.

        int input = 20;

        // input % 3 == 0 ? "3 ile tam bolunuyor" : " 3 ile tam bolunmuyor";
        // Bu soruda Ternary bize bir String donduruyor.
        // bunu ya direk olarak yazdirmali
        // ya da bir variabla'a atamalisiniz.

        System.out.println(input % 3 == 0 ? "3 ile tam bolunuyor" : " 3 ile tam bolunmuyor"); // direk yazdirma
        String sonuc =  input % 3 == 0 ? "3 ile tam bolunuyor" : " 3 ile tam bolunmuyor" ;      // ya da variable'a atama

        System.out.println(sonuc); // atanan veriable'ı yazdirdik.

        // verilen input cift sayi ise "cift sayi" yazdirin, input tek sayi ise 2* input sonucunu veren
        // bir TERNARY yazdirin.

        System.out.println(input % 2 == 0 ? "cift sayi" : 2 * input); // yazdirma olarak ciktisini aldik

        // String sonuc2 = input % 2 == 0 ? "cift sayi" : 2 * input ; dersek 2 * input kismi hata verir.

        // int sonuc2 = input % 2 == 0 ? "cift sayi" : 2 * input ; dersek "cift sayi" kismi hata verir.

        /* Eğer TERNARY de true durumu ile false durumu bize farkli data türünde
        sonuclar donduruyorsa sonucu bir variable'a atayamayiz. */
    }
}
