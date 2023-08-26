package day38_abstractClasses;

public abstract class D_Personel {

    public abstract void standartMaas();    // public void standartMaas(); yazdigimizda ya bady olustur ya da
                                            // metodu abstract yap diye kizartir. biz de 'abstract' yapariz.
    public abstract void mesai();           //public void mesai();
    public abstract void yillikIzin();      // public void yillikIzin();

    public void ozelSigorta(){
        System.out.println("tum personel katki payi ile ozel sigorta yaptirabilir");
    }



}