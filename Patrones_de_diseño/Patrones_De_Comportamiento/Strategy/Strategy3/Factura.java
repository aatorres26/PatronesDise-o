/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy3;

/**
 *
 * @author User
 */
public class Factura {
   ImpuestoStrategy impuesto;
   
   public void setImpuestoStrategy(ImpuestoStrategy impuesto){
       this.impuesto= impuesto;
   }
   
   public void calcularImpuesto(double monto){
       impuesto.calcularImpuesto(monto);
       
   }
   
   
   
}
