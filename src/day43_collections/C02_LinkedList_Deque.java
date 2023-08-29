package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {

    public static void main(String[] args) {
        /*
            Deque : double ended queue demektir. Cift basli kuyruk
            iki bastan da islem yapildigi icin pekcok method'un first ve last seklinde 2 versiyonu olur

         */


        Deque<String> isimler = new LinkedList<>();

        isimler.add("Cemil"); // list'deki add gibidir, ceteris paribus sona ekler.
        isimler.addFirst("Resul"); // [Resul, Cemil] [Resul ] başa eklendi.
        isimler.addLast("Mehmet"); // [Resul, Cemil, Mehmet]
        isimler.addLast("Resul");  //  [Resul, Cemil, Mehmet, Resul]
        isimler.add("Eyyup"); // [Resul, Cemil, Mehmet, Resul, Eyyup]
        isimler.add("Kaan"); // [Resul, Cemil, Mehmet, Resul, Eyyup, Kaan]

        System.out.println(isimler.removeLast()); // Kaan
        // son elementi gider bulur yok eder ve kunyesini de bize onu getirir. :))
        // [Resul, Cemil, Mehmet, Resul, Eyyup]

        System.out.println(isimler.removeLastOccurrence("Resul")); // true
        // isimlerdeki en son kullanilan REsul 'u bulur, yok eder. ve yokettim demek icin de true der.
        // [Resul, Cemil, Mehmet, Eyyup]

        System.out.println(isimler.removeLastOccurrence("Hilal")); // false
        // isimlerdeki en son kullanilan Hilal 'i arar bulsaydi yok ederdi, bulamazsa false der.
        // [Resul, Cemil, Mehmet, Eyyup]

        System.out.println(isimler.pollFirst()); // Resul
        /*isimler.pollFirst() ifadesi, bir TreeSet veri yapısının bir elemanını kaldırarak döndüren bir işlemdir.
        TreeSet, elemanlarını sıralı bir şekilde tutan bir veri yapısıdır. pollFirst() metodu,
        TreeSet içindeki en küçük (ilk) elemanı kaldırır ve bu elemanı döndürür.
        Eğer TreeSet boş ise, null değeri döner. en küçük isim (alfabetik sıraya göre ilk isim) kaldırılır
        ve bu isim ekrana yazdırılır.*/

        // [Cemil, Mehmet, Eyyup]

        System.out.println(isimler.pop()); // Cemil
        // [Mehmet, Eyyup]

        System.out.println(isimler.offerFirst("Bugra")); // true
        /*Kapasite kısıtlamalarını ihlal etmediği sürece, belirtilen öğeyi bu deque'in en önüne ekler.
        öğe bu deque'e eklenmişse true, aksi halde false Atar:*/
        // [Bugra, Mehmet, Eyyup]

        System.out.println(isimler.peekFirst()); // Bugra
        /*Bu deque'in ilk elemanını alır, ancak kaldırmaz veya bu deque boşsa null döndürür.*/
        // [Bugra, Mehmet, Eyyup]

        System.out.println(isimler.element()); // Bugra
        /*Bu deque tarafından temsil edilen kuyruğun ilk öğesinialır,
        ancak kaldırmaz. Bu yöntemin peek yönteminden tek farkı,
        bu deque boşsa bir istisna fırlatmasıdır. Bu yöntem getFirst() ile eşdeğerdir.*/
        // [Bugra, Mehmet, Eyyup]

        System.out.println(isimler.hashCode()); // 275678710

        isimler.clear();

        System.out.println(isimler.hashCode()); // 1

        isimler.add("Kahraman");

        System.out.println(isimler.hashCode()); // 841010808


        System.out.println(isimler);

    }
}