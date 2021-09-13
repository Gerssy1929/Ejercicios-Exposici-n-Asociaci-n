
package EjercicioGerman;


public class Pelicula {
    
    private String titulo;
    private String director;
    private int duración;
    private String genero;
    private Actor protagonista;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }
    
    
    
    //Constructor default
    public Pelicula(){
        
        this.director="Christopher Nolan";
        this.duración=152;
        this.genero="Thriller, Acción, Drama";
       
    }
    //Constructor sobrecargado 1
    

    public Pelicula(String director, int duración, String genero) {
        this.director=director;
        this.duración=duración;
        this.genero=genero;
    }

    
    public void fichapeli(){
        
        System.out.println("Título: "+titulo+"Director: "+director+"\nDuración: "+duración+" min"
                +"\nGénero: "+genero+"\nProtagonista: "+protagonista.getNombre());
        System.out.println("--------------------------------");
    }
    
    
          
}


