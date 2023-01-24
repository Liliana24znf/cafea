package cafea;

public class CafeaCapsule extends Cafea{
   
    private String tipulDeCapsule; //tipul de capsule de cafea (nespreso, espresso, lungo, ristretto, cappuccino, latte, etc.)
    private String cofeina; //  cafeina (da, nu)

    //constructor fara parametrii
    public CafeaCapsule(){
        super();
        tipulDeCapsule="necunoscut";
        cofeina="necunoscut";
    }

    //constructor cu parametrii
    public CafeaCapsule(String brand, String nivelulDeprajire, String metodaDeextractie,
     String intensitate, String densitate, String culoare, String preparare, String aciditatea,
      String corpolenta, String modulDeprocesare, String tipulDeCapsule, String cofeina)
      {
        super(brand, nivelulDeprajire, metodaDeextractie, intensitate, densitate, culoare, preparare, aciditatea, corpolenta, modulDeprocesare);
        this.tipulDeCapsule=tipulDeCapsule;
        this.cofeina=cofeina;
    }

    //constructor de copiere
    public CafeaCapsule(CafeaCapsule c){
        super(c);
        this.tipulDeCapsule=c.tipulDeCapsule;
        this.cofeina=c.cofeina;
    }

    //metode getteri si setteri pentru toate variabilele private
    public String getTipulDeCapsule(){
        return tipulDeCapsule;
    }

    public void setTipulDeCapsule(String tipulDeCapsule){
        this.tipulDeCapsule=tipulDeCapsule;
    }

    public String getCofeina(){
        return cofeina;
    }

    public void setCofeina(String cofeina){
        this.cofeina=cofeina;
    }

    //metoda abstracta pentru prepararea bauturii
    @Override
    public void preparare(){
        System.out.println("Se pun capsulele de cafea in aparatul de cafea si se apasa butonul de preparare.");
    }
    
    //metoda abstracta pentru servirea bauturii
    @Override
    public void servire(){
        System.out.println("Se serveste cafeaua din aparatul de cafea.");
    }

    //metoda abstracta pentru degustarea bauturii
    @Override
    public void degustare(){
        System.out.println("Se degusta cafeaua din aparatul de cafea.");
    }

    //metoda toString
    @Override
    public String toString(){
        return "CafeaCapsule{" + "brand=" + getBrand() + ", nivelulDeprajire=" + getNivelulDeprajire() + " "
                + ", metodaDeextractie=" + getMetodaDeextractie() + ", intensitate=" + getIntensitate() + ", "
                + "densitate=" + getDensitate() + ", culoare=" + getCuloare() + ", preparare=" + getPreparare() + ", "
                + "aciditatea=" + getAciditatea() + ", corpolenta=" + getCorpolenta() + ", modulDeprocesare=" + 
                getModulDeprocesare() + ", tipulDeCapsule=" + tipulDeCapsule + ", cofeina=" + cofeina + "\n";
        
    }
}

