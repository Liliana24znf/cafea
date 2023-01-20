package interfata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import dataGenerator.GeneratorCafeaCapsule;


public class ActionListnerGenerareDate implements ActionListener{
    
    private JTextField jtext; 
    ActionListnerGenerareDate(JTextField jtext) 
    {
        this.jtext=jtext;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TestInterfata.listaCafeaCapsule=GeneratorCafeaCapsule.genereazaRandomCafeaCapsule(Integer.parseInt(jtext.getText())); //conversie din string in int 
         // se genereaza datele random si se adauga in lista de cafeaCapsule 
        System.out.println(TestInterfata.listaCafeaCapsule);
    }
}
