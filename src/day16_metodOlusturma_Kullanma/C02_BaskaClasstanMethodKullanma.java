package day16_metodOlusturma_Kullanma;

public class C02_BaskaClasstanMethodKullanma {
    public static void main(String[] args) {

        // Method olusturdugumuz yeri biliyorsak, baska class lardaki metodlari da hemen kullanabiliriz.

        C01_MethodOlusturma.altString("Bu is cok guzel", 3,10); // is cok
        C01_MethodOlusturma.altString("bak seni buradan da çağırdım ", 1,15);

        // C01_MethodOlusturma.altString('m',"ali",true);
        /*
            Bir method call sirasinda yazdigimiz degerlere ARGUMENT
            method deklarasyonundaki parantez icindeki variable'lara PARAMETRE denir

            public static void altString(String metin, int basIndex, int bitIndex ) PARAMETRE
            C01_MethodOlusturma.altString('m',"ali",true); ARGUMENT

            String metin = 'm';
            int basIndex = "ali";
            int bitIndex = true;

            argument'ler ile parametreler uyumlu olmazsa java CTE (altini kirmizi cizer) verir
         */
    }
}
