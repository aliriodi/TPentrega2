
package tpentrega2;

/**
 *
 * @author GRUPO 1
 */
public class Equipo {
    // ATRIBUTOS EQUIPO
    private int idEquipo;
    private  String nombre;
    private  String descripcion;

// METODOS EQUIPO    
    public Equipo (int idEquipo,String nombre, String descripcion){
    this.idEquipo = idEquipo;   
    this.nombre = nombre;
    this.descripcion = descripcion;
    }    
   
  public Equipo() {
    this.idEquipo= 0;
    this.nombre = "";
    this.descripcion="";
  }     
       
  //GET
    public int getIdEquipo() {
        return idEquipo;
    }
    
  public String getNombre() {
    return nombre;
  }
  public String getDescripcion() {
    return descripcion;
  }
  
  //SET
  public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }  
  public void setNombre(String nombre){
      this.nombre = nombre;
  }  
   public void setDescripcion(String descripcion){
      this.descripcion = descripcion;
  }  
   
   /*
   toString EL @Override INDICA QUE SOBREESCRIBIMOS EL METODO 
   toString() el cual lo particularizamos de acuerdo a nuestra
   salida deseada  ...
   */
    @Override
   public String toString(){
   return "Equipo {"+ "nombre: " + nombre +", descripcion: "+descripcion + "}";
   }
}
