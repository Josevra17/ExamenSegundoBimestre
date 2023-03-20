/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.newpackage;

/**
 *
 * @author Jose
 */
public class Prueba_Vehiculo {
    public static void main(String []args){
    Vehiculo[] vehi=new Vehiculo[2];
        
   Automovil at = new Automovil(4,4,120);
  Vehiculo tr = new Motocicleta(true,2,300);
   
        
               
                
                vehi [0]=new Automovil(4,4,120);
                vehi [1] = new Motocicleta(false, 2,180);
                
                at.acelerar();
                tr.acelerar();
         
                
              
 
        
        
        
        
    }
}
