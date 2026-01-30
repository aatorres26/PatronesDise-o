/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author User
 */
public class Cafe implements Bebida{

    @Override
    public String GetDescripcion() {
        return "Cafe simple";
        }

    @Override
    public double getCosto() {
        return 1;
    }
    
}
