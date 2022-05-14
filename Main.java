import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner teclat = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

        System.out.println("Introduce los valores con los que quieras operar");
        int valor1 = teclat.nextInt();
       int valor2 = teclat.nextInt();
        System.out.println("¿Qué quieres hacer?");
        System.out.println(
                "1. Sumar.\r\n"
                        + "2. Restar\r\n"
                        + "3. Multiplicar.\r\n"
                        + "4. Dividir\r\n"
        );
        int eleccion = teclat.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println( calculadora.sumar(valor1,valor2));

                break;
            case 2:
                System.out.println(calculadora.restar(valor1,valor2));
                break;
            case 3:
                System.out.println(calculadora.multiplicar(valor1,valor2));
                break;
            case 4:
                System.out.println(calculadora.dividir(valor1,valor2));
                break;

        }
    }
}
