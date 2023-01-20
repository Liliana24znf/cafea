package dataGenerator;

import java.util.ArrayList;
import java.util.Random;
import model.CafeaCapsule;

public class GeneratorCafeaCapsule {
    public static String tara="Romania";
    static private String[] branduri = new String[]{"Nescafe","Lavazza","Jacobs","Tchibo","Tassimo"};
    static private String[] nivelulDeprajire = new String[]{"scazut","mediu","mare"};
    static private String[] metodaDeextractie = new String[]{"umeda","uscata"};
    static private String[] intensitate = new String[]{"scazuta","mediu","mare"};
    static private String[] densitate = new String[]{"scazuta","mediu","mare"};
    static private String[] culoare = new String[]{"alb","negru","maro"};
    static private String[] preparare = new String[]{"manuala","automata"};
    static private String[] aciditate = new String[]{"scazuta","mediu","mare"};
    static private String[] corpolenta = new String[]{"scazuta","mediu","mare"};
    static private String[] modulDeProcesare = new String[]{"umeda","uscata"};
    static private String[] tipDeCapsula = new String[]{"nespreso","dolcegusto"};
    static private String[] cofeina = new String[]{"da","nu"}; 
    //metoda care genereaza date random si le adauga in lista de cafeaCapsule 

    public static ArrayList<CafeaCapsule> genereazaRandomCafeaCapsule(int n) 
    {
        ArrayList<CafeaCapsule>listaCafea = new ArrayList<>();
        CafeaCapsule oCafea ;
        for(int i=0;i<n;i++)
        {
            
          String brand = branduri[new Random().nextInt(branduri.length)];
            String nivelDePrajir = nivelulDeprajire[new Random().nextInt(nivelulDeprajire.length)];
            String metodaDeExtrager = metodaDeextractie[new Random().nextInt(metodaDeextractie.length)];
            String intensitat = intensitate[new Random().nextInt(intensitate.length)];
            String densitat = densitate[new Random().nextInt(densitate.length)];
            String culoar = culoare[new Random().nextInt(culoare.length)];
            String preparar = preparare[new Random().nextInt(preparare.length)];
            String aciditat = aciditate[new Random().nextInt(aciditate.length)];
            String corpolent = corpolenta[new Random().nextInt(corpolenta.length)];
            String modulDeProcesar = modulDeProcesare[new Random().nextInt(modulDeProcesare.length)];
            String tipDeCapsule = tipDeCapsula[new Random().nextInt(tipDeCapsula.length)];
            String cofe = cofeina[new Random().nextInt(cofeina.length)]; 
            //vectorul de stringuri cu care se genereaza datele random

            oCafea = new CafeaCapsule(brand,nivelDePrajir,metodaDeExtrager,intensitat,densitat,culoar,
             preparar,aciditat,corpolent,modulDeProcesar,tipDeCapsule,cofe);
            listaCafea.add(oCafea);
            
        }
        return listaCafea;
    }
public static CafeaCapsule[] genereazaNisteCafea(int n)
{
    CafeaCapsule[] listaCafea = new CafeaCapsule[n];
    for(int i=0;i<n;i++)
   {
    String brand = branduri[new Random().nextInt(branduri.length)];
            String nivelDePrajir = nivelulDeprajire[new Random().nextInt(nivelulDeprajire.length)];
            String metodaDeExtrager = metodaDeextractie[new Random().nextInt(metodaDeextractie.length)];
            String intensitat = intensitate[new Random().nextInt(intensitate.length)];
            String densitat = densitate[new Random().nextInt(densitate.length)];
            String culoar = culoare[new Random().nextInt(culoare.length)];
            String preparar = preparare[new Random().nextInt(preparare.length)];
            String aciditat = aciditate[new Random().nextInt(aciditate.length)];
            String corpolent = corpolenta[new Random().nextInt(corpolenta.length)];
            String modulDeProcesar = modulDeProcesare[new Random().nextInt(modulDeProcesare.length)];
            String tipDeCapsule = tipDeCapsula[new Random().nextInt(tipDeCapsula.length)];
            String cofe = cofeina[new Random().nextInt(cofeina.length)];

           CafeaCapsule oCafea = new CafeaCapsule(brand,nivelDePrajir,metodaDeExtrager,intensitat,densitat,culoar, 
             preparar,aciditat,corpolent,modulDeProcesar,tipDeCapsule,cofe);
            listaCafea[i]=oCafea;

   }
    return listaCafea;
}
//

}
