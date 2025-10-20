public class Main {
    public static void main(String[] args) {
    /*
    ESPECIFICACIONES
    Tarea 1
    Escribe un método en Java que devuelva la diferencia entre el valor
    más grande y el más pequeño en un array de enteros.
    La longitud del array debe ser al menos 1.

    Tarea 2
    Escribe un método en Java que encuentre los elementos más pequeño
    y segundo más pequeño de un array dado y los muestre por consola.

    Tarea 3
    Escribe un método en Java que calcule el resultado de la siguiente
    expresión matemática, donde x e y son dos variables previamente
    definidas en tu código: x^2 + ((4y / 5) - x)^2
    */

        int[] numeros = {4, 1, 7, 3, 9};

        // Tarea 1
        System.out.println("Diferencia entre el mayor y el menor: " + diferenciaMaxMin(numeros));

        // Tarea 2
        mostrarDosMenores(numeros);

        // Tarea 3
        double x = 3, y = 5;
        double resultado = calcularExpresion(x, y);
        System.out.println("\nResultado de la expresión: " + resultado);
    }

    public static int diferenciaMaxMin(int[] numeros) {
        int min = numeros[0];
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) min = numeros[i];
            if (numeros[i] > max) max = numeros[i];
        }
        return max - min;
    }

    public static void mostrarDosMenores(int[] numeros) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int n : numeros) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2 && n != min1) {
                min2 = n;
            }
        }
        System.out.println("\nEl número más pequeño es: " + min1);
        System.out.println("El segundo número más pequeño es: " + min2);
    }

    public static double calcularExpresion(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4.0 * y / 5.0) - x, 2);
    }
}