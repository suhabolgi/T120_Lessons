package day03_scanner;

import java.util.Scanner;

public class C10_Examples {
    public static void main(String[] args) {
        //s.198
        Scanner scanner = new Scanner(System.in);

        System.out.println("int data türünde veri girin");
        int intData = scanner.nextInt();

        System.out.println("String data türünde veri girin");
        String strData = scanner.nextLine();

        System.out.println("Boolean data türünde veri girin");
        boolean blData = scanner.nextBoolean();

        System.out.println("veri tipine göre girilen değerler şunlardır :");
        System.out.println( intData);
        System.out.println(strData);
        System.out.println(blData);

    }
}
