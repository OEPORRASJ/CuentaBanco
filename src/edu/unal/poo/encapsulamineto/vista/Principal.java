/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.encapsulamineto.vista;
import cuentabanco.CuentaBanco;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Principal {
    public static void main(String[] args) {
        
        //Variables nuevas tomadas desde Consola
        //De nombres iguales a los Atributos de CuentaBanco para que el constructor coloque automaticamente los nombres de estos Atributos
        Scanner lectura = new Scanner(System.in);
        System.out.println("Creación de Cuentas");
        System.out.println("Ingrese numero de Cuenta: ");
        int numero = lectura.nextInt();
        
        System.out.println("Ingrese clave: ");
        int clave = lectura.nextInt();
        System.out.println("Ingrese el duennio");
        String duennio = lectura.next();
        
        System.out.println("Ingrese Saldo: ");
        double saldo = lectura.nextDouble();
        
        //Creación de Objetos
        CuentaBanco Cuenta1 = new CuentaBanco(numero, clave, duennio, saldo);
        System.out.println("Valor a Consignar: ");
        double valor = lectura.nextDouble();
        boolean resultado = Cuenta1.consignar(valor);
        if(resultado == true){
            System.out.println("Consignacion Exitosa");
            System.out.println("Nuevo Saldo: "+ Cuenta1.getSaldo());
        } else
            System.out.println("Consignacion Fallida");
    }
}
    
    
    
