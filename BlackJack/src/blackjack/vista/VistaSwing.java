/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack.vista;

import blackjack.controlador.BlackJackControlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author VESPERTINO
 */
public class VistaSwing extends JFrame implements InterfazVista {

    private JLabel jlDineroTotal, jlDineroTotal2, jlDineroApostado, jlDineroApostado2, jlPuntos, jlPuntos2, jlJugador, jlJugador1;
    private JButton jbIniciarPartida, jbSalir, jbPedirCarta, jbPlantarse, jbJugar;
    private JPanel jpIzda, jpArriba;

    public VistaSwing() throws HeadlessException {
        jlJugador = new JLabel("Nombre jugador: ");
        jlJugador1 = new JLabel("");
        jlDineroTotal = new JLabel("Dinero total: ");
        jlDineroTotal2 = new JLabel("");
        jlDineroApostado = new JLabel("Dinero apostado: ");
        jlDineroApostado2 = new JLabel("");
        jlPuntos = new JLabel("Puntos");
        jlPuntos2 = new JLabel("");

        jbIniciarPartida = new JButton("Iniciar Partida");
        jbPedirCarta = new JButton("Pedir Carta");
        jbPlantarse = new JButton("Plantarse");
        jbSalir = new JButton("Salir");
        jbJugar = new JButton("Jugar");

        jpIzda = new JPanel();
        jpArriba = new JPanel();

        jpIzda.setLayout(new BoxLayout(jpIzda, BoxLayout.Y_AXIS));
        jpIzda.add(jlJugador);
        jpIzda.add(jlJugador1);
        jpIzda.add(jlDineroTotal);
        jpIzda.add(jlDineroTotal2);
        jpIzda.add(jlDineroApostado);
        jpIzda.add(jlDineroApostado2);
        jpIzda.add(jlPuntos);
        jpIzda.add(jlPuntos2);

        jpArriba.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jpArriba.add(jbPedirCarta);
        jpArriba.add(jbPlantarse);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jpIzda, BorderLayout.WEST);
        getContentPane().add(jpArriba, BorderLayout.NORTH);

        pack();
        setVisible(true);//hacer visible la ventana
        setLocationRelativeTo(null);//para que la ventana salga centrada
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para terminar proceso al cerrar ventana

    }

    public static void main(String[] args) {
        VistaSwing v = new VistaSwing();
    }

    @Override

    public boolean continuar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean iniciarPartida() {
        return true;
    }

    @Override
    public String pedirNombre() {
        String nombre;
        return nombre = JOptionPane.showInputDialog(this, "¿Cómo te llamas?");
    }

    @Override
    public Float pedirBote() {
        float bote = 0;
        String saldo;
        saldo = JOptionPane.showInputDialog(this, "¿Cuánto dinero tienes?");
        return bote = Float.parseFloat(saldo);
    }

    @Override
    public void plantarse() {

    }

    @Override
    public Float pedirApuesta() {
        float apuesta1 = 0;
        String apuesta;
        apuesta = (JOptionPane.showInputDialog(this, "¿Cuánto quieres apostar?"));
        jlDineroApostado2.setText(apuesta);
        return apuesta1 = Float.parseFloat(apuesta);
    }

    @Override
    public void salir() {

    }

    @Override
    public void pedirCarta() {

    }

    @Override
    public void setControlador(BlackJackControlador objecto) {
        jbPedirCarta.setActionCommand("PedirCarta");
        jbPedirCarta.addActionListener(objecto);
        jbPlantarse.setActionCommand("Plantarse");
        jbPlantarse.addActionListener(objecto);
        jbJugar.setActionCommand("Jugar");
        jbJugar.addActionListener(objecto);
    }

}
