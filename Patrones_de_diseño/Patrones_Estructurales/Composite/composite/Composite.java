/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

/**
 *
 * @author User
 */
public class Composite {
//papas->1
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo a1= new Archivo("Abrazame.mp3",4000);
        Archivo a2= new Archivo("Amor prohibido.mp3",5000);
        Archivo a3= new Archivo("Mi foto .jpg",1000);
        //Carpeta Principal
        Carpeta raiz= new Carpeta ("Mi PlayList");
        //sub carpeta
        Carpeta imagenes = new Carpeta("Imagenes");
        raiz.agregar(a1);
        raiz.agregar(imagenes);
        raiz.agregar(a2);
        imagenes.agregar(a3);
        
        raiz.mostrar();
        System.out.println("\n Tamaño Total: "+raiz.gettamano()+"Kb ");
    }
    
}
