/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopalabras;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Lourdes
 */
public class ControladorJ implements KeyListener{
    private Vista vista;
    private Modelo modelo;
    char letraPulsada;
    public ControladorJ (Vista vista){
        this.vista=vista;
        vista.addKeyListener(this);
        modelo=new Modelo();
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        letraPulsada=e.getKeyChar();
        if(letraPulsada=='a' || letraPulsada=='b' || letraPulsada=='c'){//Envio letra pulsada
            vista.setSolucion(modelo.opcionElegida(letraPulsada));
            vista.setContador(modelo.getContador());
        }
        vista.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE){ //si quiero salirme al pulsar escape
            System.exit(0);
        }
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            vista.setPregunta(modelo.darPreguntas());
            vista.setOpcionA(modelo.ponerRespuesta1());
            vista.setOpcionB(modelo.ponerRespuesta2());
            vista.setOpcionC(modelo.ponerRespuesta3());
            vista.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
     }
    
}
