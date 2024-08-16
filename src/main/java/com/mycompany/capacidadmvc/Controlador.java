/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacidadmvc;

/**
 *
 * @author Ing Jeison
 */
public class Controlador {
    
    Modelo caModelo;
    Vista caVista;

    public Controlador(Modelo caModelo, Vista caVista) {
        this.caModelo = caModelo;
        this.caVista = caVista;
    }
    
    public void realizarOperacion(){
    int sal, salud, cart, result;
    
    sal = caVista.getSalario();
    salud = caVista.getSalud();
    cart = caVista.getCarteras();
    
    result = caModelo.Capacidad(sal, salud, cart);
    caVista.setResultado(result);
        
    }
    
}
