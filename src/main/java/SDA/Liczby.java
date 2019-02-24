package SDA;

import java.util.*;

public class Liczby {


    public int najwiekszaLiczba(List<Integer> lista) {
        int najwiekszaLiczba = lista.get(0);
        for (int i : lista) {
            if (najwiekszaLiczba <= i) {
                najwiekszaLiczba = i;
            }

        }
        return najwiekszaLiczba;
    }

    public int najmniejszaLiczba(List<Integer> lista) {
        int najmniejszaLiczba = lista.get(0);
        for (int i : lista) {
            if (najmniejszaLiczba >= i) {
                najmniejszaLiczba = i;
            }

        }
        return najmniejszaLiczba;
    }


    public Set<Integer> unikalnaLista(List<Integer> lista) {
        Set<Integer> listaUnikalna = new HashSet<>();

        int liczba = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            listaUnikalna.add(lista.get(i));
        }
        return listaUnikalna;
    }
}

