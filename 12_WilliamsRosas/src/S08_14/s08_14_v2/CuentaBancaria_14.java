/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_14.s08_14_v2;

/**
 *
 * @author Williams
 */
public class CuentaBancaria_14 {
    
    int cci;
    String fechaV;
    String banco;
    
    
    public void tarjeta(String propietario){
        System.out.println("el propietario es: "+ propietario + " y el numero de cuenta es: "+cci);
    }
    public void tarjeta(float dinero){
        System.out.println("el dinero guardado es: "+ dinero+ " y la fecha de vencimiento es: "+ fechaV);
    }
    public void tajeta(int dni){
        System.out.println("el dni del propietario es: "+ dni+ " y esta en el banco: "+ banco);
    }
}
