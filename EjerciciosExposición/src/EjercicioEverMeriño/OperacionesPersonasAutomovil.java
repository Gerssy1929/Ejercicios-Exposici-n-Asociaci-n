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
public class OperacionesPersonasAutomovil {
    private Persona persona;
    private Automovil automovil;
    Scanner leer = new  Scanner(System.in);
    
    public void crearPersona(){
        persona = new Persona();
        System.out.println("Digite el Nombre Completo");
        persona.setNombreCompleto(leer.nextLine());
        System.out.println("Digite el Numero de cedula");
        persona.setNroCedula(leer.nextInt());
        leer.nextLine();
        System.out.println("Digite lugar de expedicion de la cedula ");
        persona.setExpedido(leer.nextLine());
        System.out.println("Persona Registrada");
        
    }
    
    public void mostrarPerosna(){
        if (persona!=null){
            persona.mostrar();
        }
    }
    public void crearAutomovil(){
        automovil = new Automovil();
        System.err.println("Digite el Numero placa :");
        automovil.setPlaca(leer.nextLine());
        System.out.println("Digite Marca del automovil :" );
        automovil.setMarca(leer.nextLine());
        System.out.println("Digite modelo del automovil :");
        automovil.setModelo(leer.nextInt());
        leer.nextLine();
        System.out.println("Digite color del automovil :");
        automovil.setColor(leer.nextLine());
        System.out.println("Automovil creado");
        
        
        
    }
    
    public void mostrarAutomovil(){
        if(automovil !=null){
            automovil.mostrar();
        }
    }
    public void asignarAutomovilperosna(){
        if(persona!=null && automovil !=null){
        persona.setAutomovil(automovil);
        System.out.println("Asignacion realizada ");
            
            
        }
    }
}

