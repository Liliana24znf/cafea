package interfata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.ObjectOutputStream;

import model.CafeaCapsule;


public class ActionListenerSalvare implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ev)
    {
       // String path="C:\\Users\\corin\\OneDrive\\Desktop";-comentariu
        String namefile="date.txt";
        try{
            
            // salvam datele ca txt
            FileWriter myWriter = new FileWriter(namefile);//aici sa modifice
            // se salveaza intreaga colectie
            myWriter.write(TestInterfata.listaCafeaCapsuleFiltrata.toString());
            // se salveaza cate un element din colectie pe rand
            for(CafeaCapsule cafeaCapsule:TestInterfata.listaCafeaCapsuleFiltrata)
                myWriter.write(cafeaCapsule.toString()+"\n");
            myWriter.close();
            System.out.println(TestInterfata.listaCafeaCapsuleFiltrata); 
        
        // salvam datele in mod binar ca obiecte
        FileOutputStream f= new FileOutputStream(new File("myObject.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);
        // se salveaza intreaga colectie
        o.writeObject(TestInterfata.listaCafeaCapsuleFiltrata);
        // se salveaza cate un element din colectie pe rand
        for(CafeaCapsule cafeaCapsule:TestInterfata.listaCafeaCapsuleFiltrata)
            o.writeObject(cafeaCapsule);
        o.close();
        f.close();
        System.out.println("Date salvate");
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        
    }
}
