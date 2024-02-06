package reto;

import java.util.Arrays;

public class TercerPunto {
	public static void main(String[] args) {
        int[] monedas = {5, 7, 1, 1, 2, 3, 22};

        System.out.println(minChange(monedas)); 
    }

    public static int minChange(int[] monedas) {
        Arrays.sort(monedas);

        int minCambio = 1;

        for (int moneda : monedas) {
            if (moneda <= minCambio) {
                minCambio += moneda;
            } else {
                return minCambio;
            }
        }
        return minCambio;
    }
}
