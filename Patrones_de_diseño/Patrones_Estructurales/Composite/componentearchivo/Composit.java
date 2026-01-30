/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentearchivo;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Composit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Comida a1 = new Comida("Papas", 1);
        Comida a2 = new Comida("Cola", 0.75);
        Comida a3 = new Comida("Hamburgesa", 2 );
        System.out.println("=======Binevenido Al sistema de Comisa Rapida=========");
        System.out.println("Seleccione solo un menu");
        System.out.println("1. Papas");
        System.out.println("2. Cola");
        System.out.println("3. Haburgesa");
        System.out.println("=======Comobos =======");
        System.out.println("4. Combo Simple(Papas y Cola)");
        System.out.println("5. Como Completo(Papas , Hamburgesa y Cola)");
        System.out.println("Opcion:");
        int op =sc.nextInt();
        
        switch (op){
        case 1:
       
          a1.mostrar();
        break;
        case 2:
          
          a2.mostrar();
        break;
        case 3:
          
          a3.mostrar();
        break;
        case 4:
        
          ComboSimple cs = new ComboSimple("Combo simple");
          
          cs.agregar(a1);
          cs.agregar(a2);
          cs.mostrar();
          System.out.println("El precio de este como es: "+ cs.getPrecio()+"$");
        break;
         case 5:
        
          ComboCompleto cm = new ComboCompleto ("Combo Completo");
          cm.agregar(a1);
          cm.agregar(a2);
          cm.agregar(a3);
          cm.mostrar();
          System.out.println("El precio de este como es: "+ cm.getPrecio()+"$");
        }
        }
        
       
    }
    

