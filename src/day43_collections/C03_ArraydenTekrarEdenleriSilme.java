package day43_collections;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSilme {

    public static void main(String[] args) {

        int[] arr = {2,4,5,6,3,4,2,1,5,6,4,3,2,3,0,1,3,4,2,5};

        // verilen array'deki tekrar eden elementleri silip
        // array'i her elementin sadece 1 kere bulundugu bir hale donusturun

        // bos bir list olusturup, array'deki elementleri tek tek ele aldik
        // ele aldigimiz element list'de yoksa list'e ekledik

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each:arr
             ) {
            if (!tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }
        }

        System.out.println(tekrarsizList); // [2, 4, 5, 6, 3, 1, 0]


        // Ayni islemi Set ile daha kolay yapabiliriz
        /*
        Set, benzersiz elemanları içeren bir koleksiyon (collection) arayüzüdür.
        Bir Set, aynı elemandan yalnızca bir tane içerebilir.
        Bu nedenle, verileri depolarken yinelenen elemanların önlenmesi gerektiğinde kullanışlıdır. */

        Set<Integer> tekrarsizSet = new TreeSet<>();
        for (int each: arr
             ) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6]

        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 6, 3, 4, 2, 1, 5, 6, 4, 3, 2, 3, 0, 1, 3, 4, 2, 5]
        // Tekrarsiz elementleri Set olarak elde ettik ancak Array hala eski halinde , soruyu tam bitirmedik.
        // array'i set'deki elementlerden olusan hale donusturelim

        arr = new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(arr));
        // Array'a tekrarsizSetdeki element sayisi kadar yeni bir deger atadik// [0, 0, 0, 0, 0, 0, 0]

        int index=0;
        for (Integer each : tekrarsizSet
             ) {
            arr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5, 6]

    }
}
/*
Eleman Ekleme ve Kaldırma: Set içine eleman eklemek için add() metodunu kullanabilirsiniz.
Elemanları kaldırmak için remove() veya clear() metodlarını kullanabilirsiniz.

Eleman Kontrolü: Bir elemanın Set içinde bulunup bulunmadığını kontrol etmek için contains()
metodunu kullanabilirsiniz.

Dizi veya Liste Dönüşümü: Bir Set'i dizi veya liste olarak dönüştürebilirsiniz.
Bunu yaparken toArray() veya new ArrayList<>(set) gibi yöntemleri kullanabilirsiniz.

Birleştirme ve Kesişim: İki farklı Set'i birleştirebilirsiniz (addAll()) veya
bu Set'lerin kesişimini (retainAll()) bulabilirsiniz.

Boşluk Kontrolü: isEmpty() metodu ile Set'in boş olup olmadığını kontrol edebilirsiniz.

Sıralama: TreeSet gibi sıralı Set'ler, elemanlarını belirli bir sıraya göre saklar ve bu sıralamayı korur.

Performans: HashSet, elemanları hızlı bir şekilde ekleme ve arama için optimize edilmiştir.

Bağlantı Sırası: LinkedHashSet, elemanların eklendiği sırayı korur.

Sıralı Kümeler: TreeSet, elemanları belirli bir sıraya göre tutar. Özel bir sıralama düzeni sağlar.

Çapraz Kümeler: Farklı Set'ler arasında kesişim, birleşim, fark gibi işlemleri gerçekleştirebilirsiniz.*/