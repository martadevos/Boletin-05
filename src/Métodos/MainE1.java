package Métodos;

import java.util.Scanner;

public class MainE1 {

    //a)Subprograma que teniendo como parámetros un carácter y un número, imprima una línea con tantas veces el carácter como indique el número.
    public static void imprimirCaracter(char caracter, int veces) {
        int i = 1;
        while (i <= veces) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();
    }

    //b) Subprograma para pasar de mayúsculas a minúsculas.No hace falta, se usa tolowercase

    //c) Subprograma para calcular si un año es o no bisiesto.
    public static void anioBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 == 0 || anio % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    //d) Subprograma Digito que determine si un carácter es un dígito entre 0 y 9.
    public static void digito(char carac) {
        if (carac > 0 && carac < 10) {
            System.out.println("El carácter es un dígito entre 0 y 9");
        } else {
            System.out.println("El carácter no es un dígito entre 0 y 9");
        }
    }

    //e) Subprograma para calcular si un número es o no perfecto.
    public static void numPerfecto(int num) {
        if (num % sumaDiv(num) == 0) {
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");
        }
    }

    public static int sumaDiv(int num) {
        int sumaDiv = 0;
        for (int i = 1; i < (num - 1); i++) {
            if (num % i == 0) {
                sumaDiv += i;
            }
        }
        return sumaDiv;
    }

    //f) Subprograma que tenga de entrada un carácter y devuelva un valor Cierto si dicho carácter es una letra del alfabeto español y Falso si no lo es.
    public static boolean caracterEspaniol(char letra) {
        return letra >= 'a' && letra <= 'z' || letra == 'ñ';
    }

    //g) Subprograma para comprobar si dos números son amigos. Dos números son amigos si la suma de los divisores del primero, excepto él mismo, es igual al segundo número y viceversa.
    public static void numsAmigos(int num1, int num2) {
        if (sumaDiv(num1) == num2 && sumaDiv(num2) == num1) {
            System.out.println("Los números son amigos");
        } else {
            System.out.println("Los números no son amigos");
        }
    }

    //h) Subprograma para determinar cuántas cifras posee un número entero.
    public static int cifrasNum(int num) {
        int cifras = 0;
        while (num > 0) {
            num /= 10;
            cifras++;
        }
        return cifras;
    }

    //i) Subprograma para pasar una medida en hectáreas y áreas a metros cuadrados.
    public static long hectareasAMetrosCuadrados(int hectareas, int areas) {
        return (hectareas * 100L + areas) * 100;
    }

    //j) Subprograma para calcular si un número es o no primo.
    public static boolean esPrimo(long num) {
        boolean primo = false;
        for (long i = 1; i < (num - 1) && !primo; i++) primo = !(num % i == 0);
        return primo;
    }

    //k) Subprograma llamado SiguientePrimo que reciba un número primo mayor que 1 y devuelva el número primo inmediatamente superior.
    public static int siguientePrimo(int primo1) {
        int primo2 = primo1+1;
        do primo2++; while (!esPrimo(2));
        return primo2;
    }

    //l) Subprograma que teniendo como parámetros las coordenadas cartesianas de dos puntos en el plano calcule la pendiente de la recta que definen.
    public static int calculopendiente(int x1, int y1, int x2, int y2) {
        return (y2-y1) / (x2 - x1);
    }
    //m) Subprograma que dado un número calcule sus factores primos.
    public static int[] sacarFactoresPrimos(int num) {
        int[] factors= new int[num];
        int n=0;
        for (int i = 1; i < (num - 1); i++) {
            if (num % i == 0 && esPrimo(i)) {
                factors[n]=i;
                n++;
            }
        }
        return factors;
    }

}
