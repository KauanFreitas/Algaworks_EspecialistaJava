public class CalcuadoraImposto {
    public static void main(String[] args) {
        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        double taxaImposto;

        if (tipoNotaFiscal == 'S') {
            taxaImposto = 0.16;
        } else {
            taxaImposto = 0.35;
        }

        double valorImposto = totalFaturado * taxaImposto;

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImposto);


    }
}
