package day45_maps;

import java.util.HashMap;
import java.util.Map;

public class C08_MapMetodlari {
    public static void main(String[] args) {

        Map<String, Integer> harfler = new HashMap<>();

        harfler.put("K", 25);
        harfler.put("L", 10);
        harfler.put("T", 5);
        harfler.put("Z", 50);
        harfler.put("A", 15);
        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

        System.out.println(harfler.putIfAbsent("L", 30)); // 10
        System.out.println(harfler); //{A=15, T=5, Z=50, K=25, L=10}

        // T'nin valuesini 2 katina cikarin.
        int value = harfler.get("T"); // 5
        harfler.put("T", 2 * value);
        System.out.println(harfler); // {A=15, T=10, Z=50, K=25, L=10}

        // Z'nin degerini 20 artir.
        harfler.compute("Z", (k, v) -> v + 20); // rastgele bir sembol degildir.
        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=10}

        // L nin degerini 3 katinin 5 fazzlasi yapin.
        harfler.compute("L", (a, b) -> (b * 3) + 5); // illaki k, v yazmak zorunlu degildir.
        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35}

        //map'da M yoksa degerini 50 olarak map'a ekleyin.
        // harfler.putIfAbsent("M",50);
        // System.out.println(harfler);
        // {A=15, T=10, Z=70, K=25, L=35, M=50}

        harfler.computeIfAbsent("M", v -> 50);
        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35, M=50}

        //T harfi varsa valuesini 1 artirim.

        harfler.computeIfPresent("T", (a, b) -> b + 1);
        System.out.println(harfler); // {A=15, T=11, Z=70, K=25, L=35, M=50}



    }
}
