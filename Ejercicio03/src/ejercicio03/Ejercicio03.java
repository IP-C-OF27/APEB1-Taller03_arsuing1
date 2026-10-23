package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 2;
        int var3 = 16;
        double var4 = 20.0;
        int var5 = 1;
        int var6 = 11;
        double parte1 = Math.pow(var1, var2);
        double parte2 = Math.sqrt(var3);
        double parte3 = var4 / (var5 + var6);
        double resultadoTotal = parte1 + parte2 + parte3;
        System.out.println("El resultado es: " + resultadoTotal);
    }
}
