package day11_stringManipulations;

public class C03_Substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        /*

        substring () metodu bize bir String'in istedigimiz parcasini alma imkani verir.

        2 turlu kullanimi vardir.
        1- baslangic indeksini verirseniz, o indeksten başlayarak sona kadar olan kismi yazdirir.
        2- baslangic ve bitis indekslerini veerirseniz
            ==> baslangic indeksinden DAHİL
            ==> bitis indeksine kadar HARİÇ yazdirir.

         */
        System.out.println(str.substring(1));       // ava Candir

        System.out.println(str.substring(3));       // a Candir

        System.out.println(str.substring(7));       // ndir

        System.out.println(str.substring(0));       // Java Candir

        System.out.println(str.substring(11));      // hiçlik yazdirir

        //  System.out.println(str.substring(15));       StringIndexOutOfBoundsException

        // Java Candir örneğimizdi.

        System.out.println(str.substring(3, 6));     //    a C

        System.out.println(str.substring(5, 10));    // Candi

        System.out.println(str.substring(1, 2)); // a

        System.out.println(str.substring(6, 7));     // a

        // bu yazim bize istenen tek bir elementi verir,
        // charAt() ' benzer ama EXTRA olumlu bir özelligi var.
        // substring bize string dondurdugu icin manipulasyona devam edebilriz.

        //6. ındekteki harfi buyuk harf olarak yazdırın.

        System.out.println(str.substring(6, 7).toUpperCase());       //A

        System.out.println(str.substring(3, 3));     // hiclik kaldi

        // System.out.println(str.substring(8,5)); StringIndexOutOfBoundsException

        // Son 3 harfi yazdirin

        System.out.println(str.substring(str.length() - 3));  // dir

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";

        System.out.println(str1 + str2 + str3);     // Java Candir

        System.out.println(str1.concat(str2).concat(str3));

        String ad = "Süha ";
        String soyad = "bolgı";

        System.out.println(soyad.substring(0).toUpperCase()); // BOLGI

        String yeniSoyad1 = soyad.substring(0, 1).toUpperCase();
        String yeniSoyad2 = soyad.substring(1);
        String sonSoyad = yeniSoyad1 + yeniSoyad2;

        System.out.println(sonSoyad); // Bolgı
        System.out.println("substring ile düzenlediğim yeni ad soyadım : " + ad + sonSoyad);


    }
}
