
package juegopalabras;

/**
 *
 * @author Lourdes
 */
public class Modelo {
    Scanner t=new Scanner(System.in);
     int numPreg=0;
    int contador=0;
    
    char[] correctas={'a'
                    ,'c'
                    ,'b'
                    ,'b'
                    ,'b'
                    ,'c'};
    
    String [] preguntas={"Qué es un Yate?"
                        ,"Cuál de estas marcas es Alemana?"
                        ,"Cuantos niveles OSI hay?"
                        ,"Que hora es?"
                        ,"De que color es el Cielo"
                        ,"Que es Ibiza?"};
    
    
    String [] respuesta1={"A) Una Embarcación"
                         ,"A) Lamborghini"
                         ,"A) Cinco"
                         ,"A) La hora de que Mueras"
                         ,"A) Rojo"
                         ,"A) Un Continente"};
    
     String [] respuesta2={"B) Un Coche"
                            ,"B) Koenigssegg"
                            ,"B) Siete"
                            ,"B) La hora de que calles"
                            ,"B) Azul"
                            ,"B) Un Itsmo"};
     
      String [] respuesta3={"C) Una Embarcación"
                            ,"C) Porsche"
                            ,"C) Dos"
                            ,"C) La Hora de Comer"
                            ,"C) Cyan"
                            ,"C) Una Isla"};
      
      
      
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
            return "El juego ha finalizado";
        }
         
        
     }
}
