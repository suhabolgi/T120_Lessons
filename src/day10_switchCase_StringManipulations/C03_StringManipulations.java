package day10_switchCase_StringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {


        /*
            String manipulation,
            verilen bir String uzerinde HAZIR METHOD'lar kullanarak
            - degisiklik yapmak
            - veya verilen String uzerindeki bir bilgiyi
            almak icin yaptigimiz tum islemlerdir
            String uzerinde yapilan manipulation islemleri
            String'i kalici olarak degistirmez
            Eger yapilan islem sonucundaki yeni halin kalici olmasini istersek
            ATAMA yapmaliyiz.

            YANI, GERCEK, ISTEMEDIGIMIZ TAKDIRDE DEGISTIRILEMEZ. ANCAK MANIPULE EDILEBILIR.
         */
        String str = "Java Candir";

        // str'in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // str'i tum harfleri buyuk olacak sekilde yazdirin.

        System.out.println(str.toUpperCase().charAt(3)); // A Stringin tamamini büyük harfe cerirerek 3. indeksi aldi
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir . Strinh manipulation istemedigimiz takdirde str 'i degistiremez.

        // str'i tamamen kucuk harflerden olusan bir metne cevirin

        str = str.toLowerCase();    // istedigimiz takdirde kalici olarak da degistirip, digisikligi str'a atadik
        System.out.println(str); // java candir

    }
}
