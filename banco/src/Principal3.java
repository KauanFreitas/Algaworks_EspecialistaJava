import com.github.KauanFreitas.banco.Conta;
import com.github.KauanFreitas.banco.ContaEspecial;
import com.github.KauanFreitas.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        ContaEspecial conta3 = new ContaEspecial();
        conta3.setTitular(new Titular("João da Silva", "12312312300"));
        conta3.setAgencia(1234);
        conta3.setNumero(999999);
        conta3.setLimiteChequeEspecial(1000);
        conta3.setTarifaMensal(90);

        conta3.imprimirDemonstrativo();

        conta3.depositar(100);
        conta3.imprimirDemonstrativo();

        conta3.sacar(200);
        conta3.imprimirDemonstrativo();

        conta3.debitarTarifaMensal();
        conta3.imprimirDemonstrativo();
    }

}
