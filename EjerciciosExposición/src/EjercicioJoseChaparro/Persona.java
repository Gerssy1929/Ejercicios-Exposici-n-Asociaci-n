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
public class Persona {
    
    private String nombre;
    private long cedula;
    
    
    //Relacionar las dos clases, la persona tiene el automovil
    private Vehiculo automovil;
    
    
    //constructor

    public Persona() {
    }

    //Getter y Setter 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public Vehiculo getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Vehiculo automovil) {
        this.automovil = automovil;
    }

}
