/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;
import java.util.*;
/**
 *
 * @author User
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Agregar una opcion mas
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int opcion;
        Bebida cafe = new Cafe();
        do{
            System.out.println("CAFETERIA ESPE");
            System.out.println("1: Cafe Simple");
            System.out.println("2: Agregar Azucar");
            System.out.println("3:Agregar Leche");
            System.out.println("4: Agregar Crema de Canela");
            System.out.println("5: Salir");
            System.out.println("Ingrese una opcion");
            opcion= sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                     cafe = new Cafe();
                    System.out.println(cafe.GetDescripcion()+" $"+cafe.getCosto()); break;
                case 2:
                    cafe= new Azucar (cafe);
                      System.out.println(cafe.GetDescripcion()+" $"+cafe.getCosto()); break;
                case 3:
                    cafe = new Leche(cafe);
                      System.out.println(cafe.GetDescripcion()+" $"+cafe.getCosto()); break;
                case 4:
                    cafe = new Crema(cafe);
                      System.out.println(cafe.GetDescripcion()+" $"+cafe.getCosto()); break;
                case 5:break;
                default:
                    System.out.println("no existe esa opcion....");
            }
            
        }while(opcion!=5);
    }
    
}
