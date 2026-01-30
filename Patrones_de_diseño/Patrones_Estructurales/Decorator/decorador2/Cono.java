/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador2;

/**
 *
 * @author User
 */
public class Cono implements Helado{

    @Override
    public String GetDescripcion() {
        return "Helado simple";
    }

    @Override
    public double getCosto() {
        return 1;
    }
    
}
