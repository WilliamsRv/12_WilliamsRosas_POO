/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_14;

/**
 *
 * @author Williams
 */
public class laptop_14 {
    
    String marca;
    String SN;
    float precio;
    
    
    public void  LAPTOP(String marca){
        System.out.println("la marca es: "+ marca);
    }
    public void LAPTOP( String marca, String SN){
        System.out.println("La marca es: "+marca+"\nEl codigo es: "+ SN);
    }
    public void LAPTOP( String marca , String Sn, float precio){
        System.out.println("la marca es: "+ marca+"\nEl codigo es: "+ SN+ "\nel precio es: "+ precio+"soles");
    }
}
