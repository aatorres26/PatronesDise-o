/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer3;
import java.util.*;
/**
 *
 * @author User
 */
public class Observer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int opcion;
        Producto producto = null;
        int n= 0;
        
                do{
            System.out.println("=======NOTIFICACIONES TIENDA======");
            System.out.println("1:Agregar producto y numero de productos");
            System.out.println("2:Agregar a los departamentos de marketing y compras");
            System.out.println("3: notificar el nuevo stock ");
            System.out.println("4: salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt(); sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingres nombre del producto: ");
                    String nproducto = sc.nextLine();
                    System.out.println("Ingrese numero de productos restantes");
                     n= sc.nextInt();
                    producto = new Producto(nproducto,n);
                    break;
                case 2:
                    Departamento departamentoc = new DepartamentoCompras();
                    Departamento departamentom = new DepartamentoMarketing();
                    producto.agregarDepartamento(departamentoc);
                    producto.agregarDepartamento(departamentom);
                     ;break;
                case 3:
                    producto.setStock(n); break;
                case 4: break;
                
                    
            }
        }while(opcion!=4);
    }
    
}
