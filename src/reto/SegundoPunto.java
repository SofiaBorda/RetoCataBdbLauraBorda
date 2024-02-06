package reto;

import java.util.ArrayList;
import java.util.Collections;

public class SegundoPunto {
	public static void main(String[] args) throws Exception {
        int[] lista = {1, 2, 3, 5, 6, 8, 9};
        int s = 55;
        ArrayList<Integer> listaOrdenada = procesarLista(lista, s);
        System.out.println(listaOrdenada.toString());
    }

    private static ArrayList<Integer> procesarLista(int[] lista, int s) {
        ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
        //Matriz con los cuadrados enteros
        for (int i = 0; i < lista.length; i++) {
            nuevaLista.add(lista[i] * lista[i]);
        }

        ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();
        int n = nuevaLista.size();
        int numero = 0;

        for (int i = 0; i < n; i++) {
            numero = Collections.min(nuevaLista);
            if (numero < s) {
                listaOrdenada.add(numero);
                nuevaLista.remove(Integer.valueOf(Collections.min(nuevaLista)));
            }
        }

        return listaOrdenada;
    }
}
