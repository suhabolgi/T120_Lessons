package day21_arrays;

import java.util.Arrays;

public class C01_ArrayinTumElementleriniArtirma {
    public static void main(String[] args) {
        // bir arrayin tüm elementlerini artırın. == ForLoop

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.


        int[] arr = {3,4,6,8,1};
        arr = arrayElementlerini2Artir(arr);
        System.out.println(Arrays.toString(arr)); // [5, 6, 8, 10, 3]


    }

    public static int[] arrayElementlerini2Artir(int []arr){

        for (int i = 0; i <arr.length ; i++) {
            // arr[i] = arr[i]+2;
            arr[i] +=2;

        }
        return arr;
    }
}
