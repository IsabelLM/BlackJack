/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.modelo;

/**
 *
 * @author VESPERTINO
 */
public class Jugador extends Persona {

    private float saldo;
    private float apuesta;

    public Jugador(String nombre) {
        super(nombre);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getApuesta() {
        return apuesta;
    }

    public void setApuesta(float apuesta) {
        this.apuesta = apuesta;
    }
}
