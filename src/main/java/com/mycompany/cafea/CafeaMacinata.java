package com.mycompany.cafea;

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
    public CafeaMacinata(String brand, String nivelulDeprajire, String metodaDeextractie, String intensitate, 
    String densitate, String culoare, String preparare, String aciditatea, String corpolenta, String modulDeprocesare, 
    String tipulDeMacinare, String tipulDeAparat){ 
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
    return super.toString()+"\nTipul de macinare: "+tipulDeMacinare+"\nTipul de aparat: "+tipulDeAparat;
}

    //exercitiul 4 două metode care să parcurgă vectorul și să afișeze instanțele care satisfac două condiții introduse de utilizator.
    // metoda pentru afisarea conditiei de macinare a cafelei si tipul de aparat de preparat cafea
    void afisareConditie(String tipDeMacinare, String tipDeAparat){ 
    //metoda cu parametri pentru a verifica daca tipul de macinare si tipul de aparat sunt corecte, 
    //iar daca sunt afisam informatiile despre cafea macinata, altfel afisam mesajul de eroare
        if(this.tipulDeMacinare.equals("fin") && this.tipulDeAparat.equals("manual")){ 
            //verificam daca tipul de macinare si tipul de aparat sunt corecte
            System.out.println("Conditie indeplinita pentru "+this.toString()); 
            //apelam metoda toString pentru a afisa informatiile despre cafea macinata
        }
        else{
            System.out.println("Conditie neindeplinita pentru "+this.toString()); 
        }
    }
    // metoda pentru afisarea conditiei de preparare a cafelei (capuccino)
    void afisareConditie2(String Preparare)
    { //metoda cu parametru pentru a verifica daca prepararea este capuccino, 
        //iar daca este, afisam informatiile despre cafea macinata, altfel afisam mesajul de eroare
        if(super.getPreparare().equals("capuccino")) 
        //apelam metoda getter din clasa parinte (Cafea) pentru a obtine valoarea variabilei preparare
        System.out.println("Conditie indeplinita pentru "+this.toString()); 
        //apelam metoda toString pentru a afisa informatiile despre cafea macinata
        else
        System.out.println("Conditie neindeplinita pentru "+this.toString());
    }
}