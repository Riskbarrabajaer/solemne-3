/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author HP
 */
public class InfoVuelos{
    private String Destino;
    private String Horario;
    private String Nombre;

    public InfoVuelos(String Destino , String Horario, String Nombre) {
        this.Destino = Destino;
        this.Horario = Horario;
        this.Nombre = Nombre;
    }
    

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    @Override
    public String toString() {
        String s = "" + "\n";
        s = s + "==================================="+ "\n";
        s = s + "Nombre : " + this.getNombre() + "\n";
        s = s + "Horario: " + this.getHorario() + "\n";
        s = s + "Destino: " + this.getDestino() + "\n";
        return s;
    }
    
    
}
