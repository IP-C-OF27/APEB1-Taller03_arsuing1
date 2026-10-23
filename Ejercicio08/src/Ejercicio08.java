package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        double var4 = 500.0;
        int var5 = 2;
        int var6 = 3;
        int var7 = 2;
        int var8 = 200;
        int var9 = 50;
        int var10 = 50;
        int var11 = 50;
        int var12 = 51;
        double parteIzquierda = (var1 * var2) + var3 - (var4 / var5) + Math.pow(var6, var7);
        boolean condicion1 = (parteIzquierda >= var8);
        boolean condicion2 = (var9 >= (var10 - var11 + var12));
        boolean resultadoTotal = condicion1 || condicion2;
        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}