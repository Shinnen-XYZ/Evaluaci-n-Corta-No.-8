/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;
import static org.junit.Assert.*;
import org.junit.Test;
import Estructuras.ListaEnlazadaSimple;

/**
 *
 * @author Jefer
 */
public class ListaEnlazadaSimpleTest {

    @Test
    public void testInsertarInicio() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarInicio(10);

        assertTrue(lista.buscar(10));
    }

    @Test
    public void testInsertarFinal() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarFinal(20);

        assertTrue(lista.buscar(20));
    }

    @Test
    public void testInsertarEnPosicion() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarInicio(1);
        lista.insertarFinal(3);
        lista.insertarEnPosicion(2, 1);

        assertTrue(lista.buscar(2));
    }

    @Test
    public void testEliminar() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarFinal(5);
        lista.eliminar(5);

        assertFalse(lista.buscar(5));
    }

    @Test
    public void testBuscarInexistente() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        assertFalse(lista.buscar(100));
    }
}
