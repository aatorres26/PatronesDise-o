/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author User
 */
public class CajaRegistradora {
    
    private double totalVentas;
    private double totalFacturas;
    private static CajaRegistradora instancia;

    private  CajaRegistradora() {
        totalFacturas= 0.0;
        totalVentas=0.0;
        System.out.println("Caja registradra  lista");
    }
    
    public static CajaRegistradora getInstancia(){
          if (instancia== null){
            instancia= new CajaRegistradora();
                              
        }
        return instancia;
    }
    
    public void registrarVenta(double monto){
        totalVentas= totalVentas+ monto;
        System.out.println("Venta registrada"+ monto);
    }
    public double getTotalVentas(){
        return totalVentas;
    }
        public void registrarFactura(double monto){
            totalFacturas = totalFacturas + monto;
        System.out.println("Factura registrada"+ monto);
    }
            public double getTotalFacturas(){
        return totalFacturas;
    }
            public double getTotal(){
                return totalFacturas+ totalVentas;
            }
}
