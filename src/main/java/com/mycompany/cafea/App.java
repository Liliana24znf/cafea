package com.mycompany.cafea;

public class App 
{
   

    public static void main( String[] args )
    {
        System.out.println("Constructorul fara parametrii");
        Cafea c1=new Cafea();
        System.out.println(c1);
        c1.preparare();
        c1.servire();
        c1.degustare();
        System.out.println("\n");
        
        System.out.println("Constructorul cu parametrii");
        Cafea c2=new Cafea("Nescafe, ", "mediu, ", "filtre, ", "medie, ", "medie, ", "maro, ", "espresso, ", "amedie, ", "medie, ", " spalare umeda.");
        System.out.println(c2);
        c2.preparare();
        c2.servire();
        c2.degustare();
        System.out.println("\n");
        
        System.out.println("Constructorul de copiere");
        Cafea c3=new Cafea(c2);
        System.out.println(c3);
        c3.preparare();
        c3.servire();
        c3.degustare();
        System.out.println( "\n" );
        /*  
        System.out.println("Constructorul fara parametrii");
        CafeaCapsule cc1=new CafeaCapsule();
        System.out.println(cc1);
        cc1.preparare();
        cc1.servire();
        cc1.degustare();
        System.out.println();


     
        CafeaCapsule cc2=new CafeaCapsule("Nescafe", "prajire medie", "metoda de extragere a cafelei", "intensitate medie", "densitate medie", "culoare maro", "preparare simpla", "aciditate medie", "corpolenta medie", "modul de procesare a cafelei", "nespreso", "da");
        System.out.println(cc2);
        cc2.preparare();
        cc2.servire();
        cc2.degustare();
        System.out.println();
        
        CafeaCapsule cc3=new CafeaCapsule(cc2);
        System.out.println(cc3);
        cc3.preparare();
        cc3.servire();
        cc3.degustare();
        System.out.println();
    }
    */
    }
}

