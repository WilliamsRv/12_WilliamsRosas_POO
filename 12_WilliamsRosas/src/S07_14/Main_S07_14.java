/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_14;

/**
 *
 * @author Lab10
 */
public class Main_S07_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Retorno_Parametros_14 rp = new Retorno_Parametros_14();

        int sumaTotal = rp.sumar(10, 20);

        String name = "williams";

        System.out.println("la suma total es: " + sumaTotal);
        rp.nombre("williams");
        rp.apellido("rosas");

        Persona_14 pe = new Persona_14();

        String Name = pe.nombre();
        String Ape = pe.Apellido();
        pe.edad(23);
        pe.trabajo("cobrando combi");
        System.out.println("mi nombre es: " + Name);
        System.out.println("mi apellido es: " + Ape);

        Animal_14 polu = new Animal_14();

        String name1 = polu.nombre();
        String rascar2 = polu.rascar();
        String comer2 = polu.comer();
        System.out.println("su nombre es: " + name1);
        System.out.println("ella " + rascar2);
        System.out.println("ella " + comer2);
        polu.Edad(2);
        polu.peso(16);
        polu.color("Marrón");
        
        Coche_14 au = new Coche_14();
        
        String colour = au.color();
        String marca1 = au.marca();
        String version1 = au.version();
        System.out.println("el color del auto es: "+colour);
        System.out.println("la marca del auto es: "+marca1 );
        System.out.println("la version del auto: "+version1);
        au.año(2022);
        au.precio(50000);
        au.descuento(20);
        
                
        
    }

}
