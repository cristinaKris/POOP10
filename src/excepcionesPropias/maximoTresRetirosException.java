/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 * Clase para la excepción para cuando se trata de realizar más de tres retiros
 * @author poo01alu19
 */
public class maximoTresRetirosException extends Exception{

    public maximoTresRetirosException() {
        super("No se puede hacer mas de tres retiros");
    }
    
}
