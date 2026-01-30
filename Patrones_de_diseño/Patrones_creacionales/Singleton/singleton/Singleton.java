/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author User
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Impresora usuario1= Impresora.getInstancia();
        Impresora usuario2= Impresora.getInstancia();
        Impresora usuario3= Impresora.getInstancia();
        
        usuario1.imprimir("Deber de POO");
         usuario1.imprimir("Deber de Fisica");
          usuario2.imprimir("Ejercicio de fisica");
           usuario3.imprimir("Reporte de ceros");
           System.out.println("Toral de Impresiones:"+usuario1.getTotalImpresiones());
           System.out.println("Toral de Impresiones:"+usuario2.getTotalImpresiones());
    }
    
}
