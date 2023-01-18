package datagenerator;

import java.util.ArrayList;
import java.util.Random;

import com.mycompany.cafea.CafeaMacinata;


public class GeneratorCafeaMacinata {
    private static String[] brand = {"Nescafe","Jacobs","Lavazza","Tchibo","Nespresso"};
    private static String[] nivelulDeprajire = {"intens", "mediu", "usor"};
    private static String[] metodaDeextractie = {"filtre", "presiune", "solubil"};
    private static String[] intensitate = {"slaba", "mediu", "puternica"};
    private static String[] densitate = {"slaba", "mediu", "puternica"};
    private static String[] culoare = {"slaba", "mediu", "puternica"};
    private static String[] preparare = {"cappuccino", "espresso", "lungo"};
    private static String[] aciditate = {"scazuta","mediu","crescuta"};
    private static String[] corpolent= {"medie", "densa", "solida"};
    private static String[] modulDeprocesare = {"spalare umeda", "semispalare", "amandoua"};
    private static String[] tipuriDeMacinare = {"fin", "mediu", "gros"}; 
    private static String[] tipuriDeAparat = {"manual","automat"};



    public static ArrayList<CafeaMacinata> genereazaRandomCafeaMacinata(int n){
        ArrayList<CafeaMacinata> listaCafeaMacinata = new ArrayList<CafeaMacinata>();
        CafeaMacinata oCafeaMacinata;
        for (int i=0; i<n; i++){
            String brandul = brand[new Random().nextInt(brand.length)];
            String nivelulDeprajirii = nivelulDeprajire[new Random().nextInt(nivelulDeprajire.length)];
            String metodaDeextractiei = metodaDeextractie[new Random().nextInt(metodaDeextractie.length)];
            String intensitatea = intensitate[new Random().nextInt(intensitate.length)];
            String densitatea = densitate[new Random().nextInt(densitate.length)];
            String culoarea = culoare[new Random().nextInt(culoare.length)];
            String prepararea = preparare[new Random().nextInt(preparare.length)];
            String aciditatea = aciditate[new Random().nextInt(aciditate.length)];
            String corpolenta = corpolent[new Random().nextInt(corpolent.length)];
            String modulDeprocesarii = modulDeprocesare[new Random().nextInt(modulDeprocesare.length)];
            String tipulDeMacinare = tipuriDeMacinare[new Random().nextInt(tipuriDeMacinare.length)];
            String tipulDeAparat = tipuriDeAparat[new Random().nextInt(tipuriDeAparat.length)];
            oCafeaMacinata = new CafeaMacinata( tipulDeMacinare , tipulDeAparat , brandul ,  nivelulDeprajirii ,  metodaDeextractiei , intensitatea , densitatea , culoarea ,  prepararea , aciditatea , corpolenta , modulDeprocesarii );
            listaCafeaMacinata.add(oCafeaMacinata);
        }
        return listaCafeaMacinata;

    }

    public static CafeaMacinata[] genereazaNisteCafeaMacinata(int n){
        CafeaMacinata[] listaCafeaMacinata = new CafeaMacinata[n];
        for (int i=0; i<n; i++){
            String brandul = brand[new Random().nextInt(brand.length)];
            String nivelulDeprajirii = nivelulDeprajire[new Random().nextInt(nivelulDeprajire.length)];
            String metodaDeextractiei = metodaDeextractie[new Random().nextInt(metodaDeextractie.length)];
            String intensitatea = intensitate[new Random().nextInt(intensitate.length)];
            String densitatea = densitate[new Random().nextInt(densitate.length)];
            String culoarea = culoare[new Random().nextInt(culoare.length)];
            String prepararea = preparare[new Random().nextInt(preparare.length)];
            String aciditatea = aciditate[new Random().nextInt(aciditate.length)];
            String corpolenta = corpolent[new Random().nextInt(corpolent.length)];
            String modulDeprocesarii = modulDeprocesare[new Random().nextInt(modulDeprocesare.length)];
            String tipulDeMacinare = tipuriDeMacinare[new Random().nextInt(tipuriDeMacinare.length)];
            String tipulDeAparat = tipuriDeAparat[new Random().nextInt(tipuriDeAparat.length)];
            CafeaMacinata oCafeaMacinata = new CafeaMacinata(brandul, nivelulDeprajirii, metodaDeextractiei, intensitatea,
             densitatea, culoarea, prepararea, aciditatea, corpolenta, modulDeprocesarii, tipulDeMacinare, tipulDeAparat);
            listaCafeaMacinata[i] = oCafeaMacinata;
        }
        return listaCafeaMacinata;
    }


}
 