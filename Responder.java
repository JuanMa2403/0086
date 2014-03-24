/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
import java.util.Random;
import java.util.ArrayList;
public class Responder
{
    private ArrayList<String> frases;
    private Random aleatorio;
    /**
     * Construct a Responder - nothing to do
     */
    
    public Responder()
    {
        aleatorio=new Random();
        frases= new ArrayList<String>();
        frases.add("La respuesta es 42");
        frases.add("No tengo constancia de eso");
        frases.add("Escribe una carta a Santa");
        frases.add("Colabora con la ORG: Que me den pa un piso");
        frases.add("Dos escarabajos entran en un bar...");
        frases.add("La ultima frase");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int alAzar=0;
        alAzar=aleatorio.nextInt(6);
        return frases.get(alAzar);
    }
}

