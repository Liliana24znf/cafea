package datagenerator;

import java.util.ArrayList;
import java.util.Random;

import com.mycompany.cafea.CafeaMacinata;

public class GeneratorCafeaMacinata {

    public static String brand="Nescafe"; 

    static private String[] tipuri = new String[]{"arabica","robusta","liberica"};

    // metoda statica, poate fi apelata fara a instantia clasa
	public static ArrayList<CafeaMacinata> genereazaRandomCafeaMacinata(int n){
        ArrayList<CafeaMacinata> listaCafeaMacinata = new ArrayList<CafeaMacinata>();
        CafeaMacinata unCafeaMacinata;
        for (int i=0;i<n;i++) {
            int tipulDeMacinare = new Random().nextInt(100);
            String tipulDeAparat = tipuri[new Random().nextInt(tipuri.length)];
            unCafeaMacinata=new CafeaMacinata(tipulDeMacinare,tipulDeAparat);
            listaCafeaMacinata.add(unCafeaMacinata);
        }
        return listaCafeaMacinata;
    }
    // metoda statica, poate fi apelata fara a instantia clasa
    public static CafeaMacinata[] genereazaNisteCafeaMacinata(int n) {
        CafeaMacinata[] listaCafeaMacinata= new CafeaMacinata[n];
        for (int i=0;i<n;i++) {
            int tipulDeMacinare = new Random().nextInt(100);
            String tipulDeAparat = tipuri[new Random().nextInt(tipuri.length)];
            CafeaMacinata unCafeaMacinata=new CafeaMacinata(tipulDeMacinare,tipulDeAparat);
            listaCafeaMacinata[i]=unCafeaMacinata;
        }
        return listaCafeaMacinata;
    }
    
}
