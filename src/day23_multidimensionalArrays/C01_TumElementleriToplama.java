package day23_multidimensionalArrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {

        int [ ] arrTek = {3,7,1,9};
        int toplam = 0;
        for (int i = 0; i <arrTek.length ; i++) {
            toplam +=arrTek[i];

        }
        System.out.println( "arrTek in elementleri toplamı : " + toplam);


    }
}
