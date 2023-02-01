package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));

        System.out.println("remove pelo índice " +lista.remove(1));
        System.out.println("remove pelo objeto " +lista.remove(new Usuario("Manu")));

        System.out.println("Contém Bia? " + lista.contains(new Usuario("Bia")));

        for (Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
