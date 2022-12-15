package com.mycompany.cafea;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


//exercitiul 3 si 4

public class MainCafea {
    public static void Writer(ArrayList<String> lista){ // scrie in fisier text lista de cafele macinate
        
     try {
            FileWriter myWriter = new FileWriter("Instante.txt"); //fisierul in care se scrie lista de cafele macinate 
            myWriter.write(lista.toString()); //scriem in fisier lista de cafele macinate
            myWriter.close(); //inchidem fisierul
            System.out.println("Scris in fisier."); //afisam mesajul ca s-a scris in fisier
        } catch (IOException e) { //daca apare o eroare
            System.out.println("Eroare"); //afisam mesajul de eroare
            e.printStackTrace(); //afisam eroarea
        } 
    }

        public static void main(String[] args)
        {
                System.out.println("Zanfir Liliana Petruta"); //afisam numele
                CafeaMacinata cafeamacinata []= new CafeaMacinata[10]; //cream un vector de 10 elemente de tip CafeaMacinata
                cafeamacinata[0]=new CafeaMacinata(); //cream un obiect de tip CafeaMacinata cu constructorul implicit 
                cafeamacinata[1]=new CafeaMacinata("Nescafe", "intens", "filtre", 
                "slaba", "slaba", "medie", "cappucino", "scazuta", 
                "medie", "spalare umeda", "fin", 
                "manual"); //cream un obiect de tip CafeaMacinata cu constructorul cu parametri
                cafeamacinata[2]=new CafeaMacinata("Nesspreso", "gros", "manual", 
                "slaba", "densa", "maro", "prajire", "acida", 
                "corpolenta", "modulDeprocesare",
                 "tipulDeMacinare", "tipulDeAparat");
                cafeamacinata[3]=new CafeaMacinata(cafeamacinata[2]); //constructorul de copiere pozitia 2
                cafeamacinata[4]=new CafeaMacinata(cafeamacinata[3]); // constructorul de copiere pozitia 3
                cafeamacinata[5]=new CafeaMacinata(cafeamacinata[1]); //constructorul de copierepozitia 1
                cafeamacinata[6]=new CafeaMacinata("Starbucks", "fin", "manual", "fort", "densa",
                 "maro", "prajire", "acida", "corpolenta",
                "modulDeprocesare", "tipulDeMacinare", "tipulDeAparat"); //constructorul cu parametri
                cafeamacinata[7]=new CafeaMacinata(cafeamacinata[6]); //constructorul de copiere pozitia 6
                cafeamacinata[8]=new CafeaMacinata(cafeamacinata[7]); //constructorul de copiere pozitia 7
                cafeamacinata[8].setTipulDeMacinare("automat"); //setam tipul de macinare
                cafeamacinata[8].setTipulDeAparat("Capuccino"); //setam tipul de aparat
                cafeamacinata[9]=new CafeaMacinata(cafeamacinata[8]); //constructorul de copiere pozitia 8 
                cafeamacinata[9].setTipulDeAparat("Espresso"); //setam tipul de aparat
                cafeamacinata[9].setTipulDeMacinare("manual"); //setam tipul de macinare
            

                ArrayList<CafeaMacinata> cafeamacinata2= new ArrayList<CafeaMacinata>(); //cream o lista de tip CafeaMacinata 
                cafeamacinata2.add(cafeamacinata[0]);
                cafeamacinata2.add(cafeamacinata[1]); 
                cafeamacinata2.add(cafeamacinata[2]); 
                cafeamacinata2.add(cafeamacinata[3]);
                cafeamacinata2.add(cafeamacinata[4]);
                cafeamacinata2.add(cafeamacinata[5]);
                cafeamacinata2.add(cafeamacinata[6]);
                cafeamacinata2.add(cafeamacinata[7]);
                cafeamacinata2.add(cafeamacinata[8]);
                cafeamacinata2.add(cafeamacinata[9]);
                
               
                Scanner sc = new Scanner(System.in); //citim de la tastatura 
                System.out.println("Introduceti tipul de macinare: "); //afisam mesajul de introducere a tipului de macinare 
                sc.nextLine(); //citim de la tastatura
                System.out.println("Introduceti tipul de aparat: "); //afisam mesajul de introducere a tipului de aparat
                sc.nextLine(); //citim de la tastatura
                System.out.println("Introduceti tipul de preparare: "); //afisam mesajul de introducere a tipului de preparare
                sc.nextLine(); //citim de la tastatura
                sc.close(); //inchidem scannerul

                for(CafeaMacinata i: cafeamacinata2){ //parcurgem lista de cafele macinate
                    i.afisareConditie( "fin", "manual"); //afisam cafelele macinate cu tipul de macinare si tipul de aparat introduse de la tastatura
                    i.afisareConditie2 ("capuccino"); //afisam cafelele macinate cu tipul de preparare introdus de la tastatura
                }    
            } 
            
        }
     