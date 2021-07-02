package mpoop10;

/**
 * Ejercio de practica de manejo de errores y excepciones
 * @author daniel y carlos
 * @version 1
 */

public class MPOOP10 {

    public static void main(String[] args) {
  
        String mensajes[]={"primero", "segundo", "tercero"};
        try{
        for (int i = 0; i <=3; i++) {
            System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aioob){
            System.out.println("Error, tu apuntador se salio de rango");
        }
        
        System.out.println("\n");
        
        int a=99, b=0;
        
        try{
               float c= a/b;
               System.out.println("C = "+c);
        }catch(ArrayIndexOutOfBoundsException aioob){ //Sobrecarga
               System.out.println("Error, tu apuntador se salio de rango");
        }catch (ArithmeticException ae){
               System.out.println("Error, no se puede dividir entre 0");
        }finally{
               System.out.println("A pesar de todo, se ejecuta lo de finnally");
        }
        
        System.out.println("\n");
        try{
             int division= miMetod(10,0);
             System.out.println("division= "+ division);
        }catch(ArithmeticException ae){
            System.out.println("Excepcion arimetica");
        }   
        System.out.println("Mi programa quiere moriir");
    }
    
    public static int miMetod(int a, int b)throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
