package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        //(√25 * 10 >= 100) && (true) || (false) || (10 / 5 >= 2)

        boolean parte1 = (Math.sqrt(25) * 10) >= 100;

        boolean parte4 = (10.0 / 5) >= 2;

        boolean resultadoTotal = (parte1 && true) || false || parte4;

        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
