package exx.fim;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Inteiros {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros); //por padrao organiza em ordem crescente - Comparator.comparing() para nomes.

        System.out.println("Lsiat em ordem: " + numeros);
    }
}
