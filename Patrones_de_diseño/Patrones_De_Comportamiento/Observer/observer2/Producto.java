/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Producto {
    private String nombre;
    private List<Cliente> clientes = new ArrayList<>();

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    
    public void AgregarCliente (Cliente cliente){
        clientes.add(cliente);
        
        
    }
    public void notificar ( String mensaje){
        for ( Cliente cliente:clientes){
            System.out.println("-"+ cliente.getNombre());
        }
            
    }
    public void mostrarClientesNotificados(){
        System.out.println("Clientes notificados"+nombre+":");
        for(Cliente cliente:clientes){
            System.out.println("-"+ cliente.getNombre());
        }
    }
    
    
}
