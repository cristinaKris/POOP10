/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.limiteVeinteMilException;
import excepcionesPropias.maximoTresRetirosException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu19
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws limiteVeinteMilException, maximoTresRetirosException {
        // TODO code application logic here
        try {
            String mensajes[] = {"Mensaje 1 ", "Mensaje 2", "Mensaje3"};
            for (int i = 0; i <=mensajes.length; i++) {
                System.out.println(mensajes[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: apuntador fuera d elos lìmites");
            //e.printStackTrace();
        }
        
        System.out.println("##########################");
        try {
            float x = 10 / 2;
            System.out.println("X= " + x);
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir entre cero");
        }finally{
            System.out.println("Cualquier cosa que suceda entra a finally");
        }
        System.out.println("·################### Catch Anidado##########");
        try {
            float x = 10 / 0;
            System.out.println("X= " + x);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: apuntador fuera de los lìmites");
            //e.printStackTrace();
        
        }catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir entre cero");
        }
        
        System.out.println("###########Propag);\n" +
"        System.out.println(\"Division = \"+diaciòn de excepciones#############");
        try {
            float division = metodoDivision(4, 0);
            System.out.println("Division = " + division);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion que sucede en el método");
        }
        System.out.println("@@@@@@@@@@@@@@ Excepcion marcada @@@@@@@@@@@@@@@");
        try{
          float div = metodoDivisionMarcada(3,0);
        }catch(ArithmeticException e){
            System.out.println("Excepcion de division entre 0 marcada");
        }
        
        System.out.println("#############Creacion de excepcipnes");
        Cuenta cuenta = new Cuenta();
        System.out.println("\nExcepcion de saldo insuficiente \n");
        try {
            cuenta.depositar(18_000);
            System.out.println("Saldo de cuenta : $"+cuenta.getSaldo());
            cuenta.retirar(10_000,0);
            System.out.println("Saldo de cuenta : $"+cuenta.getSaldo());
            cuenta.retirar(10_000,0);
            System.out.println("Saldo de cuenta : $"+cuenta.getSaldo());
        } catch (SaldoInsuficienteException ex) {
            //Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());//para recuperar el memsaje
        }
        
        System.out.println("\nExcepcion de limite de deposito \n");
        try {
            cuenta.depositar(100_000);
            System.out.println("Saldo de cuenta : $"+cuenta.getSaldo());
            cuenta.retirar(10_000,0);
            System.out.println("Saldo de cuenta : $"+cuenta.getSaldo());
        } catch (SaldoInsuficienteException | limiteVeinteMilException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        ////Excepcion 3 maximo tres retiros
        System.out.println("\nExcepcion 3 limite tres retiros\n");
        int retiros=0;
        try {
            cuenta.depositar(20_000);
            for (int i = 0; i < 4; i++) {
                System.out.println("Saldo de cuenta retiro "+(i+1)+" : "+cuenta.getSaldo());
                retiros+=cuenta.retirar(1_000,retiros);
            }   
            System.out.println("Saldo de cuenta retiro: $"+cuenta.getSaldo());
        } catch (SaldoInsuficienteException | maximoTresRetirosException | limiteVeinteMilException ex) {
            System.out.println(ex.getMessage());
        }
   }
    /**
     * Método que divide dos números
     * @param a numero a dividir
     * @param b numero entre los que se divide
     * @return un numero producto de la división de dos números
     */
    private static float metodoDivision(int a, int b) {
        return a/b;
    }
    /**
     * Método que divide dos números
     * @param a numero a dividir
     * @param b numero entre los que se divide
     * @return un numero producto de la división de dos números
     * @throws ArithmeticException Excepción para cunado se trata de realizar una división entre cero
     */
    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException{ 
        return a/b;
    }
    
}
