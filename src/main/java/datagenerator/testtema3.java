package datagenerator;
import java.util.ArrayList;

import com.mycompany.cafea.CafeaMacinata;


public class testtema3 {
    public static void main(String[] args) {
    ArrayList<CafeaMacinata> cafeamacinata= new ArrayList<CafeaMacinata>();
    cafeamacinata.add(new CafeaMacinata(1,"arabica"));
    cafeamacinata.add(new CafeaMacinata(2,"robusta"));
    cafeamacinata.add(new CafeaMacinata(3,"liberica"));
    cafeamacinata.add(new CafeaMacinata(4,"arabica"));
    cafeamacinata.add(new CafeaMacinata(5,"robusta"));
    cafeamacinata.add(new CafeaMacinata(6,"liberica"));
    System.out.println(cafeamacinata);

    CafeaMacinata uCafeaMacinata = cafeamacinata.get(0);
    System.out.println(uCafeaMacinata);

    for(int i=0;i<cafeamacinata.size();i++) {
        System.out.println(cafeamacinata.get(i));
    }

    System.out.println(" parcuregere cu for each");
    for(CafeaMacinata unCafeaMacinata:cafeamacinata) {
        System.out.println(unCafeaMacinata);
    }

    ArrayList<Object> listaGenericaDeObiecte = new ArrayList<Object>();
    listaGenericaDeObiecte.add(new CafeaMacinata(1,"arabica"));
    listaGenericaDeObiecte.add(new CafeaMacinata(2,"robusta"));
    listaGenericaDeObiecte.add(new CafeaMacinata(3,"liberica"));

    // este nevoie de cast la tipul de obiect din lista pentru a putea folosi metodele specifice
    CafeaMacinata altCafeaMacinata = (CafeaMacinata) listaGenericaDeObiecte.get(0);
    System.out.println(altCafeaMacinata);

    ArrayList<CafeaMacinata> listaCafeaMacinata = GeneratorCafeaMacinata.genereazaRandomCafeaMacinata(10);
    System.out.println("lista de cafea macinata:");
    System.out.println(listaCafeaMacinata);

    System.out.println("folosim for each pe lista");
    for(CafeaMacinata unCafeaMacinata:listaCafeaMacinata) {
        System.out.println(unCafeaMacinata);

    }
    System.out.println("folosim for old style pe lista");
    for(int i=0;i<listaCafeaMacinata.size();i++) {
        System.out.println(listaCafeaMacinata.get(i));
    }

    CafeaMacinata[] vectorDeCafeaMacinata= GeneratorCafeaMacinata.genereazaNisteCafeaMacinata(10);
    System.out.println("vector de cafea macinata:");
    System.out.println(vectorDeCafeaMacinata);

    System.out.println("folosim for each pe vector");
    for(CafeaMacinata unCafeaMacinata:vectorDeCafeaMacinata) {
        System.out.println(unCafeaMacinata);
    }
    System.out.println("folosim for old style pe vector");
    for(int i=0;i<vectorDeCafeaMacinata.length;i++) {
        System.out.println(vectorDeCafeaMacinata[i]);
    }
    }
}
