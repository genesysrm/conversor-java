import ConversorDeMonedas.CalculaConversion;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        CalculaConversion calcular = new CalculaConversion();
        Scanner teclado = new Scanner(System.in);
        int valorUsuario = 100;

        String menuPrincipal = """
                ***************************
                Bienvenidos e bienvenidas a Alura Convert
                                
                Selecciona la opción de conversor que deseas utilizar 
                1. Conversor de Monedas
                2. Conversor de Temperatura
                0. Salir
                *************************** """;
        String menuConversorMonedas = """
                ***************************
                Ahora selecciona el tipo de conversión que deseas realizar:
                1. De Pesos a Dolares
                2. De Pesos a Euros
                3. De Pesos a Libras
                4. De Pesos a Yen
                5. De pesos a Won
                6. De Dolares a Pesos
                7. De Euros a Pesos
                8. De Libras a Pesos
                9. De Yen a Pesos
                10. De Won a Pesos
                0. Salir
                ***************************
                """;
        String menuConversosTemperatura = """
                ***************************
                Ahora selecciona el tipo de conversión que deseas realizar:
                1. De Celcius a Fahrenheit
                2. De Fahrenheit a Celcius
                """;

        while (valorUsuario != 0) {
            System.out.println(menuPrincipal);
            valorUsuario = teclado.nextInt();
            switch (valorUsuario) {
                case 1:
                    System.out.println(menuConversorMonedas);
                    valorUsuario = teclado.nextInt();
                    System.out.println("Introduce el valor que deseas convertir");
                    double valorConversion = teclado.nextInt();
                    calcular.hacerConversion(valorConversion, valorUsuario);
                    break;
                case 2:
                    System.out.println(menuConversosTemperatura);
                    valorUsuario = teclado.nextInt();
                    break;
                case 0:
                    System.out.println("Gracias por usar Alura Convert, hasta la próxima");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }

        }

    }
}
