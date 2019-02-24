package SDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        Random generator = new Random();

        int sizeList = 20;

        for (int i = 0; i < sizeList; i++) {

            lista.add(generator.nextInt(sizeList) + 1);
        }

        System.out.println(lista);

        Liczby liczby = new Liczby();

        System.out.println(liczby.najmniejszaLiczba(lista));
        System.out.println(liczby.najwiekszaLiczba(lista));
        System.out.println(liczby.unikalnaLista(lista));


    }

}
