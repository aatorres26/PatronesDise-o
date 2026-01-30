/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador2;

/**
 *
 * @author User
 */
public abstract  class HeladoDecorador implements Helado{
    protected Helado helado;

    public HeladoDecorador(Helado helado) {
        this.helado = helado;
    }

    
}
