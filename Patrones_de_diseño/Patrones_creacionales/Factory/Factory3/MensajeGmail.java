/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory3;

/**
 *
 * @author User
 */
public class MensajeGmail implements Mensajes{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("se enviara el siguiente mensaje mediante Gmail:\n"+ mensaje);
    }
    
}
