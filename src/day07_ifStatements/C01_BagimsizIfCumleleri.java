package day07_ifStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {

        /*bagimsiz if cumleleri isminden de anlasilacagi üzere
        kodun kalanı ile ilgilenmez.

        sadece boolean sarta odaklanir.sartin sonucu true ise if body'si calisir.
        boolean sartin sonucu false ise  if body'si devreye girmez.

        YANİ birden fazla if sumlesi olan bir kod calistiginda
        kaç tane if body'sinin calisacaği verilen degerlere baglidir.
         */

        int a = 99;
        int b= 99 ;

        if (a>0) { // false
            System.out.println("a sayisi pozitiftir.");
           }
        if (a+b >100) {     //false
            System.out.println("sayilarin toplami 100 den buyuktur.");
        }
        if (b % 3 == 0) {   //false
            System.out.println("b 3 ile bölünebilen bir tamsayidir.");
        }
        if (b<100) {    //false
            System.out.println("b yuzden kucuk bir tamsayidir.");
        }
    }
}
