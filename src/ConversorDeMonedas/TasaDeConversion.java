package ConversorDeMonedas;

public enum TasaDeConversion {
    DOLAR_A_PESOS(2.75),
    EURO_A_PESOS(2.75),
    LIBRAS_A_PESOS(2.75),
    YEN_A_PESOS(2.75),
    WON_A_PESOS(2.75),
    PESOS_A_DOLAR(2.75),
    PESOS_A_EURO(2.75),
    PESOS_A_LIBRAS(3.45),
    PESOS_A_YEN(5.45),
    PESOS_A_WON(6.45);

    private double valor;

    TasaDeConversion(double descricao) {
        this.valor = descricao;
    }

    public double getValor() {
        return valor;
    }

}
