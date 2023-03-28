/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpentrega2;
//TP GRUPO 1 ENTREGA 2
//IMPORTAMOS LOS ELEMENTOS PARA DECLARAR ARRAY LISTS
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author GRUPO 1
 */
public class ListaEquipos {
    //Declaro coleccion de Equipos
    //List palabra reservada para crear Listas
    //Equipo.java
    //caracteristicas de Equipo delcarado en Java Class
    private List<Equipo> equipos;
    
    
    //Constructor 1
    public ListaEquipos(List<Equipo> equipos){
    this.equipos = equipos;
    }
    
    //Constructor por defecto
    public ListaEquipos() {
    this.equipos = new ArrayList<Equipo>();
    }

    //Constructor getEquipos
    public List<Equipo> getEquipos() {
        return equipos;
    }

    //Constructor setEquipos
    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    //Metodo para agregar equipos a la lista
    public void addAlumno(Equipo equipo) {
      this.equipos.add(equipo);
    }
    
     //Metodo para remover equipos a la lista
    public void removeEquipo(Equipo equipo) {
       this.equipos.remove(equipo);}

    @Override
    public String toString() {
        return "ListaEquipos{" + "equipos=" + equipos + '}';
    }
    
    //Metodo para recorrer la toda la coleccion de equipos
    public String listarEquipos() {
      String lista = "";
      for (Equipo equipo: equipos) {
                                     lista += "\n" + equipo;
      }
      return lista;
     }

    //Mostrar cantidad de equipos cargados
     public void  cantidadEquipos(){
       int tamanio = equipos.size();
       System.out.println("El número de equipos es de "+tamanio);
       
     }
     
     
}
