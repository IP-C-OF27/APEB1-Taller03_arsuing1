package ejercicio04;
public class Ejercicio04 {
    public static void main(String[] args) {
        // (20 / (1 + 3)) + 2 >= 3
        
        double parteIzquierda = (20.0 / (1 + 3)) + 2;
        
        boolean resultado = parteIzquierda >= 3;

        System.out.println("El resultado de la expresion es: " + resultado);
    }
}
