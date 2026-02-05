/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy3;

/**
 *
 * @author User
 */
public class SinImpuesto implements ImpuestoStrategy {
    @Override
    public void calcularImpuesto(double monto) {
        System.out.println("Pago sin impuestos"+monto);
    }
}
