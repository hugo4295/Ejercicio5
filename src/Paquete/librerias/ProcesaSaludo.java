/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete.librerias;

/**
 *
 * @author hugo4295
 */
public class ProcesaSaludo {
    
    String Nombre;

    public ProcesaSaludo(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String Mensaje(){
        return ("Bienvenido " + Nombre + ", Estamos usando librerias");
    }
    
}
