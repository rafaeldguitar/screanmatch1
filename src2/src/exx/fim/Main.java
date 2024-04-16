package exx.fim;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Titulo d = new Titulo("D");
        Titulo a = new Titulo("A");
        Titulo b = new Titulo("B");


        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(d);
        listaTitulos.add(a);
        listaTitulos.add(b);

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }
    }
}

