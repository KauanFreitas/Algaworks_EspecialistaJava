public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Kauan Freitas";
        eu.cpf = "100.000.000-00";
        eu.anoNascimento = 2002;

        Pessoa voce = new Pessoa();
        voce.nome = "Fernando Silva";
        voce.cpf = "2111.111.111-11";
        voce.anoNascimento = 1995;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2022;
        meuCarro.cor = "Preto";
        meuCarro.modelo = "X-6";
        meuCarro.fabricante = "Bmw";
        meuCarro.precoCompra = 0;
        meuCarro.proprietario = eu;


//        meuCarro.proprietario = new Pessoa();
//      meuCarro.proprietario.nome = "Kauan Freitas";
//        meuCarro.proprietario.cpf = "100000000-00";
//        meuCarro.proprietario.anoNascimento = 2002;

       Carro seuCarro = new Carro();
       seuCarro.anoFabricacao = 2021;
       seuCarro.cor = "Branco";
       seuCarro.fabricante =" Honda";
       seuCarro.modelo = "HR-V";
       seuCarro.precoCompra = 120000;
       seuCarro.proprietario = voce;


//       double ipva = meuCarro.calcularIpva();
//        System.out.println(ipva);

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();





//       seuCarro.calcularValorRevenda();

//        System.out.println("Meu carro");
//        System.out.println("------------------------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano fabricação: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Modelo: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("------------------------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano fabricação: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Modelo: %s%n", seuCarro.proprietario.nome);

    }
}
