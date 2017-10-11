/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopalabras;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Lourdes
 */
public class Vista extends JFrame{
    private String pregunta;
    private String opcionesRes;
    private String respuestaAcertada;
    private String contadorAciertos;
    
    public Vista(){
        this.setVisible(true);
        this.setBounds(200,200,1200,720);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,1200,720);
        Font font=new Font("Harlow-solid",Font.BOLD,56);
        g.setFont(font);
        g.setColor(Color.BLUE);
        g.drawString("Juego de Preguntas", 380,90);
         //Resultado
        g.setColor(Color.BLACK);
        g.drawString("Pregunta: ",50, 350);
        //Palabra
        g.setColor(Color.BLACK);
        g.drawString(pregunta, 400, 300);
       //respuesta correcta
        g.setColor(Color.BLUE);
        g.drawString(opcionesRes, 400, 350);
        //contador de aciertos
        g.setColor(Color.RED);
        g.drawString(contadorAciertos, 700, 120);
    }
    
    public void setPregunta (String pregunta){
        this.pregunta=pregunta;
    }
    public void setOpciones (String opcionesRes){
        this.opcionesRes=opcionesRes;
    }
    public void setContadorAciertos (String contadorAciertos){
        this.contadorAciertos=contadorAciertos;
    }
}
