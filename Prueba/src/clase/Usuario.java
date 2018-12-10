/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Seba
 */
public class Usuario {
    
    private int numerocuenta;
    private String titular;
    private int saldo;
    private int interes;

    public Usuario(int numerocuenta, String titular, int saldo, int interes) {
        this.numerocuenta = numerocuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    
}
