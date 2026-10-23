package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        double var1 = 81.0;
        double var2 = 9.0;
        double var3 = 3.0;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        int parte1 = (int) ((Math.sqrt(var1) + var2) / var3);
        boolean condicion1 = (parte1 == var4);
        boolean condicion2 = (var5 > var6);
        boolean resultadoTotal = condicion1 && condicion2;
        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
