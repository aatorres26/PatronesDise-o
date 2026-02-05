/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy3;

/**
 *
 * @author User
 */
public class ImpuestoEspaña implements ImpuestoStrategy {
    @Override
    public void calcularImpuesto(double monto) {
        monto= monto+(monto*0.21);
        System.out.println("Pago con impuestos de España es "+monto);
    }
}
