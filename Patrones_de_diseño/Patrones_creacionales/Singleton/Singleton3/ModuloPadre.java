package Singleton3;


import Singleton3.Alcancia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ModuloPadre {
    public void ingreso(double ahorro){
    Alcancia alcancia= Alcancia.getInstancia();
    alcancia.ahorroPadre(ahorro);
    }
}
