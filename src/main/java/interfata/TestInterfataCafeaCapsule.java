package Interfata;
import java.util.ArrayList;
import javax.swing.*;

import cafea.CafeaCapsule;


public class TestInterfataCafeaCapsule {

    public static ArrayList<CafeaCapsule> listaCafeaCapsule;
    public static ArrayList<CafeaCapsule> listaCafeaCapsuleFiltrata; 

    TestInterfataCafeaCapsule()
    {
        JFrame frame = new JFrame();
        //adaugarea unui text area in care se vor afisa datele
        
        
        
        JLabel nr = new JLabel ("Nr. CafeaCapsule:");
        nr.setBounds(20, 20, 80, 20);
        JTextField nrTF= new JTextField();
        nrTF.setBounds(120, 20, 80, 20);
        JButton genereazaBT = new JButton("Genereaza date");
        genereazaBT.setBounds(20,50,200,30);
        genereazaBT.addActionListener(new ActionListnerGenerareDateCafeaCapsule(nrTF)); 
        //se asteapta primirea unei actiuni de la butonul de generare date si se apeleaza metoda din clasa ActionListnerGenerareDate
        
        
        
        JLabel nr2= new JLabel("Brand:");
        nr2.setBounds(20,100,80,20);
        JTextField nr2TF= new JTextField();
        nr2TF.setBounds(120,100,80,20);
        JButton filtreazaBT= new JButton("Filtreaza dupa Brand");
        filtreazaBT.setBounds(20,130,200,30);
        filtreazaBT.addActionListener(new ActionListenerFiltrareCafeaCapsule(nr2TF)); 
        
        
        
        
        JLabel nr3= new JLabel("Cofeina:");
        nr3.setBounds(20,180,80,20);
        JTextField nr3TF= new JTextField();
        nr3TF.setBounds(120,180,80,20);
        JButton filtreaza2BT= new JButton("Filtreaza dupa cofeina");
        filtreaza2BT.setBounds(20,210,200,30);
        filtreaza2BT.addActionListener(new ActionListenerFiltrareCafeaCapsule2(nr3TF));
        
        
        JButton afiseazaBT= new JButton("Importa");
        afiseazaBT.setBounds(20,270,200,30);
        afiseazaBT.addActionListener(new ActionListenerSalvareCafeaCapsule());
        
        
        frame.add(nr);
        frame.add(nrTF);
        frame.add(genereazaBT);
        
        frame.add(nr2);
        frame.add(nr2TF);
        frame.add(filtreazaBT);
        
        
        
        frame.add(nr3);
        frame.add(nr3TF);
        frame.add(filtreaza2BT);
        
        
        
        frame.add(afiseazaBT);
        
        frame.setSize(800,400);
        frame.setTitle("CafeaCAPSULE");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        //adaugarea unui textarea in care se vor afisa datele 
        JTextArea textArea = new JTextArea();
        textArea.setBounds(300, 20, 400, 300);
        frame.add(textArea);
        
      


    }
        
        public static void main(String[] args) {
        
            TestInterfataCafeaCapsule t = new TestInterfataCafeaCapsule(); ///aici sa modifice
    }
    
}
