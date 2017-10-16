
package juegopalabras;

import java.util.Scanner;

/**
 *
 * @author Lourdes
 */
public class Modelo {
    Scanner t=new Scanner(System.in);
    private boolean respondido;
    private int numPreg;
    private int contador;
    char[] correctas={'a' ,'c','b','b' ,'b' ,'c','c','a','b'};
    String [] preguntas={"¿Qué es un Yate?"
                        ,"¿Cuál de estas marcas es Alemana?"
                        ,"¿Cuantos niveles OSI hay?"
                        ,"¿Cual es el nombre de la mascota de Mickey Mouse?"
                        ,"¿De que color es el Cielo"
                        ,"¿Que es Ibiza?"
                        ,"¿Como se llama un grupo de lobos?"
                        ,"¿Cual es el río más largo del mundo?"
                        ,"¿Steven Tyler es el cantante de que famoso banda?"};
    
    String [] respuesta1={"A) Una Embarcación"
                         ,"A) Lamborghini"
                         ,"A) Cinco"
                         ,"A) Goofy"
                         ,"A) Rojo"
                         ,"A) Un Continente"
                         ,"A) Rebaño"
                        ,"A) Amazonas"
                        ,"A) Bon Jovi"};
    
     String [] respuesta2={"B) Un Coche"
                            ,"B) Koenigssegg"
                            ,"B) Siete"
                            ,"B) Pluto"
                            ,"B) Azul"
                            ,"B) Un Itsmo"
                            ,"B) Camada"
                            ,"B) Nilo"
                            ,"B) Aerosmith"};
     
      String [] respuesta3={"C) Un Avión"
                            ,"C) Porsche"
                            ,"C) Dos"
                            ,"C) Donald"
                            ,"C) Cyan"
                            ,"C) Una Isla"
                            ,"C) Manada"
                            ,"C) Mississippi"
                            ,"C) The Rolling Stone"};
    public String darPregunta(){ //Metodo para seleccioar la una de las preguntas aletatoriamente
        int i;
          
        for(i=0;i<preguntas.length;i++){
            numPreg=(int)Math.floor(Math.random()*preguntas.length);
        }
        return preguntas[numPreg]; //PARA CONTINUAR MAÑANA POR AQUI CON LA IDEA DE RETORNAR EL INDICE ENTERO
    }
    public String ponerRespuesta1(){ //REPRESENTAR LAS RESPUESTAS ALEATORIAS CON LA A)
        return respuesta1[numPreg];  
    }
      
    public String ponerRespuesta2(){//REPRESENTAR LAS RESPUESTAS ALEATORIAS CON LA B)
        return respuesta2[numPreg];
    }
      
    public String ponerRespuesta3(){//REPRESENTAR LAS RESPUESTAS ALEATORIAS CON LA C)
        return respuesta3[numPreg];
    }
    public String opcionElegida(char letraPulsada) {
        if (letraPulsada == correctas[numPreg]) {
            switch (correctas[numPreg]) {
                case 'a':
                    contador++;
                    return "opcionA";

                case 'b':
                    contador++;
                    return "opcionB";

                case 'c':
                    contador++;
                    return "opcionC";
            }
        }
        return "opcionIncorrecta";
    }
    public String getContador(){
        if(contador<5){
            return contador+"";
        }
        else{
            contador=0;
            return "FIN";
        }
    }
    
    
    
    public void setRespondido(boolean respondido) {
        this.respondido = respondido;
    }
    public boolean isRespondido() {
        return respondido;
    }
    
}

