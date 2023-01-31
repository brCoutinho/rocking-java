package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());

        conjunto.add(10);
        System.out.println(conjunto.size());
        System.out.println(conjunto);
        System.out.println(conjunto.remove("a"));
        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        //conjunto.addAll(nums); //união

        conjunto.retainAll(nums);
        System.out.println(conjunto);
    }
}
