
package S03_12;

/**
 *
 * @author Williams
 */
public class S03_12_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = new int[5];
        
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 500;
        numeros[3] = 1000;
        numeros[4] = 1500;
        
        System.out.println(numeros[2]);
        
        int [] numeros2 = {10, 20, 30, 40, 50, 60};
        
        System.out.println(numeros2[2]);
        
        for(int numero : numeros2){
            
            System.out.println(numero);
        }
        
    }
    
}
