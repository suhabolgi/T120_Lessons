package day11_stringManipulations;

import java.util.Scanner;

public class C10_IndexOf_Soru2_MySelf {
    public static void main(String[] args) {

        // Soru 2 :
        // Kullanicidan bir String ve aranacak metin alin.
        // Aranan metnin String icerisinde kullanimini kontrol ederek
        // asagidaki cumlelerden uygun olanini yazdirin.
        //- String aranan metni icermiyor
        //- Aranan metin String’de sadece 1 kere kullanilmis
        //- Aranan metin String’de sadece 1’den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.print("İstediğiniz bir cümle yazın. \nCümle :");
        String metin = scanner.nextLine();

        System.out.print("lütfen metinde aramak istediğiniz bir kelime girin. \nKelime :");
        String arananKelime = scanner.next();

        // aradığımız kelimeninin ilk olarak hangi indekste olduğunu tespit etmek için bulduğumuz indeks
        // numarasını int bir variable'a atadık.

        int ilkIndeks = metin.indexOf(arananKelime);

        // 2. aşama olarak if body'si oluşturarak temelde iki şartlı sonucumuz var
        // ya verilen kelime metnin indekslerinden hiçbirinde yoktur. ya da en az bir tane vardır.

        if (ilkIndeks == -1){
            System.out.println("girilen :" + arananKelime +", kelimesi cümlede hiç kullanılmamıştır.");

        }else{ // yukarıda kullanılmama şartını yazdık, şimdi de kullanıldığı takdirde ilk indeksi
            // hariç sonrasında da kullanılıp kullanılmadiği ile ilgili ikinci bir if body si kuracağız.

            int ikinciIndeks = metin.indexOf(metin.indexOf(arananKelime)+1);
            // if body si kurmadan önce ilk indekse pozitif ya da 0 olarak bir değer dönmüşse saten onu
            // else kısmında yazacağız, amacımız ikinciIndek te tekrar bir tane daha aynı kelime olup olmadiğini
            //kontrol etmek olacak. eğer ilk indeksi bulduktan sonra -1 yani 2. bir indeksi bulamazsa
            // bir defa kullanıldı diyeceğiz, yoksa birden fazla kullanılmış diyeceğiz.
            if (ikinciIndeks == -1){
                System.out.println("girilen :" + arananKelime +", kelimesi cümlede 1 kere kullanılmış");
            }else {
                System.out.println("2 defa veya daha fazla kullanilmis");
            }

        }


    }
}
