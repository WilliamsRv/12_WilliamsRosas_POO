
package EjerciciosValor.Entero;

/**
 *
 * @author Williams
 */
public class Main_Entero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Entero_5 Ent = new Entero_5();

        int suma = Ent.sumar(10, 5);
        int resta = Ent.restar(10, 8);
        int multiplicacion = Ent.multiplicar(2, 200);
        int division = Ent.dividir(20, 4);
        int cuadrado = Ent.calcularCuadrado(10);

        System.out.println("la suma es: " + suma
                + "\nLa resfa es: " + resta
                + "\nLa multiplicacion es: " + multiplicacion
                + "\nLa division es: " + division
                + "\nEl cuadrado es : " + cuadrado);

    }
}
