/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.limiteVeinteMilException;
import excepcionesPropias.maximoTresRetirosException;

/**
 *
 * @author poo01alu19
 */
class Cuenta {
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo para retirar dinero de una cuenta
     * @param monto es la cantidad que se retirará
     * @param numRetiro representá al número de retiros que se han hecho
     * @return un valor de tipo entero, devolvera 1 si se completo el retiro o de lo contrario devolveá 0
     * @throws SaldoInsuficienteException excepción para cuando se trate de retirar más dinero del que se cuenta
     * @throws maximoTresRetirosException excepción por si se quieren realizar más de tre sretiros
     */
    public int retirar (double monto, int numRetiro) throws SaldoInsuficienteException, maximoTresRetirosException {
        int retornar =0;
        if (numRetiro<3){
            System.out.println("Retirando......$"+monto);
            if (saldo<monto) {
                throw new SaldoInsuficienteException(); 
            }else{
                this.saldo -=monto;
                System.out.println("Retiro completado");
                retornar=1;
            }
        }else{
            throw new maximoTresRetirosException(); 
        }        
        return retornar;
    }
    /**
     * Método para depositar dinero en una cuenta
     * @param monto es la cantidad que se depositará
     * @throws limiteVeinteMilException  es la excepción por si se intenta depositar más de veinte mil pesos
     */
    public void depositar(double monto) throws limiteVeinteMilException {
        System.out.println("Depositando.....$"+monto);
        if (monto>20000) {
            throw new limiteVeinteMilException();
        }
        this.saldo+=monto;
    } 
    /**
     * Método para obtener y retornar la cantidad de saldo o dinero en una cuenta
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }
}
