/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioLuis;

/**
 *
 * @author German
 */
public class Asociar {
     public static void main(String[] args){
    Persona persona1;
    persona1 =new Persona();
    Persona persona2 = new Persona();
    persona1.setnombre("Daniel Jose");
    persona2.setnombre("Jose Rodrigo");
    persona1.setDocu("1003468795");
    persona2.setDocu("1002856436");
    
    Moto moto1 = new Moto();
    Moto moto2 = new Moto();
    moto1.setTipomoto("Acuatica");
    moto1.setMarca("Moex");    
    moto2.setTipomoto("Montaña");
    moto2.setMarca("Loyrz");
    moto2.setLlantas(2);
    persona1.setTributo(moto1);
    persona2.setTributo(moto2); 
    persona1.mostrar();
    persona2.mostrar();
        
    }
}
