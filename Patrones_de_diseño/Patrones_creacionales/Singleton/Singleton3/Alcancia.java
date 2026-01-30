package Singleton3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Alcancia {
    private double padre,madre,hijo,totalAhorros;
    
    private static Alcancia instancia;

    private Alcancia() {
        padre=0.0;
        madre=0.0;
        hijo=0.0;
        totalAhorros=0.0;
        System.out.println("Alcancia familiar lista");
    }
     public static Alcancia getInstancia(){
          if (instancia== null){
            instancia= new Alcancia();
                              
        }
        return instancia;
    }
    public void ahorroPadre (double ahorro){
        padre=padre+ahorro;
        totalAhorros= totalAhorros+ahorro;
        System.out.println("ahorro ingresado: "+ ahorro);
    }
        public void ahorroMadre (double ahorro){
        madre=madre+ahorro;
        totalAhorros= totalAhorros+ahorro;
        System.out.println("ahorro ingresado: "+ ahorro);
    }
            public void ahorroHijo (double ahorro){
        hijo=hijo+ahorro;
        totalAhorros= totalAhorros+ahorro;
        System.out.println("ahorro ingresado: "+ ahorro);
    }
           public double getahorroPadreTotal(){
               return padre;       
           }
           public double getahorroMadreTotal(){
               return madre;       
           }
           public double getahorrohijoTotal(){
               return hijo;       
           }
        public double getahorroTotal(){
            return totalAhorros;
        }
}
