package p10Exception;

/**
 * Creando una excepcion de Clase SaldoException que hereda Exception
 * Con un contructor vacio
 * @author daniel y carlos
 * @version 1
 */
public class SaldoExcepcion extends Exception{

    public SaldoExcepcion() {
        super("No tiene saldo mi chavorruco");
    }
}
