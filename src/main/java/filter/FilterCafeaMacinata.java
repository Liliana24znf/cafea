package Filter;
import java.util.ArrayList;

import cafea.CafeaMacinata;

public class FilterCafeaMacinata {

    public static ArrayList<CafeaMacinata> filtreazaDupatipulDeAparat(ArrayList<CafeaMacinata>listaInitalaCafeaMacinata, String tipulDeAparat) {
        ArrayList<CafeaMacinata> listaCafeaMacinata = new ArrayList<>();
        for(CafeaMacinata cafeaMacinata:listaInitalaCafeaMacinata)
            if (cafeaMacinata.getTipulDeAparat().equals(tipulDeAparat) )
                    listaCafeaMacinata.add(cafeaMacinata);        
        return listaCafeaMacinata;
    }

    public static ArrayList<CafeaMacinata> filtreazaDupatipulDeMacinare (ArrayList <CafeaMacinata> listaInitalaCafeaMacinata, String tipulDeMacinare) {
        ArrayList<CafeaMacinata> listaCafeaMacinata = new ArrayList<>();
        for(CafeaMacinata cafeaMacinata:listaInitalaCafeaMacinata)
            if (cafeaMacinata.getTipulDeMacinare().equals(tipulDeMacinare) )
                    listaCafeaMacinata.add(cafeaMacinata);        
        return listaCafeaMacinata;
    }

    public static ArrayList<CafeaMacinata> filtreazaDupatipulDeAparat(ArrayList<CafeaMacinata> listaCafeaMacinata,
            int parseInt) {
        return null;
    }

    public static ArrayList<CafeaMacinata> filtreazaDupatipulDeMacinare(ArrayList<CafeaMacinata> listaCafeaMacinata,
            int parseInt) {
        return null;
    }
    
}


