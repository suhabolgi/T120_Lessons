package day13_stringManipulations_forLoops;

public class C01_Replace {
    public static void main(String[] args) {


        String str = "Java'yi anliyorum ama yazamiyorum.";

        // var olan bir String 'in istediğimiz kismini degistirebiliriz.


        System.out.println(str.replace('J', 't'));

        //tava'yi anliyorum ama yazamiyorum.

        System.out.println(str.replace('a', 'b'));

        // bvb'yi bnliyorum bmb ybzbmiyorum.

        System.out.println(str.replace("Java", "abc..."));

        // abc...'yi anliyorum ama yazamiyorum.

        System.out.println(str.replace("Java", "abc...").charAt(0));

        // a


    }
}
