package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros =  new ArrayDeque<>();

        livros.add("Manifesto");
        livros.push("Dom quixote");//Exceção caso passe do limite definido
        livros.push("Livro dos abraços");//Exceção caso passe do limite definido

        livros.pop();

        livros.forEach(System.out::println);

    }
}
