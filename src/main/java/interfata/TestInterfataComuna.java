package Interfata;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import Filter.CafeaCapsuleFilter;
import Filter.FilterCafeaMacinata;
import Generator.GeneratorCafeaCapsule;
import Generator.GeneratorCafeaMacinata;
import cafea.CafeaCapsule;
import cafea.CafeaMacinata;

import java.io.*;


public class TestInterfataComuna {
    public static ArrayList<CafeaMacinata> listaCafeaMacinata;
    public static ArrayList<CafeaMacinata> listaCafeaMacinataFiltrata;
    public static ArrayList<CafeaCapsule> listaCafeaCapsule;
    public static ArrayList<CafeaCapsule> listaCafeaCapsuleFiltrata; 

    TestInterfataComuna() {
        //Creaza un textarea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 24));
        // Seteaza pozitia si marimea textarea-ului
        textArea.setBounds(50, 250, 900, 500);

        //culoare fundal
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.decode("#00BFFF")); 
        frame.getContentPane().setForeground(Color.decode("#00BFFF")); //

        JLabel nr = new JLabel("Cafea macinata:"); // eticheta
		nr.setBounds(100, 20, 150, 20); // pozitia etichetei
		JTextField nrTF = new JTextField(); // campul de text
		nrTF.setBounds(250, 20, 100, 20); // pozitia campului de text
        nr.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        nr.setFont(new java.awt.Font("Tahoma", 1, 12)); // fontul textului etichetei 
		JButton genereazaBT = new JButton("Genereaza date"); // butonul
		genereazaBT.setBounds(100, 50, 300, 30); // pozitia butonului 
        genereazaBT.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        genereazaBT.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        genereazaBT.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        genereazaBT.addActionListener(new ActionListnerGenerareDate(nrTF){
            public void actionPerformed(ActionEvent e){
                listaCafeaMacinata = GeneratorCafeaMacinata.genereazaRandomCafeaMacinata(Integer.parseInt(nrTF.getText()));
                textArea.setText(" " + listaCafeaMacinata);
            } 
        });
      
        JLabel tipulDeMacinare = new JLabel("Tipul de macinare:"); // eticheta
        tipulDeMacinare.setBounds(100, 100, 130, 20); // pozitia etichetei
        JTextField tipulDeMacinareTF = new JTextField(); // campul de text
        tipulDeMacinareTF.setBounds(250, 100, 100, 20); // pozitia campului de text
        JButton tipulDeMacinareBT = new JButton("Filtreaza dupa tipul de macinare "); // butonul
        tipulDeMacinareBT.setBounds(100, 130, 300, 30); // pozitia butonului
        tipulDeMacinare.setForeground(new java.awt.Color(0, 0, 255));   // culoarea textului etichetei
        tipulDeMacinare.setFont(new java.awt.Font("Tahoma", 1, 12));    // fontul textului etichetei
        tipulDeMacinareBT.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        tipulDeMacinareBT.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        tipulDeMacinareBT.setFont(new java.awt.Font("Tahoma", 1, 15));  // fontul textului butonului
        tipulDeMacinareBT.addActionListener(new ActionListnerGenerareDate(tipulDeMacinareTF){
            public void actionPerformed(ActionEvent e){
                ArrayList<CafeaMacinata> listaCafeaMacinataFiltrata = new ArrayList<CafeaMacinata>();
                listaCafeaMacinataFiltrata = FilterCafeaMacinata.filtreazaDupatipulDeMacinare(listaCafeaMacinata, tipulDeMacinareTF.getText());
                textArea.setText(" " + listaCafeaMacinataFiltrata);
            } 
        });
  
        
        JLabel tipulDeAparat = new JLabel("Tipul de aparat:");  // eticheta
        tipulDeAparat.setBounds(100, 180, 100, 20);  // pozitia etichetei
        JTextField tipulDeAparatTF = new JTextField();  // campul de text
        tipulDeAparatTF.setBounds(250, 180, 100, 20); // pozitia campului de text
        JButton tipulDeAparatBT = new JButton("Filtreaza dupa tipul de aparat "); // butonul
        tipulDeAparatBT.setBounds(100, 210, 300, 30);    // pozitia butonului
        tipulDeAparat.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        tipulDeAparat.setFont(new java.awt.Font("Tahoma", 1, 12));  // fontul textului etichetei
        tipulDeAparatBT.setBackground(new java.awt.Color(0, 255, 0));   // culoarea butonului
        tipulDeAparatBT.setForeground(new java.awt.Color(0, 0, 255));   // culoarea textului butonului
        tipulDeAparatBT.setFont(new java.awt.Font("Tahoma", 1, 15));    // fontul textului butonului
        tipulDeAparatBT.addActionListener(new ActionListnerGenerareDate(tipulDeAparatTF){
            public void actionPerformed(ActionEvent e){
                ArrayList<CafeaMacinata> listaCafeaMacinataFiltrata = new ArrayList<CafeaMacinata>();
                listaCafeaMacinataFiltrata = FilterCafeaMacinata.filtreazaDupatipulDeMacinare(listaCafeaMacinata, tipulDeMacinareTF.getText());
                ArrayList<CafeaMacinata> listaCafeaMacinataFiltrata2 = new ArrayList<CafeaMacinata>();
                listaCafeaMacinataFiltrata2 = FilterCafeaMacinata.filtreazaDupatipulDeAparat(listaCafeaMacinataFiltrata, tipulDeAparatTF.getText());
                textArea.setText(" " + listaCafeaMacinataFiltrata2);
            }
            
        });
        

        
        JLabel nr2 = new JLabel("Cafea capsule:"); // eticheta
        nr2.setBounds(600, 20, 150, 20); // pozitia etichetei
        JTextField nrTF2 = new JTextField(); // campul de text
        nrTF2.setBounds(700, 20, 100, 20); // pozitia campului de text
        nr2.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        nr2.setFont(new java.awt.Font("Tahoma", 1, 12)); // fontul textului etichetei
        JButton genereazaBT2 = new JButton("Genereaza date"); // butonul
        genereazaBT2.setBounds(600, 50, 300, 30); // pozitia butonului
        genereazaBT2.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        genereazaBT2.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        genereazaBT2.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        genereazaBT2.addActionListener(new ActionListnerGenerareDateCafeaCapsule(nrTF2){
            public void actionPerformed(ActionEvent e){
                listaCafeaCapsule = GeneratorCafeaCapsule.genereazaRandomCafeaCapsule(Integer.parseInt(nrTF2.getText()));
                textArea.setText(" " + listaCafeaCapsule);
            }
        }); 
        


        //brandul din cafea capsule
        JLabel brandul = new JLabel("Brandul:"); // eticheta
        brandul.setBounds(600, 100, 100, 20); // pozitia etichetei
        JTextField brandulTF = new JTextField(); // campul de text
        brandulTF.setBounds(700, 100, 100, 20); // pozitia campului de text
        JButton brandulBT = new JButton("Filtreaza dupa brandul "); // butonul
        brandulBT.setBounds(600, 130, 300, 30); // pozitia butonului
        brandul.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        brandul.setFont(new java.awt.Font("Tahoma", 1, 12)); // fontul textului etichetei
        brandulBT.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        brandulBT.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        brandulBT.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        brandulBT.addActionListener(new ActionListenerFiltrareCafeaCapsule(brandulTF){
            public void actionPerformed(ActionEvent e){
                ArrayList<CafeaCapsule> listaCafeaCapsuleFiltrata = new ArrayList<CafeaCapsule>();
                listaCafeaCapsuleFiltrata = CafeaCapsuleFilter.filtreazaDupaBrand(listaCafeaCapsule, brandulTF.getText());
                textArea.setText(" " + listaCafeaCapsuleFiltrata);
            }
        });


       

        //cofeina
        JLabel cofeina = new JLabel("Cofeina:"); // eticheta
        cofeina.setBounds(600, 180, 100, 20); // pozitia etichetei
        JTextField cofeinaTF = new JTextField(); // campul de text
        cofeinaTF.setBounds(700, 180, 100, 20); // pozitia campului de text
        JButton cofeinaBT = new JButton("Filtreaza dupa cofeina "); // butonul
        cofeinaBT.setBounds(600, 210, 300, 30); // pozitia butonului
        cofeina.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        cofeina.setFont(new java.awt.Font("Tahoma", 1, 12)); // fontul textului etichetei
        cofeinaBT.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        cofeinaBT.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        cofeinaBT.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        cofeinaBT.addActionListener(new ActionListenerFiltrareCafeaCapsule2(cofeinaTF){
            public void actionPerformed(ActionEvent e){
                ArrayList<CafeaCapsule> listaCafeaCapsuleFiltrata = new ArrayList<CafeaCapsule>();
                listaCafeaCapsuleFiltrata = CafeaCapsuleFilter.filtreazaDupaBrand(listaCafeaCapsule, brandulTF.getText());
                textArea.setText(" " + listaCafeaCapsuleFiltrata);
                System.out.println("Mesajul1 " + listaCafeaCapsuleFiltrata);
                ArrayList<CafeaCapsule> listaCafeaCapsuleFiltrata2 = new ArrayList<CafeaCapsule>();
                listaCafeaCapsuleFiltrata2 = CafeaCapsuleFilter.filtreazaDupaCofeina(listaCafeaCapsuleFiltrata, cofeinaTF.getText());
                textArea.setText(" " + listaCafeaCapsuleFiltrata2);
                System.out.println("Mesajul2 " + listaCafeaCapsuleFiltrata2);

            }
        }); 
       

        //Butoane	
        JButton saveButton = new JButton("Salvare ListaGenerata");
        saveButton.setBounds(130,800,250,30);
        saveButton.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        saveButton.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        saveButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        JButton saveButton2 = new JButton("Salvare ListaFiltrata");
        saveButton2.setBounds(130,850,250,30);
        saveButton2.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        saveButton2.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        saveButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        JButton clearButton2 = new JButton("Golire ListaFiltrataGenerata.txt");
        clearButton2.setBounds(500,800,350,30);
        clearButton2.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        clearButton2.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        clearButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        JButton clearButton = new JButton("Golire ListaGenerata.txt");
        clearButton.setBounds(500,850,350,30);
        clearButton.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        clearButton.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului

        

        // Adauga un listener pentru buton
        saveButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        // Creeaza un obiect File pentru fisierul in care se va salva textul
        File file = new File("ListaGenerata.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            // Scrie continutul campului de text in fisier
            writer.write(textArea.getText());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        } 
        });

        // Adauga un listener pentru buton
        saveButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        // Creeaza un obiect File pentru fisierul in care se va salva textul
        File file = new File("ListaGenerata.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
             // Scrie continutul campului de text in fisier
             writer.write(textArea.getText());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });
    
    // Adauga un listener pentru buton
    clearButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Creeaza un obiect File pentru fisierul care se va sterge
            File file = new File("ListaGenerata.txt");
            try (PrintWriter writer = new PrintWriter(file)) {
                // Goleste continutul fisierului
                writer.print("");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    });
    
    clearButton2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Creeaza un obiect File pentru fisierul care se va sterge
            File file = new File("ListaFiltrataGenerata.txt");
            try (PrintWriter writer = new PrintWriter(file)) {
                // Goleste continutul fisierului
                writer.print("");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    });

    // Adauga butoanele in fereastra
    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.setText(" ");
    }
});
    btnClear.setBounds(100,750,800,40);
    btnClear.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
    btnClear.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
    btnClear.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
    

        frame.add(nr); 
        frame.add(nrTF);
        frame.add(genereazaBT);

        frame.add(tipulDeMacinare);
        frame.add(tipulDeMacinareTF);
        frame.add(tipulDeMacinareBT);
      

        frame.add(tipulDeAparat);
        frame.add(tipulDeAparatTF);
        frame.add(tipulDeAparatBT);


        frame.add(nr2);
        frame.add(nrTF2);
        frame.add(genereazaBT2);

        frame.add(brandul);
        frame.add(brandulTF);
        frame.add(brandulBT);

        frame.add(cofeina);
        frame.add(cofeinaTF);
        frame.add(cofeinaBT);

    
        frame.add(clearButton2); //golire lista filtrata
        frame.add(saveButton2); //salvare lista filtrata
        frame.add(clearButton); //golire lista generata
        frame.add(genereazaBT); //genereaza lista generata

        frame.add(textArea);    
        frame.add(btnClear);
        frame.add(saveButton);
        frame.setSize(1000, 1000);
        frame.setTitle("Interfata Grafica");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    public static void main(String[] args) {
        TestInterfataComuna test = new TestInterfataComuna();
    }


}
