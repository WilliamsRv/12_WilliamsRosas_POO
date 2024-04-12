/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_14;

/**
 *
 * @author Williams
 */
public class auto_14 {
    
    String modelo;
    String version;
    float peso;
    
    
    
    public void Especificaciones(String modelo){
        System.out.println("El modelo es: "+ modelo);
    }
    public void Especificaciones(String modelo, String version){
            System.out.println("el modelo es: "+ modelo+"\nla version es: "+ version);
    }
    public void Especificaciones(String modelo, String version, float peso){ 
        System.out.println("el modelo es: "+ modelo +"\nla version es: "+ version +"\nel peso es: "+ peso + "km");
    } 
}
