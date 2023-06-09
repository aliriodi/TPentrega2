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
    private ListaPartidos partidos;
    private ListaParticipantes participantes;
    private ListaPronosticos pronosticos; 

    public PronosticoDeportivo() {
        equipos = new ListaEquipos();
        partidos = new ListaPartidos();
        participantes = new ListaParticipantes();
        pronosticos = new ListaPronosticos(); 
    }

    public void play(){
        // cargar y listar los equipos
        equipos.cargarDeArchivo();
        System.out.println("Los equipos cargados son: " + equipos.listar());
 

        partidos.cargarDeArchivo(equipos);
        System.out.println("Los partidos cargados son: " + partidos.listar());

      
        pronosticos.cargarDeArchivo();
        participantes.cargarDeArchivo();
        // Una vez cargados los participantes, para cada uno de ellos
        // cargar sus pronósticos
        for (Participante p : participantes.getParticipantes()) {
            p.cargarPronosticos(pronosticos);
        }
        
        System.out.println("Los participantes cargados son: " + participantes.listar());
           System.out.println( "Nombre               " + "Puntos");
       for(Participante participante : participantes.getParticipantes()) {
        
        System.out.println(  participante.getNombre()+"         "+participante.resultados());

    }

        // agregar y/o modificar el codigo que quieran
        
    }    
}
