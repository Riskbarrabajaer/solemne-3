package ListaEnlaceSimple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class NodoVuelos {
    private Object dato;
    private NodoVuelos siguiente;

    public NodoVuelos(Object dato){
        this.dato = dato;
        this.siguiente = null;
        }
    public Object getDato() {
        return dato;
        }
    public void setDato(Object dato) {
        this.dato = dato;
        }
    public NodoVuelos getSiguiente() {
        return siguiente;
        }
    public void setSiguiente(NodoVuelos siguiente) {
        this.siguiente = siguiente;
        }
    
    }
    

