/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador2;

/**
 *
 * @author User
 */
public class Chispas extends HeladoDecorador{

    public Chispas(Helado helado) {
        super(helado);
    }

    @Override
    public String GetDescripcion() {
        return helado.GetDescripcion()+"chispas";
    }

    @Override
    public double getCosto() {
        return helado.getCosto()+0.5;
    }
    
}
