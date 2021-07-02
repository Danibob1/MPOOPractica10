package p10Exception;

/**
 * Progarma con uso de excepcion y errores
 * Borrar los comentarios para comprobar los errores:
 * Excepcion para hacer maximo 3 retiros
 * Excepcion para hacer depositos mayores de 20,000
 * Excepcion para no permitir retirores menore a 0
 * @version 1
 * @author daniel y carlos
 */

public class Cajero {
    
    public static void main(String[] args) {

        try {
            Cuenta cuenta = new Cuenta(); //objeto cuenta
            cuenta.getSaldo();
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirar(500);
            cuenta.getSaldo();
           
            
            //Excepcion para hacer maximo 3 retiros
            cuenta.retirar(50);
            cuenta.getSaldo();
            cuenta.retirar(50);
            cuenta.getSaldo();
            cuenta.retirar(50);
            cuenta.getSaldo();
           
            
            
            /*Excepcion para hacer depositos mayores de 20,000
            cuenta.depositar(100000);
            cuenta.getSaldo();
            */
            
            
            /* Excepcion para no permitir retiros menores a 0
            cuenta.retirar(1000);
            cuenta.getSaldo();
            */
            
        } catch (Saldofifi ex) {
            System.out.println("Error ya supero el limite de deposito de $20,000");
        } catch (SaldoExcepcion ex) {
            System.out.println("Error,no cuentas con el saldo sufuciente");
        } catch(Retiros ex){
            System.out.println("No se puede realizar ya retiro mas de 3 veces");
            
        }       
    }
    
}
