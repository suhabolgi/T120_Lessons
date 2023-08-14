package day23_multidimensionalArrays;

public class C03_ArraydakiEnBuyukEnKucukSayilariYazdirma {
    public static void main(String[] args) {
        // verilen 2 katlı int bir array'i en büyük ve en küçük sayiyi bulup yazdiran bir metot
        // oluşturun.


        int [][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};

        enBuyukEnKucukYazdir(arr);
    }
    public static void enBuyukEnKucukYazdir(int[][] arr){

        int enKucukSayi = arr[0][0];
        int enBuyukSayi = arr[0][0];

        // 2 katlı bir array olduğu için iç içe 2 forLoop oluştururuz.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                // arr[i][j]
                if (arr[i][j] < enKucukSayi){
                    enKucukSayi = arr[i][j];
                }
                if (arr[i][j] > enBuyukSayi){
                    enBuyukSayi = arr[i][j];
                }
            }
        }
        System.out.println("En kucuk sayi : " + enKucukSayi);
        System.out.println("En buyuk sayi : " + enBuyukSayi);

    }
}
