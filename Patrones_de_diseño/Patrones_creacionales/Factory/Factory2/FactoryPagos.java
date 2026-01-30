/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;
import java.util.*;
/**
 *
 * @author User
 */
public class FactoryPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc= new Scanner(System.in);
        int opcion;
        do{
            System.out.println("===PAGOS=====");
            System.out.println("1: Pago efectivo");
            System.out.println("2: Pago transferencia");
            System.out.println("3: Pago tarjeta");
            System.out.println("4: Pago PayPal");
            System.out.println("5: pago por BitCoin");
            System.out.println("6: salir");
            System.out.println("Seleccione su opcion: ");
            
            opcion= sc.nextInt(); sc.nextLine();
            Pagos pago = PagosFactory.crearPago(opcion);
            System.out.println("Ingrese el monto a depositar");
            double monto= sc.nextDouble();
            if (pago!=null){
               pago.procesarPago(monto);
            }else{
                System.out.println("No se ha podido realizar el pago");
            }
        }while ( opcion!= 6);
        sc.close();
    }
    }
    

