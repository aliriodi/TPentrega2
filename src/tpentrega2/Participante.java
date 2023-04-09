/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpentrega2;

/**
 *
 * @author mcasatti
 */
public class Participante {
    private int idParticipante;
    private String nombre;
    private Pronostico[] pronosticos;

    public Participante() {
        
    }
    
    public Participante(int idParticipante, String nombre, Pronostico[] pronosticos) {
        this.idParticipante = idParticipante;
        this.nombre = nombre;
        this.pronosticos = pronosticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public int getIdParticipante() {
        return idParticipante;
    }
     
    public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }

    @Override
    public String toString() {
        return "Participante{" + "idParticipante=" + idParticipante + ", nombre=" + nombre + ", pronosticos=" + pronosticos + '}';
    }
        

}

