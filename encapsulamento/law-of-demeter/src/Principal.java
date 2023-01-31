import com.github.KauanFreitas.locacao.GrupoVeiculo;
import com.github.KauanFreitas.locacao.Locacao;
import com.github.KauanFreitas.locacao.Veiculo;
import com.github.KauanFreitas.locacao.servico.ServicoDeLocacao;

public class Principal {
    public static void main(String[] args) {
        GrupoVeiculo grupo = new GrupoVeiculo("SUV", 450);
        Veiculo veiculo = new Veiculo("ALG-9999", grupo);
        Locacao locacao = new Locacao(veiculo, 5);

        ServicoDeLocacao servicoDeLocacao = new ServicoDeLocacao();
        servicoDeLocacao.confirmarLocacao(locacao);
    }
}
