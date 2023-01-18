package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import datagenerator.GeneratorCafeaMacinata;

public class ActionListnerGenerareDate implements ActionListener{

    private JTextField jtext;

    ActionListnerGenerareDate(JTextField jtext) {
        this.jtext=jtext;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TestInterfata.listaCafeaMacinata = GeneratorCafeaMacinata.genereazaRandomCafeaMacinata(Integer.parseInt(jtext.getText()));
        System.out.println(TestInterfata.listaCafeaMacinata);
    }

}
