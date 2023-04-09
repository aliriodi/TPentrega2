/*
 Para entrega 2
 */
package tpentrega2;


public class TP {

    public static PronosticoDeportivo PRODE;
    public static ListaEquipos LISTAEQUIPOS; 
    public static ListaParticipantes PRODE3;
    public static ListaPronosticos PRODE4;
    
    public static void main(String[] args) {
        System.out.println ("Sistema de simulación de pronósticos deportivos.");
        System.out.println ("Ejecutándose desde:"+System.getProperty("user.dir"));
        
        PRODE = new PronosticoDeportivo();
       LISTAEQUIPOS = new ListaEquipos();
        PRODE3 = new ListaParticipantes();
        PRODE4 = new ListaPronosticos();
        
        System.out.println ("cargando ARCHIVO Lista Equipos");
        LISTAEQUIPOS.cargarDeArchivo();
        System.out.println ("Mostranbdo Lista");
        System.out.println(LISTAEQUIPOS.listar());
        
        System.out.println ("Mostranbdo Equipo 18");
        System.out.println(LISTAEQUIPOS.getEquipo(17).getNombre());
        
        System.out.println ("cargando ARCHIVO Lista Participantes");
        PRODE3.cargarDeArchivo();
     //    System.out.println ("Mostranbdo Lista Participantes");
     //   System.out.println(PRODE3.listar());
        
     //   System.out.println ("cargando ARCHIVO Lista Participantes");
     //   PRODE4.cargarDeArchivo();
     //    System.out.println ("Mostranbdo Lista Participantes");
     //   System.out.println(PRODE4.listar());
        
        
        PRODE.play();
    }
    
}
