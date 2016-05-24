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

    private JLabel jlDineroTotal, jlDineroTotal2, jlDineroApostado, jlDineroApostado2, jlPuntos, jlPuntos2;
    private JButton jbIniciarPartida, jbSalir, jbPedirCarta, jbPlantarse;
    private JPanel jpIzda, jpArriba;

    public VistaSwing() throws HeadlessException {
        jlDineroTotal = new JLabel("Dinero total: ");
        jlDineroTotal2 = new JLabel("");
        jlDineroApostado = new JLabel("Dinero apostado");
        jlDineroApostado2 = new JLabel("");
        jlPuntos = new JLabel("Puntos");
        jlPuntos2 = new JLabel("");

        jbIniciarPartida = new JButton("Iniciar Partida");
        jbPedirCarta = new JButton("Pedir Carta");
        jbPlantarse = new JButton("Plantarse");
        jbSalir = new JButton("Salir");

        jpIzda = new JPanel();
        jpArriba = new JPanel();

        jpIzda.setLayout(new GridLayout(3, 3));
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
       
        setVisible(true);//hacer visible la ventana
        setLocationRelativeTo(null);//para que la ventana salga centrada
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//para terminar proceso al cerrar ventana

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
    public boolean plantarse() {
     return true;
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
    }

}
