/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;
import java.util.*;
/**
 *
 * @author User
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        Pago pago = new PagoAdapter(new PagoEuro(), new PagoReal(), new PagoPeso());
        System.out.println("Cuanto desea transferir");
        
        double dinero=sc.nextDouble();
        pago.pagar(dinero);
    }
    
}
