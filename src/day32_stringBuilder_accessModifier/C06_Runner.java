package day32_stringBuilder_accessModifier;

public class C06_Runner {
    public static void main(String[] args) {

        C05 obj = new C05();
        // System.out.println(obj.privateSayi); private class üyelerine kendi class'ı hariç class
        // dışından hiçbir şekilde ulaşılamaz.

        System.out.println(obj.defaultSayi); // 0
        obj.defaultSayi=20;
        System.out.println( obj.defaultSayi);// 20

        System.out.println(obj.protectedSayi); // 0
        obj.protectedSayi= 30;
        System.out.println( obj.protectedSayi);// 30

        System.out.println(obj.puplicSayi); // 0
        obj.puplicSayi=40;
        System.out.println( obj.puplicSayi); //40
    }
}
