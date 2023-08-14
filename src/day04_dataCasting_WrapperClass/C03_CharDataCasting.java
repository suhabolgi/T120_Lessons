package day04_dataCasting_WrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {

        //char data türü özel bir data türüdür.
        //her ne kadar char data türü '' içerisinde sayı, harf, özel karakter alsa da ascii tablosundaki sayısal değer
        //leri de kullanabilir.

        // aynı şekilde char data türündeki bir variable'ı matematiksel işlmede kullanirsaniz o zaman
        // ascii tablosundaki değeri ile matematiksel işleme girer.

        char ch1 = 'a';

        int sayi1 = ch1;
        System.out.println("ch1 :" + ch1); //a
        System.out.println("sayi1 :" + sayi1); //97

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir.";

        System.out.println(str1+str2+str3); //Java Candir.

        char ch2 = 'a';
        char ch3 = 'b';

        System.out.println(ch2+ch3); // 97 + 98 =195


        //veriken integer bir sayının ascii tablosundaki char karşılığını yazdirin.

        int karakter = 97;
        char ascii = (char)karakter;

        System.out.println("verilen sayinin ascii tablosundaki değeri :" + ascii); //a

    }
}
