package ejercicio06;
public class Ejercico06 {
    public static void main(String[] args) {
        // Expresión: ((√81 + 9) / 3 == 9) && (10 > 1)
        
        double parte1 = (Math.sqrt(81) + 9) / 3.0;
        
        boolean condicion1 = (parte1 == 9);
        
        boolean condicion2 = (10 > 1);

        boolean resultadoTotal = condicion1 && condicion2;

        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
