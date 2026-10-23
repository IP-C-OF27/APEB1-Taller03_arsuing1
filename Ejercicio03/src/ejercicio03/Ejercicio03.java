package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // Expresión: 10^2 + raíz(16) + (20 / (1 + 11))
        
        double parte1 = Math.pow(10, 2); // 10 al cuadrado
        double parte2 = Math.sqrt(16);   // Raíz cuadrada de 16
        double parte3 = 20.0 / (1 + 11); // División
        
        double resultadoTotal = parte1 + parte2 + parte3;
        
        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
    
}
