package Interfata;
import java.util.ArrayList;
import javax.swing.*;
import cafea.CafeaMacinata;

public class TestInterfata {

    public static ArrayList<CafeaMacinata> listaCafeaMacinata;
    public static ArrayList<CafeaMacinata> listaCafeaMacinataFiltrata;

    TestInterfata(){
        JFrame frame = new JFrame();
        //culoarea interfetei  - galbena 
        frame.getContentPane().setBackground(new java.awt.Color(255, 255, 0));

   
		JLabel nr = new JLabel("Cafea macinata:"); // eticheta
		nr.setBounds(20, 20, 150, 20); // pozitia etichetei
		JTextField nrTF = new JTextField(); // campul de text
		nrTF.setBounds(120, 20, 100, 20); // pozitia campului de text
        nr.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        nr.setFont(new java.awt.Font("Tahoma", 1, 12)); // fontul textului etichetei 
		JButton genereazaBT = new JButton("Genereaza date"); // butonul
		genereazaBT.setBounds(20, 50, 300, 30); // pozitia butonului 
		genereazaBT.addActionListener(new ActionListnerGenerareDate(nrTF)); // adaugarea actiunii butonului
        genereazaBT.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        genereazaBT.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        genereazaBT.setFont(new java.awt.Font("Tahoma", 1, 15)); // fontul textului butonului
        


        JLabel tipulDeMacinare = new JLabel("Tipul de macinare:"); // eticheta
        tipulDeMacinare.setBounds(20, 100, 130, 20); // pozitia etichetei
        JTextField tipulDeMacinareTF = new JTextField(); // campul de text
        tipulDeMacinareTF.setBounds(140, 100, 100, 20); // pozitia campului de text
        JButton tipulDeMacinareBT = new JButton("Filtreaza dupa tipul de macinare "); // butonul
        tipulDeMacinareBT.setBounds(20, 130, 300, 30); // pozitia butonului
        tipulDeMacinareBT.addActionListener(new ActionListnerGenerareDate(tipulDeMacinareTF)); // adaugarea actiunii butonului  
        tipulDeMacinare.setForeground(new java.awt.Color(0, 0, 255));   // culoarea textului etichetei
        tipulDeMacinare.setFont(new java.awt.Font("Tahoma", 1, 12));    // fontul textului etichetei
        tipulDeMacinareBT.setBackground(new java.awt.Color(0, 255, 0)); // culoarea butonului
        tipulDeMacinareBT.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului butonului
        tipulDeMacinareBT.setFont(new java.awt.Font("Tahoma", 1, 15));  // fontul textului butonului



        JLabel tipulDeAparat = new JLabel("Tipul de aparat:");  // eticheta
        tipulDeAparat.setBounds(20, 180, 100, 20);  // pozitia etichetei
        JTextField tipulDeAparatTF = new JTextField();  // campul de text
        tipulDeAparatTF.setBounds(120, 180, 100, 20); // pozitia campului de text
        JButton tipulDeAparatBT = new JButton("Filtreaza dupa tipul de aparat "); // butonul
        tipulDeAparatBT.setBounds(20, 210, 300, 30);    // pozitia butonului
        tipulDeAparatBT.addActionListener(new ActionListnerGenerareDate(tipulDeAparatTF));  // adaugarea actiunii butonului
        tipulDeAparat.setForeground(new java.awt.Color(0, 0, 255)); // culoarea textului etichetei
        tipulDeAparat.setFont(new java.awt.Font("Tahoma", 1, 12));  // fontul textului etichetei
        tipulDeAparatBT.setBackground(new java.awt.Color(0, 255, 0));   // culoarea butonului
        tipulDeAparatBT.setForeground(new java.awt.Color(0, 0, 255));   // culoarea textului butonului
        tipulDeAparatBT.setFont(new java.awt.Font("Tahoma", 1, 15));    // fontul textului butonului
        

        JButton afiseazaButton = new JButton("Salveaza");   // butonul
        afiseazaButton.setBounds(20, 270, 200, 30); // pozitia butonului
        afiseazaButton.addActionListener(new ActionListnerSalvareDate()); // adaugarea actiunii butonului
        afiseazaButton.setBackground(new java.awt.Color(0, 255, 0));    // culoarea butonului
        afiseazaButton.setForeground(new java.awt.Color(0, 0, 255));    // culoarea textului butonului
        afiseazaButton.setFont(new java.awt.Font("Tahoma", 1, 15));    // fontul textului butonului


        frame.add(nr); 
        frame.add(nrTF);
        frame.add(genereazaBT);

        frame.add(tipulDeMacinare);
        frame.add(tipulDeMacinareTF);
        frame.add(tipulDeMacinareBT);
        frame.add(afiseazaButton);

        frame.add(tipulDeAparat);
        frame.add(tipulDeAparatTF);
        frame.add(tipulDeAparatBT);
        frame.add(afiseazaButton);


        frame.setSize(400, 400); // dimensiunea ferestrei
        frame.setTitle("Cafea Macinata");
        frame.setLayout(null);   
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // inchiderea ferestrei
        
    }

    public static void main(String[] args) {
      TestInterfata t =  new TestInterfata();
    }
}