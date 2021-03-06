/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.controlador;

import blackjack.modelo.Baraja;
import blackjack.modelo.Crupier;
import blackjack.modelo.Jugador;
import blackjack.modelo.Mano;
import blackjack.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author VESPERTINO
 */
public class BlackJackControlador implements ActionListener {

    private InterfazVista vista;
    private Jugador jugador;
    private Crupier crupier;
    private Baraja baraja;
    private Mano mano;

    public BlackJackControlador(InterfazVista vista, Jugador jugador, Crupier crupier, Baraja baraja, Mano mano) {
        this.vista = vista;
        this.jugador = jugador;
        this.crupier = crupier;
        this.baraja = baraja;
        this.mano = mano;
        vista.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Jugar") {
            jugador.setNombre(vista.pedirNombre());
            jugador.setSaldo(vista.pedirBote());
            jugador.setApuesta(vista.pedirApuesta());
        } else if (e.getActionCommand() == "Plantarse") {
            vista.plantarse();
        } else if (e.getActionCommand() == "SeguirJugando") {
            jugador.setApuesta(vista.pedirApuesta());
        }
    }

}
