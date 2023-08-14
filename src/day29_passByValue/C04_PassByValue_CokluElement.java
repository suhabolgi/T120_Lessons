package day29_passByValue;

import java.util.Arrays;

public class C04_PassByValue_CokluElement {
    public static void main(String[] args) {
        // verilen bir int Array'in elementlerini 2 katına çıkarıp, yazdıran bir metod oluşturun.

        int [] arr = {3,4,5};
        System.out.println("Main metod'da call'dan önce arr : "+ Arrays.toString(arr));
        elementArttir(arr);
        System.out.println("Main metod'da call'dan sonra arr : "+ Arrays.toString(arr));

        /*
        Verilen Array'a 10 değerini element olarak ekleyen, sonra da yazdiran bir metod oluşturun*/

        System.out.println("*************************************");

        int []arr2 ={3,4,5};
        System.out.println("Main metod'da call'dan önce arr : "+ Arrays.toString(arr2));
        elementArttir(arr);
        System.out.println("Main metod'da call'dan sonra arr : "+ Arrays.toString(arr2));

    }
    public static void elementEkleme (int[]arr){

        int [] yeniArr = new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];

        }
        yeniArr[yeniArr.length-1]=10;
        arr= yeniArr;
        System.out.println("metod'da arr2 nin yeni hali :"+ Arrays.toString(arr));



    }
    public static void elementArttir (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*2;

        }
        System.out.println("metod'da değiştirilen arr : "+ Arrays.toString(arr));

    }
}
