/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.newpackage;

/**
 *
 * @author Jose
 */
public abstract class Vehiculo  {
                 int  numRuedas;
	int velocidadMaxima;

    public  Vehiculo(int numRuedas, int velocidadMaxima) {
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }
        
	

 abstract void acelerar();


    
}
