/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancolombia.bll;

/**
 *
 * @author USUARIO
 */
public class Bancolombia {

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTotal_depositos() {
        return total_depositos;
    }

    public void setTotal_depositos(double total_depositos) {
        this.total_depositos = total_depositos;
    }

    public double getTotal_retiros() {
        return total_retiros;
    }

    public void setTotal_retiros(double total_retiros) {
        this.total_retiros = total_retiros;
    }

    public int getCantidad_depositos() {
        return cantidad_depositos;
    }

    public void setCantidad_depositos(int cantidad_depositos) {
        this.cantidad_depositos = cantidad_depositos;
    }

    public int getCantidad_retiros() {
        return cantidad_retiros;
    }

    public void setCantidad_retiros(int cantidad_retiros) {
        this.cantidad_retiros = cantidad_retiros;
    }

    public double getValor_transaccion() {
        return valor_transaccion;
    }

    public void setValor_transaccion(double valor_transaccion) {
        this.valor_transaccion = valor_transaccion;
    }
    
    String usuario;
    double saldo;
    double total_depositos;
    double total_retiros;
    int cantidad_depositos;
    int cantidad_retiros;
    double valor_transaccion;
    
    
}