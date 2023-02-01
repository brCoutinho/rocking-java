package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(1, "João");
        usuarios.put(2, "José");

        System.out.println(usuarios.toString());
        System.out.println(usuarios.keySet() + " " + usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.get(1));

        for(int key: usuarios.keySet()){
            System.out.println(key);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getValue());
        }
        
        usuarios.remove(1, "João");
        usuarios.remove(2);

        System.out.println(usuarios.get(1));
        System.out.println(usuarios.remove(2));

    }
}
