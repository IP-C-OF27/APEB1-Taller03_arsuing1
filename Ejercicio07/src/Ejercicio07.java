package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        double var1 = 81.0;
        double var2 = 9.0;
        double var3 = 3.0;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        double var7 = 100.0;
        double var8 = 25.0;
        double var9 = 100.0;
        int parte1 = (int) ((Math.sqrt(var1) + var2) / var3);
        boolean condicion1 = (parte1 == var4);
        boolean parte2 = (var5 > var6);
        boolean parte3 = (var7 / var8) >= Math.sqrt(var9);
        boolean resultadoTotal = condicion1 || (parte2 && parte3);
        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
