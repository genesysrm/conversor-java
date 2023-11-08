package ConversorDeMonedas;

public class CalculaConversion {
   TasaDeConversion tasaDeConversion;
   double conversion;

   public double hacerConversion(double valor, int opciones){
       switch(opciones){
           case 1:
               conversion = valor * tasaDeConversion.PESOS_A_DOLAR.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Dolares");
               break;
           case 2:
               conversion = valor * tasaDeConversion.PESOS_A_EURO.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Euros");
               break;
           case 3:
               conversion = valor * tasaDeConversion.PESOS_A_LIBRAS.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Libras");
               break;
           case 4:
               conversion = valor * tasaDeConversion.PESOS_A_YEN.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Yenes");
               break;
           case 5:
               conversion = valor * tasaDeConversion.PESOS_A_WON.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Wons");
               break;
           case 6:
               conversion = valor * tasaDeConversion.DOLAR_A_PESOS.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Pesos");
               break;
           case 7:
               conversion = valor * tasaDeConversion.EURO_A_PESOS.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Pesos");
               break;
           case 8:
               conversion = valor * tasaDeConversion.LIBRAS_A_PESOS.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Pesos");
               break;
           case 9:
               conversion = valor * tasaDeConversion.YEN_A_PESOS.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Pesos");
               break;
           case 10:
               conversion = valor * tasaDeConversion.WON_A_PESOS.getValor();
               conversion = (double) Math.round(conversion *100d)/100;
               System.out.println("El valor de la conversión es: " + conversion + " Pesos");
               break;
           case 0:
               System.out.println("Gracias por usar Alura Convert, hasta la próxima");
               System.exit(0);
           default:System.out.println("Opción inválida");
       }
       return conversion;
   }
}
