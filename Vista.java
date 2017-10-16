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
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String respuestaAcertada;
    private String respuestaErronea;
    private String contadorAciertos="0";
    
    public Vista(){
        this.setVisible(true);
        this.setBounds(200,200,1200,720);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,1200,720);
        Font font=new Font("Harlow-solid",Font.BOLD,30);
        g.setFont(font);
        g.setColor(Color.LIGHT_GRAY);
        g.drawString("Juego de Preguntas", 380,80);
         //Resultado
        g.setColor(Color.BLACK);
        g.drawString("Pregunta: ",20, 220);
        //Palabra
        g.setColor(Color.BLACK);
        g.drawString(pregunta, 20, 280);
       //Opciones de respuesta
        g.setColor(Color.BLUE);
        g.drawString(opcionA, 50, 370);
        g.setColor(Color.BLUE);
        g.drawString(opcionB, 50, 440);
        g.setColor(Color.BLUE);
        g.drawString(opcionC, 50, 500);
        //contador de aciertos
        g.setColor(Color.orange);
        g.drawString("Aciertos: ",800, 120);
        g.setColor(Color.orange);
        g.drawString(contadorAciertos, 1000, 120);
        //Resaltar pregunta acertada o fallada
        if (respuestaAcertada.equals("opcionA")){
            g.setColor(Color.green);
            g.drawString(opcionA, 50, 370);
            g.drawString("¡Respuesta correcta!", 380, 600);
        }
        if (respuestaAcertada.equals("opcionB")){
            g.setColor(Color.green);
            g.drawString(opcionB, 50, 440);
            g.drawString("¡Respuesta correcta!", 380, 600);
        }
        if (respuestaAcertada.equals("opcionC")){
            g.setColor(Color.green);
            g.drawString(opcionC, 50, 500);
            g.drawString("¡Respuesta correcta!", 380, 600);
        }
        if(respuestaErronea.equals("opcionIncorrecta")){
            g.setColor(Color.red);
            g.drawString("Respuesta incorrecta", 380, 600);
            
        }
    }
    
    
    public void setPregunta (String pregunta){
        this.pregunta=pregunta;
    }
    public void setOpcionA (String opcionA){
        this.opcionA=opcionA;
    }
    public void setOpcionB (String opcionB){
        this.opcionB=opcionB;
    }
    public void setOpcionC (String opcionC){
        this.opcionC=opcionC;
    }
    public void setSolucion(String solucion){
        if (solucion.equals("opcionIncorrecta")){
            respuestaErronea=solucion;
        }
        else{
            respuestaAcertada=solucion;
        }
        
    }
   
    public void setContador (String contadorAciertos){
        this.contadorAciertos=contadorAciertos;
    }
}
