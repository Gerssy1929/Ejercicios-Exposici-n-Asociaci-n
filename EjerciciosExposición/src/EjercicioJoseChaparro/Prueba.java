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
public class Prueba {
    
    public static void main(String[] args) {
        
        //Creacion de objeto tipo operacionPersonaAutomovil para acceder a los metodos de esa clase
        
        operacionPersonaAutomovil operacion = new operacionPersonaAutomovil();
        //crear persona
        operacion.crearPersona();
        //crear vehiculo
        operacion.crearAutomovil();
        //mostrar persona 
        operacion.mostrarPersona();
        //mostrar vehiculo asociado a la persona 
        operacion.mostrarAutomovil();
    }
    
}
