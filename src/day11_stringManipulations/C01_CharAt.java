package day11_stringManipulations;

public class C01_CharAt {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.charAt(0));      // ilk harfi yazdirdik. 0 inci indeks

        System.out.println(str.charAt(6));      // 7. harfi yazdirdik. 6 nci indeks

        // Bu metnin uzunlugu 11
        // son harfi yazdirin.

        System.out.println(str.charAt(11-1));   // r

        // Sondan 3 uncu harfi yazdirin.

        System.out.println(str.charAt(11-3));   // d

//        eger sondan basa dogru gelecek sekilde bir char isteniliyorsa
        // charAt (uzunluk-sondanKacinciKArakter)
        // yani uzunluk-1 bize son indeksi verir her zaman.
        // Metnin uzunlugundan daha buyuk bir siradaki karakter istenilirse,
        // ornegin 20. karakteri hata verir.

        // 4. harfi BUYUK olarak yazdirin.

        System.out.println(str.toUpperCase().charAt(3)); // charAt() bize char data turunde bir sonuc dondurur.

        // toUpperCase() gibi metodlar String variable 'lar ile calistigindan charAt () metodu calistiktan sonra
        // calizmazlar. Yani StringManipulation yapilamaz.


    }
}
