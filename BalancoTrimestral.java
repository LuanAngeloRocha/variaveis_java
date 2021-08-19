public class BalancoTrimestral{
    public static void main (String args[]){

        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        int gastosTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
        int mediaMensal = gastosTrimestre/3;

        System.out.println("O Gasto Trimestral foi de:"+gastosTrimestre+ "reais");
        System.out.println("A media mensal é de:"+mediaMensal+ "reais");

    }
}
