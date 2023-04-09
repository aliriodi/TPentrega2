/*
 Para entrega 2
 */
package tpentrega2;

import tpentrega2.PronosticoDeportivo;
import tpentrega2.ListaEquipos;

public class TP {

    public static PronosticoDeportivo PRODE;
    public static ListaEquipos PRODE2; 
    public static ListaParticipantes PRODE3;
   
    public static void main(String[] args) {
        System.out.println ("Sistema de simulación de pronósticos deportivos.");
        System.out.println ("Ejecutándose desde:"+System.getProperty("user.dir"));
        
        PRODE = new PronosticoDeportivo();
        PRODE2 = new ListaEquipos();
        PRODE3 = new ListaParticipantes();
        
        System.out.println ("cargando ARCHIVO Lista Equipos");
        PRODE2.cargarDeArchivo();
        System.out.println ("Mostranbdo Lista");
        System.out.println(PRODE2.listar());
        
        System.out.println ("Mostranbdo Equipo 18");
        System.out.println(PRODE2.getEquipo(17).getNombre());
        
        System.out.println ("cargando ARCHIVO Lista Participantes");
        PRODE3.cargarDeArchivo();
         System.out.println ("Mostranbdo Lista Participantes");
        System.out.println(PRODE3.listar());
        
        //PRODE.play();
    }
    
}
