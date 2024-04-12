/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S08_14;

/**
 *
 * @author Williams
 */
public class Main_08_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        auto_14 au = new auto_14();
        laptop_14 lap = new laptop_14();
        perro_14 pe = new perro_14();
        
        au.Especificaciones("kia");
        System.out.println("");
        au.Especificaciones("kia", "2025");
        System.out.println("");
        au.Especificaciones("kia", "2025", 25000);
        System.out.println("");
        lap.LAPTOP("lenovo");
        System.out.println("");
        lap.LAPTOP("lenovo", "12144558522315");
        System.out.println("");
        lap.LAPTOP("lenovo", "12144558522315", 1200);
        System.out.println("");
        pe.caracteristicasYedad("marron");
        System.out.println("");
        pe.caracteristicasYedad("marron", "unica");
        System.out.println("");
        pe.caracteristicasYedad("marron", "unica", 3);
        
       
    }
}