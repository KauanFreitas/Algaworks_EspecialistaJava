public class CadastroPortaria {

    public static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    void cadastrar (Visitante visitante,int tempoExpiracaoEmMeses){
       final int tempoExpiracaoEmDias;
        tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dais%n",
                visitante.nome,tempoExpiracaoEmDias );
    }
}
