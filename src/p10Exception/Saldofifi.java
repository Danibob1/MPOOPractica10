
package p10Exception;

/**
 * Creando una excepcion de Clase Saldofifi que hereda Exception
 * Con un contructor vacio
 * @author daniel y carlos
 * @version 1
 */
public class Saldofifi extends Exception {
    
    public Saldofifi(){
        super("Ya tiene un limite maximo de $20,000 ");
    }   
}
