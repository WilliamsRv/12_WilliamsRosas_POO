/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S03_12;

/**
 *
 * @author Williams
 */
public class S03_12_Switch {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 12;
        
        switch(a){
        
            case 1:
                System.out.println("opcion 1");
                break;
            case 2:
                System.out.println("ocion 3");
                break;
            default:
                System.out.println("no encontre las opciones");
                break;
        }
        
        
        String b = "pantalon";
        
        switch(b){
            case "polo":
                System.out.println("estas comprando polo");
                break;
            case "short": 
                System.out.println("estas comprando short");
                break;
            case "camisa":
                System.out.println("estas comprando una camisa");
                break;
            default:
                System.out.println("no estas lo que quieres comprar");
                break;
               
    
    }

    }

}
