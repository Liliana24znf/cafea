package Interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import Filter.CafeaCapsuleFilter;

public class ActionListenerFiltrareCafeaCapsule implements ActionListener{
    private JTextField jtext;

    public ActionListenerFiltrareCafeaCapsule(JTextField jtext)
    {
    this.jtext= jtext;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TestInterfataCafeaCapsule.listaCafeaCapsuleFiltrata=CafeaCapsuleFilter.filtreazaDupaBrand(TestInterfataCafeaCapsule.listaCafeaCapsule,jtext.getText());//aici sa modifice
         System.out.println("Date filtrate: ");
            System.out.println(TestInterfataCafeaCapsule.listaCafeaCapsuleFiltrata);
    }
}
    

