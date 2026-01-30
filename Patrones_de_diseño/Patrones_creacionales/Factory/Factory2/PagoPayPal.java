/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author User
 */
public class PagoPayPal implements Pagos{

    @Override
    public void procesarPago(double monto) {
                System.out.println("Se paga con PayPal la cantidad de $"+monto);

    }
    
}
