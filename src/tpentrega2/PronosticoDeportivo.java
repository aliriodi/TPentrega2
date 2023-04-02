/*
Para entrega 2
 */
package tpentrega2;


/**
 *
 * @author aguzman
 */
public class PronosticoDeportivo {
    private ListaEquipos equipos;

    public PronosticoDeportivo() {
        equipos = new ListaEquipos();
    }

    public void play(){
        // cargar y listar los equipos
        equipos.cargarDeArchivo();
        System.out.println("Los equipos cargados son: " + equipos.listar());
        
    }    
}
