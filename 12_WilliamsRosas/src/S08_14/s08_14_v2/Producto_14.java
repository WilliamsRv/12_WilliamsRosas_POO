/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_14.s08_14_v2;

/**
 *
 * @author Williams
 */
public class Producto_14 {
    
    int precio;
    int cantidad;
    String calidad;
    
    
    public void productoEs(String nombre){
        System.out.println("El producto es: "+ nombre+ " y  tiene precio: "+ precio);
    }
    public void productoEs(float tamaño){
        System.out.println("solicito la cantidad de: "+ cantidad+ " El tamaño  es: "+tamaño);
    }
    public void productoEs(int peso){
        System.out.println("la calidad del producto es: "+ calidad + " y  el peso es: "+ peso);
    }
    
}
