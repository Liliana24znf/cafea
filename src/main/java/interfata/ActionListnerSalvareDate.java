package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

import com.mycompany.cafea.CafeaMacinata;

public class ActionListnerSalvareDate implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ev) {
        
        /*String path="C:\\Users\\alupo\\Desktop\\fisiere";
        String namefile="date.txt"; */
        //de modificat path-ul

        try {
            //Salvam datele ca text
            FileWriter myWriter = new FileWriter("date.txt");
            // se salveaza intrega colectie
            myWriter.write(TestInterfata.listaCafeaMacinata.toString());
            // se salveaza cate un element din colectie pe rand
            for(CafeaMacinata cafea:TestInterfata.listaCafeaMacinata)
            	myWriter.write(cafea.toString()+"\n");
            myWriter.close();
            System.out.println(TestInterfata.listaCafeaMacinata);
            
            
            // Salvam datele in mod binar, ca obiecte
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            // se salveaza intrega colectie
            o.writeObject(TestInterfata.listaCafeaMacinata);
            // se salveaza cate un element din colectie pe rand
            for(CafeaMacinata cafea:TestInterfata.listaCafeaMacinata)
            	o.writeObject(cafea);
            o.close();
            f.close();
            
            System.out.println("Date salvate");

        } catch (Exception e) {
            e.printStackTrace();		
        }
        
        
    }
}


