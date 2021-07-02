package p10Exception;

/**
 * Clase Cuenta
 * Contiene atributos privado y publico
 * Constructor vacio 
 * Dos funciones depositar y retirar
 * Un Getter
 * Una sobrescritura de metodo toString
 * @author daniel y carlos
 * @version 
 */
public class Cuenta {
    
    private double saldo;
    int cont=0;

    public Cuenta() {
        this.saldo = 0;
        this.cont=0;
    }
    
    
    public void depositar(double monto) throws Saldofifi{
        System.out.println("Depositando "+monto);
        if(monto>20000){
            throw new Saldofifi();
        }else{
        saldo+=monto;
        }
    }
    
    public void retirar(double monto) throws SaldoExcepcion, Retiros{
        cont+=1;
        System.out.println("Trantando de Retirar "+monto);
        if(cont>3){
         throw new Retiros();
        }else{
            if(saldo<monto){
             throw new SaldoExcepcion();
            }else{
                 saldo-=monto;
            }
        }
    }

    public double getSaldo() {
        System.out.println("Saldo "+saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return " Cuenta{" + "saldo=" + saldo + '}';
    }
    
}
