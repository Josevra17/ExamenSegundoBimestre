/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.newpackage;

/**
 *
 * @author Jose
 */
public class Automovil extends Vehiculo {
	private int numPuertas;

    public Automovil(int numPuertas, int numRuedas, int velocidadMaxima) {
        super(4, 120);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    

  
    
    
    @Override
	public  void acelerar() {
 System.out.println("Este automovil tiene:"+this.numPuertas+" ruedas, esta acelerando a: " + this.velocidadMaxima+" km/h");
	}
    
    
}
