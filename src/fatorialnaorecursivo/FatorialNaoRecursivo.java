
package fatorialnaorecursivo;

/**
 *
 * @author Eric Farias
 */

import java.util.Scanner;

public class FatorialNaoRecursivo {

    public static long fatorial(int n){
        long result = n;
        while(n != 1){
            --n;
            result *= n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o número para calcular o fatorial: ");
        int num = input.nextInt();
        System.out.println("O Fatorial é: " + fatorial(num));
    }
    
}
