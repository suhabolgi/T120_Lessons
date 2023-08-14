package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatementsSoru_5 {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf karakteri gir");
        char girilenHarf = scanner.next().charAt(0); // girilen kelime dahi olsa ilk harfini

        if (girilenHarf >='a' && girilenHarf<='z'){
            System.out.println((""+girilenHarf).toUpperCase());
        }else {
            System.out.println(girilenHarf);
        }


    }
}
