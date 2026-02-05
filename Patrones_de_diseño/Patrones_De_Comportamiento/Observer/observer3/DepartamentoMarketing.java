/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer3;

/**
 *
 * @author User
 */
public class DepartamentoMarketing implements Departamento {
    @Override
    public void actualizar(String nombreProducto, int stock) {
        System.out.println("[MARKETING] Alerta: Pausando campañas publicitarias de " + nombreProducto);
    }
}