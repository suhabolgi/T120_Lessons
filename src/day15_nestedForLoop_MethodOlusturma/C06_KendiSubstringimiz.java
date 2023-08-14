package day15_nestedForLoop_MethodOlusturma;

public class C06_KendiSubstringimiz {
    public static void main(String[] args) {

        String str = "Java Candir";
        int baslangic = 3 ;
        int bitis = 7;

        // verilen String ve baslangic bitis degerlerini dikkate alarak
        // Bitis değeri baslangıç degerinden kücükse hata mesajı yazdirin.
        // Başlangic veya bitiş indeks degerleri indeks degerleri ile uyusmuyırsa hata mesaji verin
        // degerler uysunda baslabgic indeksinden (DAHİL) bitis indensine (HARİC)  kadar karakterleri
        // yazdirin

        if (baslangic > bitis){
            System.out.println("baslangic degeri bitiş degerinden büyük olamaz");
        } else if (baslangic < 0 || bitis<0 || baslangic>str.length() || bitis>=str.length()) {
            System.out.println("indeksler hatali");

        }else {
            for (int i = baslangic; i < bitis ; i++) {
                System.out.print(str.charAt(i));

            }
        }

        System.out.println(str.substring(baslangic, bitis)); // yukaridaki islemi tek satirda da yatık


        str.substring(5);
        /*
            Bu method bize "Candir" döndürür
            ancak
            yazdırmazsak veya bır variable'a atamazsak
            bu method'un dondurdugu sonuc bir ise yaramaz
         */

        String strIstenenBolum = str.substring(5); // kaydeder ama yazdirmaz
        System.out.println(str.substring(5)); // yazdirir ama kaydetmez
    }
}
