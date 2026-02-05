/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategyp;
import java.util.*;
/**
 *
 * @author User
 */
public class StrategyP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        Compra compra= new Compra();
        double monto;
        int opcion;
        do{
        System.out.println("MENU DE PAGO");
        System.out.println("En que opcion desea pagar");
        System.out.println("1: pago con tarjeta");
        System.out.println("2: Pago con PayPal");
        System.out.println("3: Pago con transferencia");
        System.out.println("4: salir");
        opcion= sc.nextInt(); sc.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Ingrese el monto");
                 monto = sc.nextDouble();
                compra.setmetodoPago(new PagoTarjeta());
                compra.realizarPago(monto);
                break;
            case 2: 
                System.out.println("Ingrese el monto");
                 monto = sc.nextDouble();
                compra.setmetodoPago(new PagoPayPal());
                compra.realizarPago(monto);
                break;
            case 3:
                System.out.println("Ingrese el monto");
                 monto = sc.nextDouble();
                compra.setmetodoPago(new PagoTransferencia());
                compra.realizarPago(monto);
                break;
            case 4: break;
            default: System.out.println("no exuste esa opcion..."); break;
        }
        }while(opcion!=4);
    }
    
}
