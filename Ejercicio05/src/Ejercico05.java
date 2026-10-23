package ejercicio05;
public class Ejercico05 {
    public static void main(String[] args) {
        // Expresión: (2^2 + 12 - 1) / 3
        // Usamos Math.powExact para el cuadrado de 2
        int numerador = (int) (Math.powExact(2, 2) + 12 - 1);

        double resultado = numerador / 3.0;

        System.out.println("El resultado de la expresion es: " + resultado);
    }
}
