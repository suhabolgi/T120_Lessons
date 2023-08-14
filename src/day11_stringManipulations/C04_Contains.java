package day11_stringManipulations;

public class C04_Contains {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // str Java iceriyor mu ? yani cümle icerisinde Java var mi?

        System.out.println(str.contains("Java"));   // true

        // java icerir mi

        System.out.println(str.contains("java"));   // false

        // str a icerir mi

        System.out.println(str.contains("a"));      // true

        // *******contains() aranan metnin sayisi ile ilgilenmez.
        // sadeve TRUE ya da FALSE sonucu dondurur.

        String cumlem = "Hava kadar sevdim seni, hava seni bu sevmedi.";

        boolean varMi = cumlem.contains("Seni");
        // cumlem.contains() boolean bir sonuç doğuracaği icin bunu
        // boolean bir variable'a atayabilirim.

        System.out.println(varMi); //true/ya da false olarak döndürecekti.

        if (varMi) {
            System.out.println("aradiğiniz  kelime cümle içerisinde vardır.");

        } else {
            System.out.println("aradığınız kelime Stringte yoktur.");

        }



    }


}

