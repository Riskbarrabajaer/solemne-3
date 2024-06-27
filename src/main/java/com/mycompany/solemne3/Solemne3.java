/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solemne3;
import ListaEnlaceSimple.*;
import Entidades.InfoVuelos;
/**
 *
 * @author HP
 */
public class Solemne3 {

    public static void main(String[] args) {
        InfoVuelos infovuelos = new InfoVuelos
        (" ","","");
        infovuelos.setDestino("Lisboa");
        infovuelos.setHorario("28/07/2024");
        infovuelos.setNombre("ian brando");
        InfoVuelos infovuelos2 = new InfoVuelos("xd","s","a");
        Vuelos xd = new Vuelos();
        
        xd.insertaPosicion(infovuelos, 0);
        xd.insertaPosicion(infovuelos2, 1);
        xd.imprimirLista();
        
    }
    
}
