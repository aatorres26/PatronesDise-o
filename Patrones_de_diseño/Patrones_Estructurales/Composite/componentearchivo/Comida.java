/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentearchivo;

/**
 *
 * @author jepeh
 */
public class Comida implements Componente{
    private String nombre;
    private double  precio;

    public Comida(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

  
    
    @Override
    public void mostrar() {
        System.out.println("Comida: "+ nombre + "\nPrecio: "+ precio+"$");
    }

    @Override
    public double getPrecio() {
    return precio;
    }
    
    
}
