public class Calendario {

   static String[] NOME_MESES = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    static String obterNomeMesmes (int numeroMes){
        if (numeroMes < 1 || numeroMes >12){
            return null;
        }

        return NOME_MESES[numeroMes -1];

    }


}
