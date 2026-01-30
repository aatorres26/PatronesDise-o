/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;
import java.util.*;
/**
 *
 * @author User
 */
public class PagoAdapter implements Pago{
    private PagoEuro pagoEuro;
    private PagoReal pagoReal;
    private PagoPeso pagoPeso;
    Scanner sc = new Scanner (System.in);
    public PagoAdapter(PagoEuro pagoEuro, PagoReal pagoReal, PagoPeso pagoPeso) {
        this.pagoEuro = pagoEuro;
        this.pagoReal = pagoReal;
        this.pagoPeso = pagoPeso;
    }

  

    @Override
    public void pagar(double monto) {
        System.out.println("en que desea pagar");
        System.out.println("1. Euros ");
        System.out.println("2. Reales");
        System.out.println("3. Pesos");
        int opcion =sc.nextInt();
        switch(opcion){
            case 1:
        double euros = monto *0.84;
        pagoEuro.pagarenEuros(euros);
        break;
            case 2:
                double reales = monto *5.14;
                pagoReal.pagarenReal(reales);
                break;
            case 3:
                double pesos= monto *3663;
                pagoPeso.pagarenPeso(pesos);
                break;
            default:
                System.out.println("No existe esa opcion");
    }
    }
    
}
