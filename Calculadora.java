/**@author Antoni Xavier Bascuñana Sánchez
 *
 */

public class Calculadora implements ICalculadora {
    /**
     * Método que suma dos valores y devuelve el resultado obtenido
     * @param valor1
     * @param valor2
     * @return
     */
    @Override
    public float sumar(float valor1, float valor2) {
        float resultado = valor1 + valor2;
        return resultado;
    }

    /**
     * Método que resta dos valores y devuelve el resultado obtenido
     * @param valor1
     * @param valor2
     * @return
     */
    @Override
    public float restar(float valor1, float valor2) {
        float resultado = valor1 - valor2;
        return resultado;
    }

    /**
     * Método que multiplica dos valores y devuelve el resultado obtenido
     * @param valor1
     * @param valor2
     * @return
     */
    @Override
    public float multiplicar(float valor1, float valor2) {
        float resultado = valor1 * valor2;
        return resultado;

    }

    /**
     *
     * @param valor1
     * @param valor2
     * @return
     */
    @Override
    public float dividir(float valor1, float valor2) {
        float resultado = valor1 / valor2;
        return resultado;
    }
}
