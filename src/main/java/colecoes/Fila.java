package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Thiago");

        fila.clear();
        fila.isEmpty();
        fila.poll(); //remove
        fila.remove();//exceção se a lista estiver vazia

        fila.contains("Thiago");
    }
}
