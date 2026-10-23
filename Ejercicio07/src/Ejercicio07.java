package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        //((√81 + 9) / 3 == 9) || (10 > 1) && (100 / 25 >= √100)

        boolean parte1 = ((Math.sqrt(81) + 9) / 3.0) == 9;

        boolean parte2 = (10 > 1);

        boolean parte3 = (100.0 / 25) >= Math.sqrt(100);

        boolean resultadoTotal = parte1 || (parte2 && parte3);

        System.out.println("El resultado de la expresion es: " + resultadoTotal);
    }
}
