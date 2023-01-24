package Interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import Filter.CafeaCapsuleFilter;

public class ActionListenerFiltrareCafeaCapsule2 implements ActionListener{
    private JTextField jtext;

    public ActionListenerFiltrareCafeaCapsule2(JTextField jtext)
    {
    this.jtext= jtext;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TestInterfataCafeaCapsule.listaCafeaCapsuleFiltrata=CafeaCapsuleFilter.filtreazaDupaCofeina(TestInterfataCafeaCapsule.listaCafeaCapsule,jtext.getText());//aiic sa midifice 
        // se filtreaza dupa cofeina si se adauga in lista de cafeaCapsuleFiltrata 
         System.out.println("Date filtrate: ");
            System.out.println(TestInterfataCafeaCapsule.listaCafeaCapsuleFiltrata);
    }
}
