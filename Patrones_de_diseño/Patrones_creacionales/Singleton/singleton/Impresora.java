/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author User
 */
public class Impresora {
    
    private int totalimpresiones;
    /*1 definir una variable estatica
    2. Crear un constrictor privado
    3. Agregar un metodo publico estatico*/
    //variable estatica
    private static Impresora instancia;
    //2. crear constructor privado

    private Impresora() {
        System.out.println("Impresora Encendida");
    }
    
    //3. Agregar un metodo publico estatico
    
    public static Impresora getInstancia(){
        if (instancia== null){
            instancia= new Impresora();
                              
        }
        return instancia;
    }
    //Metodo para imprimir
    public void imprimir(String documento){
        totalimpresiones++;
        System.out.println("Se imprimio el "+ documento);
    }
    public int getTotalImpresiones(){
        return totalimpresiones;
    }
    
    
}
