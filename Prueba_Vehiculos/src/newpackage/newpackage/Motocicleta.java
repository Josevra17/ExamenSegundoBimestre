/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.newpackage;

/**
 *
 * @author Jose
 */
public class Motocicleta  extends Vehiculo{
	private final Boolean tieneCasco;

    public Motocicleta(Boolean tieneCasco, int numRuedas, int velocidadMaxima) {
       super(2,300);
       this.numRuedas= numRuedas;
       this.velocidadMaxima=velocidadMaxima;
        this.tieneCasco = tieneCasco;
    }



        @Override
	public void acelerar() {
 System.out.println("Esta motocicleta esta acelerando a: " + this.velocidadMaxima+ " km/h");
	}
}
