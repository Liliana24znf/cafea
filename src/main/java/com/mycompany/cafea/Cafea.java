package com.mycompany.cafea;

public class Cafea {
    // declararea variabilelor, campuri comune, date membre private  
    private String brand; //brandul cafelei 
    private String nivelulDeprajire; //nivelul de prajire al cafelei (intens, mediu, usor)
    private String metodaDeextractie; //metoda de extractie a cafelei (filtre, presiune, solubil)
    private String intensitate; //intensitatea cafelei (slaba, medie, puternica)
    private String densitate; //densitatea cafelei (slaba, medie, puternica)
    private String culoare; //culoarea cafelei (slaba, medie, puternica) 
    private String preparare; //prepararea cafelei (cappucino, espresso, latte, americano, ristretto, lungo, macchiato)
    private String aciditatea; //aciditatea cafelei (scazuta, medie, crescuta)
    private String corpolenta; //corpolenta cafelei (medie, densa, solida)
    private String modulDeprocesare; //modul de procesare al cafelei (spalare umeda, semispalare, amandoua)

    //constructor fara parametrii 
    public Cafea(){
        brand="necunoscut";
        nivelulDeprajire="necunoscut";
        metodaDeextractie="necunoscut";
        intensitate="necunoscut";
        densitate="necunoscut";
        culoare="necunoscut";
        preparare="necunoscut";
        aciditatea="necunoscut";
        corpolenta="necunoscut";
        modulDeprocesare="necunoscut";
    }

    //constructor cu parametrii
    public Cafea(String brand, String nivelulDeprajire, String metodaDeextractie, String intensitate, String densitate, String culoare, String preparare, String aciditatea, String corpolenta, String modulDeprocesare){
        this.brand=brand;
        this.nivelulDeprajire=nivelulDeprajire;
        this.metodaDeextractie=metodaDeextractie;
        this.intensitate=intensitate;
        this.densitate=densitate;
        this.culoare=culoare;
        this.preparare=preparare;
        this.aciditatea=aciditatea;
        this.corpolenta=corpolenta;
        this.modulDeprocesare=modulDeprocesare;
    }

    //constructor de copiere
     Cafea(Cafea c){
        this.brand=c.brand;
        this.nivelulDeprajire=c.nivelulDeprajire;
        this.metodaDeextractie=c.metodaDeextractie;
        this.intensitate=c.intensitate;
        this.densitate=c.densitate;
        this.culoare=c.culoare;
        this.preparare=c.preparare;
        this.aciditatea=c.aciditatea;
        this.corpolenta=c.corpolenta;
        this.modulDeprocesare=c.modulDeprocesare;
    }

    //metode getteri si setteri pentru toate variabilele private 
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getNivelulDeprajire(){
        return nivelulDeprajire;
    }

    public void setNivelulDeprajire(String nivelulDeprajire){
        this.nivelulDeprajire=nivelulDeprajire;
    }

    public String getMetodaDeextractie(){
        return metodaDeextractie;
    }

    public void setMetodaDeextractie(String metodaDeextractie){
        this.metodaDeextractie=metodaDeextractie;
    }

    public String getIntensitate(){
        return intensitate;
    }

    public void setIntensitate(String intensitate){
        this.intensitate=intensitate;
    }

    public String getDensitate(){
        return densitate;
    }

    public void setDensitate(String densitate){
        this.densitate=densitate;
    }

    public String getCuloare(){
        return culoare;
    }

    public void setCuloare(String culoare){
        this.culoare=culoare;
    }

    public String getPreparare(){
        return preparare;
    }

    public void setPreparare(String preparare){
        this.preparare=preparare;
    }

    public String getAciditatea(){
        return aciditatea;
    }

    public void setAciditatea(String aciditatea){
        this.aciditatea=aciditatea;
    }

    public String getCorpolenta(){
        return corpolenta;
    }

    public void setCorpolenta(String corpolenta){
        this.corpolenta=corpolenta;
    }

    public String getModulDeprocesare(){
        return modulDeprocesare;
    }

    public void setModulDeprocesare(String modulDeprocesare){
        this.modulDeprocesare=modulDeprocesare;
    }

    //metoda toString
    public String toString(){
        return "Brandul cafelei este: "+brand+"Nivelul de prajire al cafelei este: "+nivelulDeprajire+" "
                + "Metoda de extractie a cafelei este: "+metodaDeextractie+"Intensitatea cafelei este: "+intensitate+" "
                + "Densitatea cafelei este: "+densitate+"Culoarea cafelei este: "+culoare+"Prepararea cafelei este: "+preparare+" "
                + "Aciditatea cafelei este: "+aciditatea+"Corpolenta cafelei este: "+corpolenta+"Modul de procesare al cafelei este: "+modulDeprocesare;
    }

    //metodele interfetei Bauturi 
    public void preparare(){
        System.out.println("Cafeaua se prepara prin metoda de extractie: ");
    }

    public void servire(){
        System.out.println("Cafeaua se serveste in pahare de cafea");
    }

    public void degustare(){
        System.out.println("Cafeaua se degusta in functie de brand, nivelul de prajire, metoda de extractie,  "
                + "intensitate, densitate, culoare, preparare, aciditate, corpolenta si modul de procesare");
    }
}