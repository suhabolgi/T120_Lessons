package day02_dataTurleri_variable;

public class C03_PrimitiveDataTurleri {
    public static void main(String[] args) {

        boolean bl1 = true ;
        boolean bl2 = false ;

        // char ' ' içinde yazılır ve sadece 1 karakter kabul eder.
        char ch1 = 's' ;
        char ch2 = '2' ;
        char ch3 = '%' ;

        // tam sayi kabul eden data türleri
        // data türü aynı olsa da hafızadaki kapladıkları alan aynıdır.

        int nufus1 = 825525 ;
        int nufusBileceik = 30000 ;

        // bir şehirdeki noter sayisi

        short noterSayisi = 456 ;

        float fl1 = 20F ;
        float fl2 = 6f ;
        float fl3 = fl1 / fl2 ;
        System.out.println(fl3);


        double db1 =20;
        double db2 =6;
        double db3 = db1 / db2;
        System.out.println(db3);

        String str ="Hello World" ;
        System.out.println(str);
        System.out.println("babam");
        System.out.println("str");

        //verilen 2 sayının çarpım sonucunu yaszdıralım.

        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println(sayi1 * sayi2);
        System.out.println("verilen iki sayının çarpımı" +" " + sayi1*sayi2 + " dür.");


    }
}
