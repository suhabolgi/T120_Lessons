package day04_dataCasting_WrapperClass;

public class C06_DataCasting_Soru1_Cozum2 {
    public static void main(String[] args) {


        // olarak 3 tane sayi belirleyelim.

        ortalamaSayi(10, 34, 45);
        ortalamaSayi(5, 6, 7);


    }

    public static double ortalamaSayi(int num1, int num2, int num3) {

        double ortamala = (num1 + num2 + num3) / 3;

        System.out.println(ortamala);

        return (double) (num1 + num2 + num3) / 3;
    }

}
