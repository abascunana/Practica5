import org.junit.jupiter.api.Test;
/**@author Antoni Xavier Bascuñana Sánchez
 *
 */
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase Calculadora
 */
class CalculadoraTest {


    /**
     * prueba método sumar
     */
    @Test
    void sumar() {
        float valor1 = 3;
        float valor2 = 4;
        float resultado = valor1 + valor2;
        if (resultado != 7){
            fail("resultado inesperado");
        }

    }

    /**
     * prueba método restar
     */
    @Test
   void restar() {
        float valor1 = 3;
        float valor2 = 4;
        float resultado = valor1 - valor2;
        if (resultado != -1){
            fail("resultado inesperado");
        }

    }

    /**
     * prueba método multiplicar
     */
    @Test
    void multiplicar() {
        float valor1 = 3;
        float valor2 = 4;
        float resultado = valor1 * valor2;
        if (resultado != 12){
            fail("resultado inesperado");
        }

    }

    /**
     * prueba método dividir
     */
    @Test
   void dividir() {
        float valor1 = 3;
        float valor2 = 4;
        float resultado = valor1 / valor2;
        if (resultado != 0.75){
            fail("resultado inesperado");
        }

    }
}