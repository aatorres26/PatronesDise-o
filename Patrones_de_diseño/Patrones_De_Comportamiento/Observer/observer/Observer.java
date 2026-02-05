/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;
import java.util.*;
/**
 *
 * @author User
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int opcion;
        String titulo="";
        
                
        Canal canal = new Canal();
        do{
            System.out.println("CANAL DE YOUTUBE");
            System.out.println("1:Suscribirse");
            System.out.println("2: Subir video");
            System.out.println("3: Ver notificaciones");
            System.out.println("4: salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt(); sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingres su nombre: ");
                    String nombre = sc.nextLine();
                    canal.suscribir(new Usuario(nombre));break;
                case 2:
                    System.out.println("Ingrese el nombre del video : ");
                     titulo = sc.nextLine();
                    canal.subir(titulo);break;
                case 3:
                    canal.notificar(titulo); break;
                case 4: break;
                
                    
            }
        }while(opcion!=4);
    }
    
}
