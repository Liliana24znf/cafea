package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import filter.FilterCafeaMacinata;

public class ActionListnerFiltrareDate2 implements ActionListener {

    private JTextField jtext;

    public ActionListnerFiltrareDate2(JTextField jtext) {
        this.jtext = jtext;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TestInterfata.listaCafeaMacinata = FilterCafeaMacinata.filtreazaDupatipulDeMacinare(TestInterfata.listaCafeaMacinata, Integer.parseInt(jtext.getText()));
        System.out.println("Date filtrate:");
        System.out.println(TestInterfata.listaCafeaMacinata);
    }

}

