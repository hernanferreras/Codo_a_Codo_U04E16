
package u04e16;
import java.util.Scanner;
public class U04E16 {

    public static void main(String[] args) {
       int num, i;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");
       num = entrada.nextInt();
       for (i=1; i<=(10); i++){
           System.out.println(num);
           num=num+1;
       }
    }
}