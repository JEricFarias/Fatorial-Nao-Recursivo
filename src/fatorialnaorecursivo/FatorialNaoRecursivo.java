
package fatorialnaorecursivo;

/**
 *
 * @author Eric Farias
 */

public class FatorialNaoRecursivo {

    public static long fatorial(int n){
        long result = n;
        while(n != 1){
            --n;
            result *= n;
        }
        return result;
    }
}
