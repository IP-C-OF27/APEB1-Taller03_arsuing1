package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        //((10 * 9) + 20 - (500 / 2) + 3^2 >= 200) || (50 >= 50 - 50 + 51)

        double parteIzquierda = (10 * 9) + 20 - (500.0 / 2) + Math.powExact(3, 2);
        boolean condicion1 = (parteIzquierda >= 200);

        boolean condicion2 = (50 >= (50 - 50 + 51));

        boolean resultadoTotal = condicion1 || condicion2;

        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
