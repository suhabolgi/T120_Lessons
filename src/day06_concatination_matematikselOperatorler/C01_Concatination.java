package day06_concatination_matematikselOperatorler;

public class C01_Concatination {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

        //sadece yukaridaki variable'ları kullanrak
        //aşağida veriken metinleri yazdirin.

        // Java35

        System.out.println(s1+a+b); // "Java35"

        // Java15

        System.out.println(s1 + a*b); // "Java15"

        // 8Candir

        System.out.println(a+b+s2);     // "8Candir"

        // 53Java

        System.out.println(b+(a+s1));   // "53Java"

        System.out.println(s4 + b + a + s1); // s4 bir hiçliktr ve string bir ifadedir. stringleşti ve s4+b ==> "5" olur
        System.out.println(b + s4 + a + s1); // s4 bir hiçliktr ve string bir ifadedir. stringleşti ve b + s4 ==> "5" olur

        //"23"===> Integer    Integer.parseInteger("23") =====> 23

        // 35 Java

        System.out.println(s4 + a + b + s3 + s1);   // "35 Java"

    }
}
