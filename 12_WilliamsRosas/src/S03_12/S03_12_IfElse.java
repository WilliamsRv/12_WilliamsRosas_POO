/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S03_12;

/**
 *
 * @author Williams
 */
public class S03_12_IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = false;
        int b =  5;
        
        if(a){
            System.out.println("hola");
        }
        
        if(a){
            System.out.println("ejecucion true");
        }else{
            System.out.println("ejecucion false");
        }
        
        if (b == 70){
            System.out.println("b vale 10");
        }else if (b==20){
            System.out.println("b vale 20");
        }else if (b==30){
            System.out.println("b vale 30");
        }else{
            System.out.println("no cumple");
        }
    }
    
}
