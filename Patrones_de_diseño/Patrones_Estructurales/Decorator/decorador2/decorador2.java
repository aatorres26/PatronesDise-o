/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador2;
import java.util.*;
/**
 *
 * @author User
 */
public class decorador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int opcion;
        Helado cono = new Cono();
        do{
            System.out.println("HELADERIA");
            System.out.println("1: Helado de cono");
            System.out.println("2: Agregar chispas");
            System.out.println("3:Agregar Leche condensada");
            System.out.println("4: Agregar Helado Extra");
            System.out.println("5: Salir");
            System.out.println("Ingrese una opcion");
            opcion= sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                     cono = new Cono();
                    System.out.println(cono.GetDescripcion()+" $"+cono.getCosto()); break;
                case 2:
                    cono= new Chispas(cono);
                      System.out.println(cono.GetDescripcion()+" $"+cono.getCosto()); break;
                case 3:
                    cono = new LecheCondensada(cono);
                      System.out.println(cono.GetDescripcion()+" $"+cono.getCosto()); break;
                case 4:
                    cono = new ExtraHelado(cono);
                      System.out.println(cono.GetDescripcion()+" $"+cono.getCosto()); break;
                case 5:break;
                default:
                    System.out.println("no existe esa opcion....");
            }
            
        }while(opcion!=5);
    }
    }
    

