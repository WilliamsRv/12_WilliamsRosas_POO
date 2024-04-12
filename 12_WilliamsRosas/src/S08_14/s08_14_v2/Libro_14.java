/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_14.s08_14_v2;

/**
 *
 * @author Williams
 */
public class Libro_14 {
    
    String paginas;
    String titulo;
    int precio;
    
    public void texto(int cantidad){
        System.out.println("la cantidad de libros es: "+ cantidad+ " y tiene como titulo: "+ titulo);
    }
    public void texto(float tamaño){
        System.out.println("el tamaño de cada libro es de : "+tamaño+ " y tiene : "+ paginas+" paginas");
    }
    public void texto(String año){
        System.out.println("el año de publicacion es: "+ año+" y el precio es: "+ precio);
    }
    
}
