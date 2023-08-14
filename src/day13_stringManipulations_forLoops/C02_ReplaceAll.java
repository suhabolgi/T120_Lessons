package day13_stringManipulations_forLoops;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";

        str = str.replace("1", "");
        System.out.println(str);

        //Ja4va 8C9a2n5dir.

        // sayilarin tamamindan kurtulmak istersek, Replace() yeterli olmaz.

        // Java da sayilar,özel karakterler ya da alfabetik karakterlerin tümüyle islem yapmak
        // istersek
        //replaceAll(istenenGrup, yeniDeger)
        // örneğin gbütün sayilarin yerine " " yazmak içiv yani hiçlik

        System.out.println(str.replaceAll("\\d", ""));
        //


    }
}
