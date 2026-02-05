/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Producto {
    private String nombre;
    private int stock;
    private List<Departamento> departamentos = new ArrayList<>();

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void setStock(int nuevoStock) {
        this.stock = nuevoStock;
            notificar();
        }
    

    private void notificar() {
        for (Departamento departamento : departamentos) {
            departamento.actualizar(nombre, stock);
        }
    }
}

