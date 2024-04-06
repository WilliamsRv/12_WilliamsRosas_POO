
package EjerciciosValor.Entero.Boolean;



/**
 *
 * @author Williams
 */
public class Boolean {
    
    
    
    public  boolean esPar(int numero){
        
        return numero %2 ==0;
    }
    
    public boolean esPositivo(int numero){
        return numero > 0;
    }
    
    public boolean contieneSoloLetras(String Texto){
        return Texto.matches("[a-zA-z]+");
    }
    
    public boolean esBisiesto(int año){
        return (año % 4 == 0 && año % 100 != 0 ) || (año % 400 == 0);
    }
    
    public boolean esPalindromo(String texto){
        String textoSinEspacios = texto.replaceAll("\\s+", "").toLowerCase();
        String reverso = new StringBuilder(textoSinEspacios).reverse().toString();
        return textoSinEspacios.equals(reverso);
    
    }
}
