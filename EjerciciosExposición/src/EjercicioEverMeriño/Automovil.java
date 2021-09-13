/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioEverMeriño;

/**
 *
 * @author Ever Arias
 */
public class Automovil {
    private String placa;
    private String marca;
    private int modelo;
    private String color;
    
    
    public void mostrar (){
        System.out.println("Placa:"+this.placa);
        System.out.println("Marca:"+this.marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("color:"+this.color);
    }

    public Automovil() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

