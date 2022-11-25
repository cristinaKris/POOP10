/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

import java.util.logging.Logger;

/**
 * Clase para la excepción cuando se trata de realizar un retiro pero no hay depositos suficientes
 * @author poo01alu19
 */
public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException() {
        super("Saldo insuficiente");
    }

    
    
    
}
