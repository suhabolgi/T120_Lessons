package day18_whileLoop_DoWhileLoop;

public class C06_WhileLoop_Soru1_MySelf {
    public static void main(String[] args) {

        // Soru 1-
        // While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.


        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i +" ");

            }
        }
        System.out.println("******************************");

        int baslangic =10;
        int bitis = 99;

        while (baslangic<bitis){
            if (baslangic %7 ==0){
                System.out.print(baslangic+ " ");

            }
            baslangic ++;

        }




    }


}
