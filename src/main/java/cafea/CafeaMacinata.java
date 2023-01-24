package cafea;

public class CafeaMacinata extends Cafea {
    private String tipulDeMacinare; //tipul de macinare al cafelei (fin, mediu, gros) 
    private String tipulDeAparat; //tipul de aparat de preparat cafea (manual, automat)

    //constructor fara parametrii 
    public CafeaMacinata(int tipulDeMacinare2, String tipulDeAparat2){
        super(); //apelam constructorul fara parametrii din clasa parinte (Cafea) 
        tipulDeMacinare="necunoscut"; 
        tipulDeAparat="necunoscut"; 
    }

    //constructor cu parametrii 
    public CafeaMacinata(String tipulDeMacinare, String tipulDeAparat, String brand , String nivelulDeprajire, String metodaDeextractie, String intensitate, 
    String densitate, String culoare, String preparare, String aciditatea, String corpolenta, String modulDeprocesare 
    ){ 
         //apelam constructorul din clasa parinte (Cafea) cu parametrii pentru a initializa variabilele din 
         //clasa parinte (Cafea) cu valorile primite ca parametrii in constructorul din clasa copil (CafeaMacinata)   
        super(brand, nivelulDeprajire, metodaDeextractie, intensitate, densitate, culoare, preparare, aciditatea,  corpolenta, modulDeprocesare); 
        this.tipulDeMacinare=tipulDeMacinare;
        this.tipulDeAparat=tipulDeAparat; 
    }

    //constructor de copiere
    public CafeaMacinata(CafeaMacinata cm){ 
        super(cm); //apelam constructorul de copiere din clasa parinte (Cafea) pentru a copia valorile variabilelor 
        this.tipulDeMacinare=cm.tipulDeMacinare;
        this.tipulDeAparat=cm.tipulDeAparat; 
    } 

    public CafeaMacinata(String string, String tipulDeAparat2) {
    }

    //metode getteri si setteri pentru toate variabilele private
    public String getTipulDeMacinare(){
        return tipulDeMacinare;
    }

    public void setTipulDeMacinare(String tipulDeMacinare){
        this.tipulDeMacinare=tipulDeMacinare;
    }

    public String getTipulDeAparat(){
        return tipulDeAparat;
    }

    public void setTipulDeAparat(String tipulDeAparat){
        this.tipulDeAparat=tipulDeAparat;
    }

    //metoda abstracta pentru prepararea bauturii
    public void preparare(){
        System.out.println("Cafeaua se macina si se pune in aparatul de preparat cafea.");
    }

    //metoda abstracta pentru servirea bauturii
    public void servire(){
        System.out.println("Cafeaua se serveste in paharul cu lapte.");
    }

    //metoda abstracta pentru degustarea bauturii
    public void degustare(){
        System.out.println("Cafeaua se degusta in functie de gustul fiecaruia.");
    }


    //metoda toString pentru afisarea informatiilor despre cafea macinata
    @Override // suprascriem metoda toString din clasa parinte (Cafea)  
    public String toString(){
    return super.toString()+"\nTipul de macinare: "+tipulDeMacinare+" "+"Tipul de aparat: "+tipulDeAparat+" \n";
}

}