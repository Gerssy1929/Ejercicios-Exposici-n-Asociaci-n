/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioEverMeriño;

import java.util.Scanner;

/**
 *
 * @author Ever Arias
 */
public class Persona {
    private int nroCedula;
    private String nombreCompleto;
    private String expedido;
    private Automovil automovil;
    
   Scanner leer = new Scanner(System.in);
    
    
    public void mostrar () {
        System.out.println("Nro. Cedula:"+this.nroCedula);
        System.out.println("Nombre Completo:"+this.nombreCompleto);
        System.out.println("Expedido"+this.expedido);
        
        if(automovil!=null){
            automovil.mostrar();
            
        }
    
}

    public Persona() {
    }

    public int getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(int nroCedula) {
        this.nroCedula = nroCedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getExpedido() {
        return expedido;
    }

    public void setExpedido(String expedido) {
        this.expedido = expedido;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    

}

