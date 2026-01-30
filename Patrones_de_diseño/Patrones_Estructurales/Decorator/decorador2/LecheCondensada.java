/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador2;

/**
 *
 * @author User
 */
public class LecheCondensada extends HeladoDecorador{

    public LecheCondensada(Helado helado) {
        super(helado);
    }

    @Override
    public String GetDescripcion() {
        return helado.GetDescripcion()+" Leche condensada";
    }

    @Override
    public double getCosto() {
        return helado.getCosto()+0.25;
    }
    
}
