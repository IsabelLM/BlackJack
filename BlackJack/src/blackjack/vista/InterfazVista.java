/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.vista;

import blackjack.controlador.BlackJackControlador;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazVista {

    public abstract boolean continuar();

    public abstract boolean iniciarPartida();

    public abstract boolean plantarse();

    public abstract void salir();

    public abstract void pedirCarta();

    public void setControlador(BlackJackControlador objecto);

}
