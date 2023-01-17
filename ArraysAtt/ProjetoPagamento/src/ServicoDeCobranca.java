import java.util.Arrays;
import java.util.Objects;

public class ServicoDeCobranca {

    void pagar(Fatura fatura, String emailCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "Informe a fatura");
        Objects.requireNonNull(emailCobranca, "informe e-mail de cobrança");
//        System.out.println(Arrays.toString(emailsAdicionais));

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        enviarNotificacao(fatura, emailCobranca);

        for (String email : emailsAdicionais) {
            enviarNotificacao(fatura,email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email){
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}