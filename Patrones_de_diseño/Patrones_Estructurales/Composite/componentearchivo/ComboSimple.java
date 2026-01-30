/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentearchivo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jepeh
 */
public class ComboSimple implements Componente{
    private String nombre;
    private List <Componente> elementos = new ArrayList<>();

    public ComboSimple(String nombre) {
        this.nombre = nombre;
    }
    public void agregar(Componente ele){
        elementos.add(ele);
    }
    @Override
    public void mostrar() {
        System.out.println("Combo: "+ nombre);
                for (Componente e : elementos){
                   e.mostrar();
                };
                
    }

    @Override
    public double getPrecio() {
        
        double total = 0;
        for (Componente e : elementos){
            total = total + e.getPrecio();
        }
        return total;
    }
    
}
