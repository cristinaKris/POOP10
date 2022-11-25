/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 * Clase para la excepción para cuando se trata de depositar más de veinte mil pesos
 * @author poo01alu19
 */
public class limiteVeinteMilException extends Exception{
    public limiteVeinteMilException() {
        super("No se puede depositar mas de veinteMil pesos");
    }
    
}
