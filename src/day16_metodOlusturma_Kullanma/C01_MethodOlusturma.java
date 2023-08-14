package day16_metodOlusturma_Kullanma;

public class C01_MethodOlusturma { // Class baslangici

    //Soru 1- Kullanicidan input olarak verilen bir String,
    //        baslangic ve bitis indexlerine gore
    //        baslangic index'i dahil, bitis index'i haric olacak sekilde
    //        aradaki harfleri yazdiran bir method olusturun.

    // sorudaki REQUIREMRNTS ları dikkatlice okuduğumuzda , bu soruda bizden yazdırmamız istendiği
    // için oluşturacağımız metodun RETURN TYPE'ını VOİD yapacağız.
    //
    //          - kullanici baslangic degeri olarak,
    //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
    //          hata mesaji yazdirin.


    public static void main(String[] args) {  // method baslangici
        altString("bugün tekrar yapıyorum", 3, 7);

        altString("Java guzeldir", 3, 7);
        //a gu
        altString("Biraz sabir lutfen", 5, 4);
        // Baslangic index'i bitis index'inden buyuk olamaz

        altString("Bu da mi gol degil ?", 11, 33);
        //verilen index sinirlarin disinda

        String str = "Aramiz bozulmasin";
        altString(str, 5, 10); // z boz


        // methodlarimizi çağiracağimiz yer her zaman MAIN METHOD lardir.
        // MAIN METHOD umuz Statik mi, EVET, öyleyse onunla iletisim kurmaya çalisan butun METHOD lar
        // STATIK olmali, şimdilik tüm methodlarimizi STATİK ve PUBLIC kullanacagiz.

    } // main method sonu


    public static void altString(String metin, int basIndex, int bitIndex) {

        // 41. satırda belirtilen metod(parametreleri) içerinde yazılan ; String metin, int basIndex,,
        // int bitIndex
        // bunların hepsi belirli data türündeki variable'lardır. değeri henüz atanmamış bir deklerasyondur.
        // artık bu 3 variable oluşturulmuş oladuğu için, bunlar varmış gibi kullanacağız, parametrelere
        // uygun argümentleri de method call yaptığımızda atayacağiz.


        if (basIndex > bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (basIndex >= metin.length() || bitIndex >= metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
        } else {
            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println(""); // bunu, her bir metod çağırma işleminde önceki ile karışmaması için
        // alt alta yazdırmak için ekledik.

    }// altString() metodu sonu;


}// class'in sonu;
