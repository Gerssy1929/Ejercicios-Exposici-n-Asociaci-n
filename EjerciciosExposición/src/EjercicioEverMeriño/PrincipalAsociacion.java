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
public class PrincipalAsociacion {
    public static void main (String[] args ){
        boolean continuar = true ;
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        OperacionesPersonasAutomovil operaciones = new OperacionesPersonasAutomovil();
       
        
        do{
            System.out.println("MENU");
            System.out.println("1. Crear persona");
            System.out.println("2. Mostrar Persona");
            System.out.println("3. Crear Automovil");
            System.out.println("4. Mostrar Automovil");
            System.out.println("5. Asignacion Automovil  ");
            System.out.println("6. Salir");
            System.out.println(" Digite una opcion");
            opc=leer.nextInt();
            switch(opc){
                
                case 1:
                    operaciones.crearPersona();
                    break;
                case 2:
                    operaciones.mostrarPerosna();
                    break;
                case 3:
                    operaciones.crearAutomovil();
                    break;    
                case 4:
                    operaciones.mostrarAutomovil();
                    break;
                case 5:
                    operaciones.asignarAutomovilperosna();
                    break;    
                 default:
                     continuar = false;
            }
                    
        }while(continuar);
        
    }
    
}
