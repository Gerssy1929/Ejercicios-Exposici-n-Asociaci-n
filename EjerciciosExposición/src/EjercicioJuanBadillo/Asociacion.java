/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioJuanBadillo;

/**
 *
 * @author JUAN
 */
public class Asociacion {
    public static void main (String[] arg){
        
        Persona persona1 = new Persona();
        persona1.setNomCompleto("Juan Pablo Badillo Hernandez");
        persona1.setCedula(1193200981);
       
        Vehiculo carro = new Vehiculo();
        carro.setMarca("Ferrari");
        carro.setPlaca("CZR-263"); 
        carro.setColor("Rojo"); 
        
        persona1.setAutomovil(carro);
        
        persona1.mostrar();
        
    }
    
}

