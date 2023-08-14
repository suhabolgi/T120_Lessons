package day13_stringManipulations_forLoops;

public class C04_ReplaceFirst {
    public static void main(String[] args) {


        String str = "Java Candir, kendisini çok seviyoruz.";

        // sadece ilk a'yi BUYUK A yapin

        System.out.println(str = str.replaceFirst("a", "A"));

        //JAva Candir

        // ilks space'i iki space haline getirin

        System.out.println(str = str.replaceFirst(" ", "  "));
        //JAva  Candir, kendisini çok seviyoruz.

        // ilk sayiyi space haline donusturun
        System.out.println(str.replaceFirst("\\d", " "));
        // Java Candir, kendisini cok seviyoruz 23.

        // ilk ozel karakteri * olarak degistirin
        System.out.println(str.replaceFirst("\\W", "*"));
        // Java*Candir, kendisini cok seviyoruz123.


    }
}
