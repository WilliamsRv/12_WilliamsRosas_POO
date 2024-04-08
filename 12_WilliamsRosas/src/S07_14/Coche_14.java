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
public class Coche_14 {

    public String color() {
        return "azul";
    }

    public String marca() {
        return "toyota";
    }

    public String version() {
        return "Equipada";
    }
    
    public void año(int año){
            System.out.println("el año del auto es: "+año);
    }
    
    public void precio(int precio){
        System.out.println("su precio es: "+precio+"$");
    }
    
    public void descuento (int des){
        System.out.println("su descuento por campaña es: "+des+ "%");
    }
}
