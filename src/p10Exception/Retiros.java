
package p10Exception;

/**
 * Creando una excepcion de Clase Retiros que hereda Exception
 * Con un constructor vacio
 * @author daniel y carlos
 * @version 1
 */
public class Retiros extends Exception {
    
    public Retiros(){
         super("Ya son 3, te digo las cosas y sigues de necio");
    }
    
}
