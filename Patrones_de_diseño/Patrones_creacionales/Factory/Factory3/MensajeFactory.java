/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory3;

/**
 *
 * @author User
 */
public class MensajeFactory {
     public static Mensajes crearMensaje(int tipo){
       switch (tipo){
           case 1: return new MensajeGmail();
           case 2: return new MensajeInstagram();
           case 3 : return new MensajeSMS();
           case 4: return new MensajeFacebook();
           case 5:return new MensajeTikTok();
           case 6: System.out.println("saliendo...");
           return null;
           default: System.out.println("MENSAJE NO DISPONIBLE");
           
       } 
       return null;
    }
}
