public class Carro {

     String fabricante;
     String modelo;
     String cor;
     int anoFabricacao;
     double precoCompra;
     Pessoa proprietario;

     void imprimirResumoDepreciacao(){
         double valorRevendaMeuCarro = calcularValorRevenda();
         int tempoDeUsoMeuCarro = calcularTempoDeUSoEmAnos();

        if(precoCompra <= 0){
            System.out.println("Carro com preço de compra zerado. " +
                    "Não foi possível imprimir resumo de Depreciação");
            return;
        }

         System.out.printf("Tempo de uso em (anos): %d%n", tempoDeUsoMeuCarro);
         System.out.printf("Valor de revenda: %6.2f%n",valorRevendaMeuCarro);
     }

    double calcularIpva(){
        int tempoDeUsoEmAnos = calcularTempoDeUSoEmAnos();
        if (tempoDeUsoEmAnos >=10){
             return 0;
         }
         return calcularValorRevenda() *0.04;
    }

     int calcularTempoDeUSoEmAnos(){
         return 2022 - anoFabricacao;
     }

     double calcularValorRevenda(){
         int tempoDeUsoEmAnos = calcularTempoDeUSoEmAnos();
         int vidaUltilEmAnos = 20;

          double valorRevenda = (precoCompra / vidaUltilEmAnos)
                  * (vidaUltilEmAnos - tempoDeUsoEmAnos);

          if (valorRevenda < 0){
               valorRevenda = 0;
          }



          return valorRevenda;
     }

}
