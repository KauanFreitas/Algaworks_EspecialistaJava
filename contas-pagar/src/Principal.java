import com.github.KauanFreitas.contaspagar.modelo.Holerite;
import com.github.KauanFreitas.contaspagar.modelo.OrdemServico;
import com.github.KauanFreitas.contaspagar.servico.ServicoContaPagar;
import com.github.KauanFreitas.pagamento.Beneficiario;
import com.github.KauanFreitas.pagamento.DocumentoPagavel;

public class Principal {

    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("João da Silva", "34999998888", "456789");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "10687799000187", "34466");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}
