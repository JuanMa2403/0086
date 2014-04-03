/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class Responder
{
    private ArrayList<String> frases;
    private Random aleatorio;
    private HashMap<HashSet<String>,String> respuestas;
        HashSet<String> conjunto1;
        HashSet<String> conjunto2;
        HashSet<String> conjunto3;
    /**
     * Construct a Responder - nothing to do
     */

    public Responder()
    {
       
        conjunto1=new HashSet<String>();
        conjunto2=new HashSet<String>();
        conjunto3=new HashSet<String>();
        respuestas=new HashMap<HashSet<String>,String>();
        aleatorio=new Random();
        frases= new ArrayList<String>();
        frases.add("La respuesta es 42");
        frases.add("No tengo constancia de eso");
        frases.add("Escribe una carta a Santa");
        frases.add("Colabora con la ORG: Que me den pa un piso");
        frases.add("Dos escarabajos entran en un bar...");
        frases.add("La ultima frase");
        
        conjunto1.add("eres");
        conjunto1.add("tonto");
        
        conjunto2.add("hola");
        conjunto2.add("nombre");
        
        conjunto3.add("puedes");
        conjunto3.add("hablar");
        respuestas.put(conjunto3,"si... pero no quiero");
        respuestas.put(conjunto1,"no puedes herir mi ego");
        respuestas.put(conjunto2,"no tengo nombre, llamame A1fred");
       /** respuestas.put("hola","Hola, ¿Que tal?");
        respuestas.put("eres","Soy un sofware respondon");
        respuestas.put("llamas","no tengo nombre, llamame A1fred");
        respuestas.put("alfred","asi quiero que me llames");
        respuestas.put("tal estas","Si me pinchas no sangro");
        respuestas.put("tonto","no puedes herir mi ego");
        respuestas.put("nombre","A1fred");
        respuestas.put("hablar","si... pero no quiero");
        respuestas.put("por que","No tengo que dar explicaciones");
        */
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> frasesClave)
    {
        String respuesta=null;
         int alAzar=0;  
         
        respuesta=respuestas.get(frasesClave);
        if(respuesta==null){            
            alAzar=aleatorio.nextInt(frases.size());
            respuesta=frases.get(alAzar);
        }      

        return  respuesta;
    }
}

