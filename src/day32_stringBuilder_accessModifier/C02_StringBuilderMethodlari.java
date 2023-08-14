package day32_stringBuilder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da güzelleşiyor");
        sb1.reverse();
        System.out.println(sb1); //  .royişellezüg ad ahad avaJ

        // herhangi bir atama yapmasak da metoddaki değişikilk , muteable olduğundan kalıcı olur.

        sb1.reverse();
        System.out.println(sb1); // Java daha da güzelleşiyor

        // sondaki harfi silme
        System.out.println(sb1.deleteCharAt(sb1.length() - 1)); //Java daha da güzelleşiyo

        System.out.println(sb1.delete(9, 12)); //  Java daha güzelleşiyo

        System.out.println(sb1.insert(sb1.length(), "r.")); //Java daha güzelleşiyor.

        String str = "Java da bundan memnun";
        sb1.insert(9, str, 4, 7); // Java daha güzelleşiyor.

    }
}
