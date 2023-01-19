package datagenerator;
import com.mycompany.cafea.CafeaMacinata;




import java.util.ArrayList;
public class testtema3 {

    public static void main(String[] args) {
     ArrayList<CafeaMacinata> listaCafeaMacinata = GeneratorCafeaMacinata.genereazaRandomCafeaMacinata(1);
        System.out.println("lista de cafea macinata:");
        System.out.println(listaCafeaMacinata);

    }
}

