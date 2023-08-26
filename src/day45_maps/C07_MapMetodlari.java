package day45_maps;

import java.util.HashMap;
import java.util.Map;

public class C07_MapMetodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler = new HashMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);
        System.out.println(harfler);
        //{A=15, T=5, Z=50, K=25, L=10}

        harfler.put("L",40);
        System.out.println(harfler);
        //{A=15, T=5, Z=50, K=25, L=40}

        System.out.println(harfler.containsKey("Z")); // true
        System.out.println(harfler.containsValue(5)); // true
        // eger value birlesitirilmis bir String ise -"Ali-Can-11-H-MF"
        // harfler.containsKey("Ali") false doner.

        System.out.println(harfler.getOrDefault("G", 0)); // 0
        System.out.println(harfler.getOrDefault("T", 0)); // 5
        System.out.println(harfler.get("G")); // null
        // T'nin valuesini getir bulamazsan default olrak 0 getir.
        // G'nin valuesini getir bulamazsan default olrak 0 getir.
        // System.out.println(harfler.get("G")); // null degeri yerine yukaridaki daha sekildir.

        System.out.println(harfler.replace("F", 90)); // null
        System.out.println(harfler);
        //{A=15, T=5, Z=50, K=25, L=40}


        System.out.println(harfler.replace("T", 90)); // 5
        System.out.println(harfler);
        // {A=15, T=90, Z=50, K=25, L=40}

        System.out.println(harfler.replace("A", 20, 30)); // false
        System.out.println(harfler);
        // {A=15, T=90, Z=50, K=25, L=40}
        // A'nın degeri 20 ise 30 yap

        System.out.println(harfler.replace("K", 25, 30)); // true
        System.out.println(harfler);
        // {A=15, T=90, Z=50, K=30, L=40}

        System.out.println(harfler.replace("X", 25, 30)); // false
        System.out.println(harfler);
        // {A=15, T=90, Z=50, K=30, L=40}

        System.out.println(harfler.remove("Z")); // 50
        System.out.println(harfler);
        // {A=15, T=90, K=30, L=40}
        // Z 'yi sildi bana degerini getiridi, value'si ile birlikte kaybolur.

        System.out.println(harfler.remove("Y")); // null
        System.out.println(harfler);

        System.out.println(harfler.remove("T",90)); // true
        System.out.println(harfler); // {A=15, K=30, L=40}







    }

}
