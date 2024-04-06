/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosValor.Entero.Texto;

/**
 *
 * @author Williams
 */
public class Main_Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Texto mx = new Texto();

        String mxm = mx.obtenerSaludo();
        String mxm1 = mx.obtenerDespedida();
        String mxm2 = mx.generarMensajeError();
        String mxm3 = mx.obtenerNombreDiaActual();
        String mxm4 = mx.saludarUsuario("Andres");
        
        System.out.println(mxm + " "+"\n"+ mxm1 + " "+ "\n"+mxm2+ " " +"\n"+ mxm3 + " " +"\n"+ mxm4 + " ");
    }

}
