package day26_forEachLoop_consructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static void main(String[] args) {
        // Soru 5-
        // Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[]arr1={3,5,8,1,3,9,2,4,7,13,15};
        int[]arr2={2,7,3,58,1,9,0,3,52,57};

        // bir foreachLoop her iki arrayin de elementlerini kontrol edemeyeceği için,
        // bunun için iç içe iki forEachLoop oluşturalım.
        // elementleri karşılaştırıp, eğer eşitlers eve daha önce listeye eklenmemişlerse,
        // listeye ekleyelim.
        // bir liste oluşturalım

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (Integer each1: arr1
             ) {
            for (Integer each2: arr2
                 ) {
                if (each1==each2 && ! ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each1);
                }

            }
        }
        Collections.sort(ortakElemanlarListesi); // arrayi sıralar.
        System.out.println(ortakElemanlarListesi); // [1, 2, 3, 7, 9]
    }
}
