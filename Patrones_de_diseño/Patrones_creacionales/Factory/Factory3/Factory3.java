/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory3;
import java.util.*;
/**
 *
 * @author User
 */
public class Factory3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int opcion;
        do{
            System.out.println("===Mensajes=====");
            System.out.println("1: Mensaje por Gmail");
            System.out.println("2: Mensaje por Instagram");
            System.out.println("3: Mensaje por SMS");
            System.out.println("4: Mensaje por Facebook");
            System.out.println("5: Mensaje por TikTok");
            System.out.println("6: salir");
            System.out.println("Seleccione su opcion: ");
            
            opcion= sc.nextInt(); sc.nextLine();
            Mensajes mensaje = MensajeFactory.crearMensaje(opcion);
            
            if (mensaje!=null){
               System.out.println("Ingrese el mensaje a enviar");
            String texto = sc.nextLine(); 
               mensaje.enviarMensaje(texto);
            }else{
                
                System.out.println("No se envio el mensaje");
            }
        }while ( opcion!= 6);
        sc.close();
    }
    }
    

