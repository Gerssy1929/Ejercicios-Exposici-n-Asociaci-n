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
public class Persona {
    
    private int Cedula;
    private String NomCompleto;
    private Vehiculo Automovil;

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNomCompleto() {
        return NomCompleto;
    }

    public void setNomCompleto(String NomCompleto) {
        this.NomCompleto = NomCompleto;
    }

    public Vehiculo getAutomovil() {
        return Automovil;
    }

    public void setAutomovil(Vehiculo Automovil) {
        this.Automovil = Automovil;
    }
    

    
    public void mostrar(){
        
        System.out.println("Mi Nombre es " + NomCompleto + ""
                + ", Tengo un Carro de Marca " + Automovil.getMarca() + ""
                + ", la Placa es " + Automovil.getPlaca()
                + " Y el Color es " + Automovil.getColor());
      
        System.out.println("Mi Cedula es " + Cedula + "");
    }
    
}
