
package EjercicioLuis;


public class Persona {
    
   private String nombre;
   private Moto Tributo;
   private String Docu;  
   
   public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public Moto getTributo() {
        return Tributo;
    }

    public void setTributo(Moto Tributo) {
        this.Tributo = Tributo;
    }

    public String getDocu() {
        return Docu;
    }

    public void setDocu(String Docu) {
        this.Docu = Docu;
    }

    
   
   public void mostrar(){
       System.out.println("La persona se llama: "+ nombre 
               +"\nSu documento es: "+Docu
               +"\nTiene una moto tipo: "+Tributo.getTipomoto()
               +"\nNumero de llantas: " +Tributo.getLlantas()
               +"\nMarca:"+ Tributo.getMarca()
               +"\n-----------------------------------------" );
   }
}

