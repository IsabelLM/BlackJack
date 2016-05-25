/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import blackjack.controlador.BlackJackControlador;
import blackjack.modelo.*;
import blackjack.vista.VistaSwing;

/**
 *
 * @author VESPERTINO
 */
public class main {

    public static void main(String[] args) {
        VistaSwing vs = new VistaSwing();
    Jugador j = new Jugador(null);
    Crupier c = new Crupier(null);
    Baraja b = new Baraja();
    Mano m = new Mano();

    BlackJackControlador bjc = new BlackJackControlador(vs, j, c, b, m);
    }
}
