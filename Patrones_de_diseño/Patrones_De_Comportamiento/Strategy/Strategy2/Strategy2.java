/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy2;
import java.util.*;
/**
 *
 * @author User
 */
public class Strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese el monto de la venta: ");
        double monto= sc.nextDouble();
        
        System.out.println("Que desucento obtendra");
        System.out.println("1: Descuento Estudiantl");
        System.out.println("2: Descuento VIP");
        System.out.println("3: Descuento Normal");
        int opcion = sc.nextInt(); sc.nextLine();
        Venta venta = new Venta();
        switch(opcion){
            case 1:
        venta.setDescuento(new DescuentoEstudiantil());
        System.out.println(monto-venta.calcularTotal(monto));
        break;
            case 2:
                venta.setDescuento(new DescuentoVIP());
        System.out.println(monto-venta.calcularTotal(monto));
        break;
            case 3:
                venta.setDescuento(new DescuentoNormal());
        System.out.println(monto-venta.calcularTotal(monto));
        break;
        }
    }
    
}
