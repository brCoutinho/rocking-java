package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set<String> lista = new HashSet<>();
        Set<String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");
        lista.add("Fábio");

        for (String candidato: lista){
            System.out.println(candidato);
        }
    }
}
