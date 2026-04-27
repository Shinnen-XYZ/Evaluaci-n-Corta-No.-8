
package Estructuras;
import Dominio.Nodo;
/**
 *
 * @author Jefer
 */
public class ListaEnlazadaSimple<T>{
    private Nodo<T> cabeza;
    private int tamanio;
    
    public ListaEnlazadaSimple(){
        this.cabeza = null;
        this.tamanio = 0;
    }
    public void insertarInicio(T dato){
        Nodo<T> nuevonodo= new Nodo<>(dato);
        nuevonodo.siguiente = cabeza;
        cabeza = nuevonodo;
        tamanio++; 
    }
    public void insertarFinal(T dato){
        Nodo<T> nuevonodo= new Nodo<>(dato);
        if(cabeza == null){
            cabeza = nuevonodo;
        }else{
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevonodo;
        }
        tamanio++;
    }
    public void eliminarInicio(){
        if(cabeza != null){
            cabeza= cabeza.siguiente;
            tamanio--;
        }
    }
    public void imprimir(){
        Nodo<T> actual = cabeza;
        while (actual != null){
            System.out.println(actual.dato + ">");
            actual = actual.siguiente;
        }
        System.out.println("Nulo");
    }
    public int getTamanio(){
        return tamanio;
    }
    public void vaciar(){
        cabeza = null;
        tamanio = 0;
    }
    
}
