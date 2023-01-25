package Filter;

import java.util.ArrayList;
import cafea.CafeaCapsule;


public class CafeaCapsuleFilter {
    
    public static ArrayList<CafeaCapsule>filtreazaDupaBrand(ArrayList<CafeaCapsule>listaInitialaCafeaCapsule,String brand)
    //lista de tip cafeacapsule si contine ca parametri lista initiala de cafeaCapsule si brandul dupa care se filtreaza
    {
        ArrayList<CafeaCapsule>listaCafeaCapsule= new ArrayList<>();
        for(CafeaCapsule cafeaCapsule: listaInitialaCafeaCapsule)
            if(cafeaCapsule.getBrand().equals(brand))
            listaCafeaCapsule.add(cafeaCapsule);
        return listaCafeaCapsule;
    }



public static ArrayList<CafeaCapsule>filtreazaDupaCofeina(ArrayList<CafeaCapsule>listaInitialaCafeaCapsule,String cofeina)
//lista de tip cafeacapsule si contie ca parametri lista initiala de cafeaCapsule si cofeina dupa care se filtreaza
{
    ArrayList<CafeaCapsule>listaCafeaCapsule= new ArrayList<>();
    for(CafeaCapsule cafeaCapsule: listaInitialaCafeaCapsule)
        if(cafeaCapsule.getCofeina().equals(cofeina))
        listaCafeaCapsule.add(cafeaCapsule);
    return listaCafeaCapsule;
}

}