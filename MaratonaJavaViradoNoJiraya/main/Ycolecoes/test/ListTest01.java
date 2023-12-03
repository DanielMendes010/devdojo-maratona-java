package Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16); // 1.5
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Fulano");
        nomes.add("Devdojo");
        nomes2.add("De tal");
        nomes2.add("curso");

//        System.out.println(nomes.remove("daniel"));
        nomes.addAll(nomes2);

        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("---------");

        int size = nomes.size();
        // Escopo de como iterar um novo objeto dentro do for, pode ser feito com o metodo iterate tbm
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
