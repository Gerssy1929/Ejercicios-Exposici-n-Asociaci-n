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
public class Vehiculo {
    
    private String marca;
    private int modelo;
    private String placa;
    
    //metodos 
    
    
    //Constructor
    public Vehiculo() {
    }
    
    //Getter y Setter 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}