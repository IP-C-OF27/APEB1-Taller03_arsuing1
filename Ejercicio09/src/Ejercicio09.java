package ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        double var1 = 81.0;
        double var2 = 25.0;
        double var3 = 10.0;
        double var4 = 50.0;
        double parteIzquierda = Math.sqrt(var1) + (Math.sqrt(var2) * var3);
        boolean resultadoTotal = parteIzquierda >= var4;
        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}