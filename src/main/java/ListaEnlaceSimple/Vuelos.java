/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlaceSimple;

/**
 *
 * @author HP
 */
public class Vuelos {
    NodoVuelos inicio;
    
    public Vuelos(){
        this.inicio = null;
        }
    
    public int CuentaElementos(){
        int acc = 0;
        NodoVuelos recorre = inicio; 
        while (recorre != null) {
            acc += 1;
            recorre = recorre.getSiguiente();
            } 
        return acc;
        }
    
    public void InsertaInicio(Object dato){
        NodoVuelos n = new NodoVuelos(dato);//crea el nodo apuntado por el puntero n
        n.setSiguiente(inicio); //el enlace del nodo apuntado por n apunta al puntero inicio
        inicio = n; 
        }

    public void InsertaFin(Object dato){
        NodoVuelos n = new NodoVuelos(dato);//crea el nodo apuntado por el puntero n
        //revisamos si la lista esta vacia.de estarlo apuntamos inicio al nodo apuntado por n
        if (inicio == null){
            inicio = n;
            }
        else{
            NodoVuelos recorre = inicio;
            while (recorre.getSiguiente() != null){
                recorre = recorre.getSiguiente();
                }
            recorre.setSiguiente(n);
            }
        }    

        public void insertaPosicion(Object dato, int pos){
            int pos_actual = 0;
            NodoVuelos n = new NodoVuelos(dato);//crea el nodo apuntado por el puntero n
            if (pos > CuentaElementos()){
                System.out.println("La posicion no existe en la lista");
                }
            else{
                if (pos == 0){
                    InsertaInicio(dato);
                    }
                else{
                    NodoVuelos recorre = inicio;
                    while ((recorre.getSiguiente() != null) && (pos_actual < pos-1)){
                        pos_actual++;
                        recorre = recorre.getSiguiente();
                        }
                    n.setSiguiente(recorre.getSiguiente());
                    recorre.setSiguiente(n);
                    }
                }
            }    
    
    public void imprimirLista() {
        NodoVuelos recorre = inicio; 
    
        while (recorre != null) {
            System.out.print(recorre.getDato() + " ");
            recorre = recorre.getSiguiente();
        }
        System.out.println();
    }
    public void EliminarPrimero(){
        inicio = inicio.getSiguiente(); //elimina el primero :v
        
    }
    public void Eliminar(int indice){
        int contador = 0;
        NodoVuelos temp = inicio;
        while(contador < indice - 1){
            temp = temp.getSiguiente();
            contador++;

        }
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
    }
    
    }

    
