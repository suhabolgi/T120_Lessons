package day35_inhertance;

public class FDoktor extends EMuhasebe {


    FDoktor(){
       // 2. senaryo super(3);
    System.out.println("Parametresiz Doktor constructor'i calisti");
}
    FDoktor(String str){

        System.out.println("String Parametreli Doktor constructor'i calisti");
    }
    FDoktor(int sayi){
       // 3. senaryo this.()

        System.out.println("Int Parametreli Doktor constructor'i calisti");
    }
    public static void main(String[] args) {

        FDoktor doktor1 = new FDoktor("Java");
       //2. senaryo   FDoktor doktor2 = new FDoktor();
       //   3. senaryo FDoktor doktor3 = new FDoktor(5);

    }

}
