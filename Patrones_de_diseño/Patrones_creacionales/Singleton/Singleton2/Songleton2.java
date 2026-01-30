/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton2;
import java.util.*;
/**
 *
 * @author User
 */
public class Songleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        ModuloVentas ventas = new ModuloVentas();
        ModuloFacturacion facturacion = new ModuloFacturacion();
        
        int op;
        double monto;
        double montof;
        do{
            System.out.println("SISTEMA CAJA REGISTRADORA");
            System.out.println("Opcion 1: Registrar Venta");
            System.out.println("Opcion 2: Registrar Factura");
            System.out.println("Opcion 3: Ver total de ventas");
            System.out.println("Opcion 4: Ver total de ventas ");
            System.out.println("Opcion 5: Salir");
            op= sc.nextInt();sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Ingrese el monto de la venta : ");
                    monto = sc.nextDouble();
                    ventas.vender(monto);
                    facturacion.facturar(monto);
                    break;
                case 2:
                    System.out.println("Total de venta con facturacion: ");
                    montof=sc.nextDouble();
                    facturacion.facturar(montof);
                    break;
                case 3:
                    CajaRegistradora caja = CajaRegistradora.getInstancia();
                    System.out.println("Toral acomulado en la caja: "+caja.getTotalVentas());
                case 4:
                    CajaRegistradora cajaf= CajaRegistradora.getInstancia();
                    System.out.println("Total acumulado en la caja: "+ cajaf.getTotalFacturas());
                    break;
                case 5:
                    CajaRegistradora cajat= CajaRegistradora.getInstancia();
                    System.out.println("total de al caja registrasdora: "+cajat.getTotal());
                default :System.out.println("opcion no valida");
                    
            }
            
            
            
            
        }while (op!=0);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
