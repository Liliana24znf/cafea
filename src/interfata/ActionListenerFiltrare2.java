package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import filter.CafeaCapsuleFilter;

public class ActionListenerFiltrare2 implements ActionListener{
    private JTextField jtext;

    public ActionListenerFiltrare2(JTextField jtext)
    {
    this.jtext= jtext;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TestInterfata.listaCafeaCapsuleFiltrata=CafeaCapsuleFilter.filtreazaDupaCofeina(TestInterfata.listaCafeaCapsule,jtext.getText());//aiic sa midifice 
        // se filtreaza dupa cofeina si se adauga in lista de cafeaCapsuleFiltrata 
         System.out.println("Date filtrate: ");
            System.out.println(TestInterfata.listaCafeaCapsuleFiltrata);
    }
}
