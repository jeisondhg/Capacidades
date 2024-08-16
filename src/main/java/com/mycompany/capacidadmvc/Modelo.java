/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capacidadmvc;

import java.text.DecimalFormat;

/**
 *
 * @author Ing Jeison
 */
public class Modelo {
    DecimalFormat formatea = new DecimalFormat("###,###.##");
    
    public int Capacidad(int sal, int salud, int comp){
        
    int ley1527, conv;
    
    ley1527 = ((sal - salud)/2)- comp;
    
       
    return ley1527;
    }
}
