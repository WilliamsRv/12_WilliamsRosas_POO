/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S08_14.s08_14_v2;

/**
 *
 * @author Williams
 */
public class Main_S08_14_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria_14 cb = new CuentaBancaria_14();
        Libro_14 lb = new Libro_14();
        Producto_14 pr = new Producto_14();
        
        System.out.println("");
        cb.banco="bcp";
        cb.cci=12245215;
        cb.fechaV="24/07";
        
        System.out.println("");
        cb.tajeta(61200005);
        cb.tarjeta("williams");
        cb.tarjeta(15333);
        
        System.out.println("");
        lb.paginas="144";
        lb.precio=220;
        lb.titulo="programacion";
        
        System.out.println("");
        lb.texto(2023);
        lb.texto(120);
        lb.texto(4000);
        
        System.out.println("");
        pr.calidad="A1";
        pr.cantidad=222;
        pr.precio=124;
        
        System.out.println("");
        pr.productoEs("javon");
        pr.productoEs(23);
        pr.productoEs(20);
        
        
    }
    
}
