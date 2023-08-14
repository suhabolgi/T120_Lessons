package day11_stringManipulations;

public class C07_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";


        // "Ali" nin indeksi nedir ? // 0

        System.out.println(str.indexOf("Ali"));     //0

        // "at" in indeksi nedir ?

        System.out.println(str.indexOf("at"));      // 9


        // "op" nin indeksi nedir ?

        System.out.println(str.indexOf("op"));      // 5

        System.out.println(str.indexOf('a'));       // 9

        System.out.println(str.indexOf("a", 10));       // 13 baslangic indeksi degismez.

        System.out.println(str.indexOf("yusuf"));  // -1 dondurerek olmadigini soyler.

        System.out.println("*********************************************************************");

        String str2 = "bugün için gezmeye gitmek, yarın için gitmekten daha güzel";
        int varMi2= str2.indexOf("güzel");
        System.out.println(varMi2);         // 52 bize bulduğu ilk indeksteki değerini göndürür.
        System.out.println(str2.indexOf("için")); // 6
        System.out.println(str2.indexOf("için", 6)); // 6
        System.out.println(str2.indexOf("için", 7)); // 33



    }
}
