package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import filter.CafeaCapsuleFilter;

public class ActionListenerFiltrare implements ActionListener{
    private JTextField jtext;

    public ActionListenerFiltrare(JTextField jtext)
    {
    this.jtext= jtext;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TestInterfata.listaCafeaCapsuleFiltrata=CafeaCapsuleFilter.filtreazaDupaBrand(TestInterfata.listaCafeaCapsule,jtext.getText());//aici sa modifice
         System.out.println("Date filtrate: ");
            System.out.println(TestInterfata.listaCafeaCapsuleFiltrata);
    }
}
    

