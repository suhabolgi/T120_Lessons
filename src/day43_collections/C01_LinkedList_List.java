package day43_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_List {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        isimler.add("Omer");
        isimler.add("Cemil");
        isimler.add("Nergiz");


        List<String> ikinciList = new LinkedList<>();
        ikinciList.add("Mustafa");
        ikinciList.add("Cemil");


        System.out.println(isimler.retainAll(ikinciList)); // true
        // isimler objesine git, buradaki isimlerden,  ikinci listde de ayni isimde olan elementler varsa onu
        // bulur gerisini siler. silme islemini isimler objesinden yapar. ikinciList elemanlari ayni durur.


        System.out.println(isimler); // [Cemil]
        // retainAll ortak elemanlar disindaki tum elemanlari siler. matenatiktedki gibi dusundugumuzde
        // iki listenin kesisimini alir.

        System.out.println(ikinciList); // [Mustafa, Cemil]


        ikinciList.retainAll(isimler);
        // ikinci listteki [Mustafa, Cemil] elemanlari, isimler listin'de yer alan elementlerle aynı ise, ayni olanlari
        // ikinciListten siler. isimler objesinde kalan eleman sadece [Cemil] oldugundan (27. satir.)
        // aynı isimler [Cemil] oldugundan onu saklar,[Mustafa] ismini List'den siler.



        System.out.println(ikinciList); // [Cemil]



    }
}