public class Calculadora implements ICalculadora {
    @Override
    public float sumar(int valor1, int valor2) {
        float resultado = valor1 + valor2;
        return resultado;
    }

    @Override
    public float restar(int valor1, int valor2) {
        float resultado = valor1 - valor2;
        return resultado;
    }

    @Override
    public float multiplicar(int valor1, int valor2) {
        float resultado = valor1 * valor2;
        return resultado;

    }

    @Override
    public float dividir(int valor1, int valor2) {
        float resultado = valor1 / valor2;
        return resultado;
    }
}
