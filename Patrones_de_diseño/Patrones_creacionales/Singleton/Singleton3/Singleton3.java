package Singleton3;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Singleton3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        ModuloPadre mp= new ModuloPadre();
        ModuloMadre mm= new ModuloMadre();
        ModuloHijo mh= new ModuloHijo();
        
         int op;
        double monto;

        do{
            System.out.println("SISTEMA DE AHORRO");
            System.out.println("Opcion 1: Registrar Ahorro padre");
            System.out.println("Opcion 2: Registrar ahorro madre");
            System.out.println("Opcion 3: Tegistrar ahorro hijo");
            System.out.println("Opcion 4: Ver total de ahorros ");
            System.out.println("Opcion 5: Salir");
            op= sc.nextInt();sc.nextLine();
            Alcancia alcancia= Alcancia.getInstancia();
            switch (op){
                case 1:
         System.out.println("Ingrese el monto de ahorro : ");
                    monto = sc.nextDouble();
                    mp.ingreso(monto);
                    System.out.println("Total de ahorros del padre: "+alcancia.getahorroPadreTotal());
                    break;
                case 2:
         System.out.println("Ingrese el monto de ahorro : ");
                    monto = sc.nextDouble();
                    mm.ingreso(monto);
                    System.out.println("Total de ahorros de la madre: "+alcancia.getahorroMadreTotal());
                    break;
                case 3:
                    System.out.println("Ingrese el monto de ahorro : ");
                    monto = sc.nextDouble();
                    mh.ingreso(monto);
                    System.out.println("Total de ahorros del hijo: "+alcancia.getahorrohijoTotal());
                    break;
                case 4:
                    System.out.println("El total de ahorros familiar es "+ alcancia.getahorroTotal());
                case 5:break;
                default: System.out.println("No existe esa opcion...");
            }      
    }while (op!=5);
        }
}
    
