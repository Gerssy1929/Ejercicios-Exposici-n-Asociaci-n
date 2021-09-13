
package EjercicioGerman;


public class ImpresiónPelicula {
    
    public static void main(String[] args) {
       
        Pelicula pelicula1 = new Pelicula ();
        
        pelicula1.setTitulo("Batman: El Caballero de la Noche\n");
        
        Actor protagonista1=new Actor();
        
        pelicula1.setProtagonista(protagonista1);
        
        pelicula1.fichapeli();
         
    }
    
}
