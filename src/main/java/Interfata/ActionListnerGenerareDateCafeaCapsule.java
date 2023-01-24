package Interfata;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import Generator.GeneratorCafeaCapsule;


public class ActionListnerGenerareDateCafeaCapsule implements ActionListener{
    
    private JTextField jtext; 
    ActionListnerGenerareDateCafeaCapsule(JTextField jtext) 
    {
        this.jtext=jtext;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TestInterfataCafeaCapsule.listaCafeaCapsule=GeneratorCafeaCapsule.genereazaRandomCafeaCapsule(Integer.parseInt(jtext.getText())); //conversie din string in int 
         // se genereaza datele random si se adauga in lista de cafeaCapsule 
        System.out.println(TestInterfataCafeaCapsule.listaCafeaCapsule);
    }
}
