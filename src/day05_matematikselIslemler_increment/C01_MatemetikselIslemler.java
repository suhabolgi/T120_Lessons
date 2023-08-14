package day05_matematikselIslemler_increment;

public class C01_MatemetikselIslemler {
    public static void main(String[] args) {

        int a = 27;
        int b = 4;

        //iki tamsayı java da bölünürse sonuç tamsayı çıkar

        System.out.println(a/b); // 27 / 4 => 6.75 yapmaz sonuç da int data tipinde çıkar.
        System.out.println(32 / 5); // 32 / 6 => 6 yazdırır. int/int sonuç da integer data tipinde çıkar.

        double c = 27;
        System.out.println(c / b); // 27/4 => 6.75
        // bölen ya da bölünen sayılardan biri double ise sonuç da double olarak verir.

        //a yi b ye bölüp sonucu ondalıklı olarak yazdırın.

        double sonuc1 = (a/b); // 27/4=>6,75==>6 sonuc1 =6
        System.out.println("sonuc1 :" + sonuc1); // 6.0

        double sonuc2 = (double)(a/b);
        System.out.println("sonuc2 :" + sonuc2); // 6,0

        double sonuc3 = (double)a/b; //
        System.out.println("sonuc3 :" + sonuc3); //6,75

        // neden ilk iki double örneğinde olmadı da sonuc3 de tam ondalıklı sonuç doğru çıktı.
        // a yı double ye cast ettiğimizde variable'lardan a nın data tipi in türünden double data türüne cast ettik.
        //sonuç olarak, ARTIK, sayılardan biri double olduğundan, sonuç da tam olarak çıktı.

        System.out.println( 2567 / 10 ); // 2567 / 10 =>256
        System.out.println(256 / 10); // 25,6 ==> 25
        System.out.println(25/10); // 2,5 ==> 2
        System.out.println(2 / 10); //0,2 ==> 0

        System.out.println(2567 % 10 ); // 7 modüles
        System.out.println(256 % 10); // 6
        System.out.println(25 % 10); // 5
        System.out.println(2 % 10); // 2







    }
}
