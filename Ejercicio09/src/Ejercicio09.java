package ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        //√81 + √25 * 10 >= 50

        double parteIzquierda = Math.sqrt(81) + (Math.sqrt(25) * 10);

        boolean resultadoTotal = parteIzquierda >= 50;

        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
