package day04_dataCasting_WrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        /* char, boolean, String i diğer data türlerine cast edemeyiz.
        Sayısal data içeren primitive data türlerini birbirine cast edebiliriz.

        1-  Daha küçük data türündeki değeri, daha geniş data türündeki variabl'a atama yaparsak java outo widening yapar
            otomatik yapar.

        2-  Daha geniş kapsamlı data türündeki değeri daha dar kapsamlı variable'a atama yaparsan Java
            bunu otomatik olarak yapmaz, sorumluluk bizde olarak casting yaparız.
            değerin önüne () açarak içine cast istediğimiz data türünü yazabiliriz.

        daraltma yapıldığında, ( explicit Narrowing ) yapıldığında data kayıplaro olabilrcrği gibi daha
        başkalaşabilir de.
        */



        String str = "Java Candir.";

       // int sayi1 = str;

       // char chr1 = str;

       // boolean bl1 = str;

        String s1 = str; // uyumlu

        //boolean bl2 = 10 ;
        //boolean bl3 = 's';

        int sayi2 = 'k';
        double dbl1 = sayi2;
        //String str2 =sayi2;

        int sayi3 =10;
        double dbl2= 4.5;
        short sh1 =3;
        byte by1 = 7;

        sayi3 = (int)dbl2; //caasting
        sayi3 = sh1;
        sayi3 = by1;

        dbl2 = sayi3;
        dbl2=sh1;
        dbl2=by1;

        by1=(byte) dbl2; // normalde olmayacak castingi olacaksın dedik mi olur. 4.5 dan bir kısmını silecek
                        // ya da kaybedecek.
        by1=(byte) sh1;         // atama normalde olmaz ancak casting ile zorla yaptırırız.
        by1=(byte) sayi3; //casting

        sh1 = (short) dbl2;
        sh1 = (short) sayi3;
        sh1 = by1;





    }
}
