
package S06_14;

/**
 *
 * @author Williams
 */
public class MetodosBooleanos {

    public boolean esPositivo(int num) {
        return num > 0;
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public boolean esMayorQue(int num1, int num2) {
        return num1 > num2;
    }

    public boolean sonIguales(int num1, int num2) {
        return num1 == num2;
    }

    public boolean esDivisiblePor(int num, int divisor) {
        return num % divisor == 0;
    }
}