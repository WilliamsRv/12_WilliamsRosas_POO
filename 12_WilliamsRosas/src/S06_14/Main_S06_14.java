
package S06_14;

/**
 *
 * @author Williams
 */
public class Main_S06_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        MetodosEnteros operacionesEnteros = new MetodosEnteros();
        System.out.println("Resultado suma: " + operacionesEnteros.sumar(10, 5));
        System.out.println("Resultado resta: " + operacionesEnteros.restar(20, 8));
        System.out.println("Resultado multiplicación: " + operacionesEnteros.multiplicar(6, 4));
        System.out.println("Resultado división: " + operacionesEnteros.dividir(15, 3));
        

        // Métodos de la clase MetodosTexto
        MetodosTexto operacionesTexto = new MetodosTexto();
        operacionesTexto.metodoTexto1("Hola");
        operacionesTexto.metodoTexto2("Java", "Programming");
        operacionesTexto.metodoTexto3("Texto de prueba");
        operacionesTexto.metodoTexto4("Este es un ejemplo");
        operacionesTexto.metodoTexto5("Longitud del texto");

        // Métodos de la clase MetodosBooleanos
        MetodosBooleanos operacionesBooleanas = new MetodosBooleanos();
        System.out.println("¿Es positivo? " + operacionesBooleanas.esPositivo(10));
        System.out.println("¿Es par? " + operacionesBooleanas.esPar(7));
        System.out.println("¿Es mayor que? " + operacionesBooleanas.esMayorQue(15, 10));
        System.out.println("¿Son iguales? " + operacionesBooleanas.sonIguales(8, 8));
        System.out.println("¿Es divisible por? " + operacionesBooleanas.esDivisiblePor(20, 4));
    }
}
    
        
       
    
    

