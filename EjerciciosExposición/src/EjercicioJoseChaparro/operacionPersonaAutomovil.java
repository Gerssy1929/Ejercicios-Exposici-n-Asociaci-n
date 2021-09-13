/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioJoseChaparro;

/**
 *
 * @author josec
 */
public class operacionPersonaAutomovil {
    
    //definir objetos tipo persona y tipo automovil
    
    private Persona persona;
    private Vehiculo automovil;
    
    //metodos
    
    //metodo para crear persona
   public void crearPersona(){
       persona = new Persona();
       persona.setNombre("Jose");
       persona.setCedula(12345678);
   }
   
   //metodo para mostrar datos de la persona
   public void mostrarPersona(){
       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("Cedula: " + persona.getCedula());
   }
   
   //metodo para crear automovil
   public void crearAutomovil(){
       automovil = new Vehiculo();
       automovil.setMarca("BMW");
       automovil.setModelo(2010);
       automovil.setPlaca("TWS435");
   }
   
   //metodo para mostrar datos del automovil
   public void mostrarAutomovil(){
       System.out.println("Marca: " + automovil.getMarca());
       System.out.println("Modelo: " + automovil.getModelo());
       System.out.println("Placa: " + automovil.getPlaca());
   }
   
   //asignar la clase persona a la clase automovil
   public void asignarAutomovilPersona(){
       persona.setAutomovil(automovil);
   }
}

