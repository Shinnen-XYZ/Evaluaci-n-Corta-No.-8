
package Estructuras;
import Dominio.Nodo;
/**
 *
 * @author Jefer
 */
public class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }
    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
    public void insertarEnPosicion(int valor, int posicion) {
        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {
            insertarInicio(valor);
            return;
        }

        Nodo temp = cabeza;
        for (int i = 0; i < posicion - 1 && temp != null; i++) {
            temp = temp.siguiente;
        }

        if (temp != null) {
            nuevo.siguiente = temp.siguiente;
            temp.siguiente = nuevo;
        }
    }
    public boolean buscar(int valor) {
        Nodo temp = cabeza;

        while (temp != null) {
            if (temp.dato == valor) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    public boolean eliminar(int valor) {
        if (cabeza == null) return false;

        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.dato == valor) {
                anterior.siguiente = actual.siguiente;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }

        return false;
    }
}
