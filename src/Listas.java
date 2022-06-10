import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Listas {

    ArrayList<Integer> inteiros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));


    public static void main(String[] args) {
        Listas l = new Listas();
        System.out.println(l.inteiros);

        //Removendo fim
        l.inteiros.remove(l.inteiros.size()-1);
        System.out.println(l.inteiros);

        //Removendo inicio
        l.inteiros.remove(0);
        System.out.println(l.inteiros);

    }
}
