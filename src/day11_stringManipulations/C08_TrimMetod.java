package day11_stringManipulations;

public class C08_TrimMetod {
    public static void main(String[] args) {

        String str = "      Gunaydin ";

        System.out.println("/"+str+"/");            // /      Gunaydin / metnin basindaki ve sonundaki bosluklara bakin

        // trim metodu String bir ifadenin basindaki ve sonundaki boşluk
        // karakterini ortadan kaldirir.

        System.out.println("/"+str.trim()+"/");     // /Gunaydin/ bakiniz metin basi ve sonu boşluk karakteri sifirlandi



    }
}
