package ejercicio04;
public class Ejercicio04 {
    public static void main(String[] args) {
        double var1 = 20.0;
        int var2 = 1;
        int var3 = 3;
        int var4 = 2;
        int var5 = 3;
        double parteIzquierda = (var1 / (var2 + var3)) + var4;
        boolean resultado = parteIzquierda >= var5;
        System.out.println("El resultado es: " + resultado);
    }
}
