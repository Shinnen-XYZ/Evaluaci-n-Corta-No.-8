/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Estructuras.ListaEnlazadaSimple;

/**
 *
 * @author Jefer
 */
public class ListaEnlzadaSimpleTest {
    private ListaEnlazadaSimple<Integer> lista;
    
    @Before
    public void Before(){
        lista = new ListaEnlazadaSimple<>();
    }
    @Test
    public void testinsertarFinal(){
        lista.insertarFinal(50);
        lista.insertarFinal(60);
        Assert.assertTrue("El tamanio es de 2",2,lista.getTamanio()); 
    }
    @Test
    public void testinsertarInicio(){
        lista.insertarInicio(30);
        lista.insertarInicio(40);
        Assert.assertTrue("El tamanio es de 2",2,lista.getTamanio()); 
    }
    
}
