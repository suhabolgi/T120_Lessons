package day11_stringManipulations;

public class C05_StartsWithAndWith {
    public static void main(String[] args) {

        String str =    "Java cok guzel";

        // str Java ile mi basliyor

        System.out.println(str.startsWith("Java"));     //True

        // str J ile mi basliyor

        System.out.println(str.startsWith("J"));        // True

        // str Ja ile mi basliyor

        System.out.println(str.startsWith("Ja"));       // True

        // str "Java cok guzel" ile mi basliyor

        System.out.println(str.startsWith("Java cok guzel")); // True

        System.out.println(str.startsWith(""));               // True

        // 5. indeksten sonrasi c ile mi baslar.

        System.out.println(str.startsWith("c",5));  // True

        // 6. indeksten sonrasi ok ile mi baslar.

        System.out.println(str.startsWith("ok",6));    // True

        // str "güzel" ile mi biter.

        System.out.println(str.endsWith("guzel"));      // True

        // str "el" ile mi biter.

        System.out.println(str.endsWith("el"));         // true

        // str "" ile mi biter.

        System.out.println(str.endsWith(""));           // true

        // str " " ile mi biter.

        System.out.println(str.endsWith(" ")); // false



    }
}
