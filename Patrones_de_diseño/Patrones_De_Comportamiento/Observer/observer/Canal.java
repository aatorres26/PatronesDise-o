/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;
import java.util.*;
/**
 *
 * @author User
 */
public class Canal {
    private List<Notificaciones> usuarios = new ArrayList<>();
    private List<String> videos = new ArrayList<>();
    
    public void suscribir(Notificaciones noificaciones){
        usuarios.add(noificaciones);
        
    }
    
    public void subir(String titulo){
        System.out.println("Nuevo Video - Chisag Comunica "+ titulo);
        notificar(titulo);
    }
    public void notificar (String mensaje){
        for(Notificaciones notifica: usuarios){
            notifica.actualizar(mensaje);
        }
    }
    
}
