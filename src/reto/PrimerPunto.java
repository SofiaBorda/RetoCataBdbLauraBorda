package reto;

public class PrimerPunto {
	public static void main(String[] args) {
        int[] lista = {50, 6, 5, 4, 3, 2, 7, 7, 29, 1};
        char s = '5';
        String resultado = generarCadena(lista, s);
        System.out.println(resultado);
    }

    private static String generarCadena(int[] lista, char s) {
        StringBuilder cadena = new StringBuilder();
        //Convierte la lista en una cadena
        for (int i = 0; i < lista.length; i++) {
            cadena.append(lista[i]);
            cadena.append(" ");
        }
        //Invierte la cadena
        StringBuilder nuevaCadena = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
        	//Omite los digitos que son mayores o iguales a s
            if (cadena.charAt(i) < s || cadena.charAt(i) == ' ') {
                nuevaCadena.append(cadena.charAt(i));
            }
        }

        return nuevaCadena.toString().trim().replaceAll(" +", ",");
    }
}
