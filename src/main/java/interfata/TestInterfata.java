package interfata;
import java.util.ArrayList;
import javax.swing.*;
import com.mycompany.cafea.CafeaMacinata;

public class TestInterfata {

    public static ArrayList<CafeaMacinata> listaCafeaMacinata;
    public static ArrayList<CafeaMacinata> listaCafeaMacinataFiltrata;

    TestInterfata(){
        JFrame frame = new JFrame();

		JLabel nr = new JLabel("Cafea macinata:");
		nr.setBounds(20, 20, 100, 20);
		JTextField nrTF = new JTextField();
		nrTF.setBounds(120, 20, 100, 20);
		JButton genereazaBT = new JButton("Genereaza date");
		genereazaBT.setBounds(20, 50, 200, 30);
		genereazaBT.addActionListener(new ActionListnerGenerareDate(nrTF));


        JLabel tipulDeMacinare = new JLabel("Tipul de macinare:");
        tipulDeMacinare.setBounds(20, 100, 120, 20);
        JTextField tipulDeMacinareTF = new JTextField();
        tipulDeMacinareTF.setBounds(120, 100, 100, 20);
        JButton tipulDeMacinareBT = new JButton("Filtreaza dupa tipul de macinare ");
        tipulDeMacinareBT.setBounds(20, 130, 200, 30);
        tipulDeMacinareBT.addActionListener(new ActionListnerGenerareDate(tipulDeMacinareTF));

        JLabel tipulDeAparat = new JLabel("Tipul de aparat:");
        tipulDeAparat.setBounds(20, 180, 100, 20);
        JTextField tipulDeAparatTF = new JTextField();
        tipulDeAparatTF.setBounds(120, 180, 100, 20);
        JButton tipulDeAparatBT = new JButton("Filtreaza dupa tipul de aparat ");
        tipulDeAparatBT.setBounds(20, 210, 200, 30);
        tipulDeAparatBT.addActionListener(new ActionListnerGenerareDate(tipulDeAparatTF));
        

        JButton afiseazaButton = new JButton("Salveaza");
        afiseazaButton.setBounds(20, 270, 200, 30);
        afiseazaButton.addActionListener(new ActionListnerSalvareDate());
           

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

        frame.setSize(400, 400);
        frame.setTitle("Cafea Macinata");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void main(String[] args) {
       TestInterfata t = new TestInterfata();
    }
}