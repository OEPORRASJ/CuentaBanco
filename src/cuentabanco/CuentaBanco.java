/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco;

/**
 *
 * @author Estudiante
 */
public class CuentaBanco {
    
    //Atributos
    private int numero;
    private int clave;
    private String duennio;
    private double saldo;
    
    //Constructor
    public CuentaBanco(int numero, int clave, String duennio, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.duennio = duennio;
        this.saldo = saldo;
    }
    
    
    //Getter's and Setter's
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDuennio() {
        return duennio;
    }

    public void setDuennio(String duennio) {
        this.duennio = duennio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public boolean consignar(double valor){
        if (valor > 0) {
            this.saldo=this.saldo + valor;
            return true;
            
        }else{
            return false;
        }
    }
    
    public boolean retirar(double valor){
        if(valor < this.saldo){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    
    
    
    

    
    
}
