package day35_inhertance;

public class EMuhasebe extends DHastane{

    EMuhasebe(){
        System.out.println("Parametresiz Muhasebe constructor'i calisti");
    }
    EMuhasebe(String str){
        System.out.println("String Parametreli Muhasebe constructor'i calisti");
    }
    EMuhasebe(int a){
       // 2. ve 3. senaryo this.("Yusuf");
        System.out.println("int Parametreli Muhasebe constructor'i calisti");
    }

}
