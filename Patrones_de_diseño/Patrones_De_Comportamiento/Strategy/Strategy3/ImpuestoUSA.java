/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy3;

/**
 *
 * @author User
 */
public class ImpuestoUSA  implements ImpuestoStrategy {
    @Override
    public void calcularImpuesto(double monto) {
        monto= monto+(monto*0.15);
        System.out.println("Pago con impuestos de USA es "+monto);
    }
}
