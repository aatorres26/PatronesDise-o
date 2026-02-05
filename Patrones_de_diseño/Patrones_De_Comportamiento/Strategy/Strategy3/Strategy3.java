/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy3;
import java.util.*;
/**
 *
 * @author User
 */
public class Strategy3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
        Factura factura= new Factura();
        double monto;
        int opcion;
        do{
        System.out.println("MENU DE PAGO");
        System.out.println("Que impuesto se aplicara");
        System.out.println("1: Impuestos de España");
        System.out.println("2: Impuestos de USA");
        System.out.println("3: Sin impuestos");
        System.out.println("4: salir");
        opcion= sc.nextInt(); sc.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Ingrese el monto");
                 monto = sc.nextDouble();
                factura.setImpuestoStrategy(new ImpuestoEspaña());
                factura.calcularImpuesto(monto);
                break;
            case 2: 
                 System.out.println("Ingrese el monto");
                 monto = sc.nextDouble();
                factura.setImpuestoStrategy(new ImpuestoUSA());
                factura.calcularImpuesto(monto);
                break;
            case 3:
                 System.out.println("Ingrese el monto");
                 monto = sc.nextDouble();
                factura.setImpuestoStrategy(new SinImpuesto());
                factura.calcularImpuesto(monto);
                break;
            case 4: break;
            default: System.out.println("no exuste esa opcion..."); break;
        }
        }while(opcion!=4);
    }
    
    }
    

