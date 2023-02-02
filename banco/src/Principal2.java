import com.github.KauanFreitas.banco.Conta;
import com.github.KauanFreitas.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Conta conta2 = new Conta();
        conta2.setTitular(new Titular("João da Silva", "12312312300"));
        conta2.setAgencia(1234);
        conta2.setNumero(999999);
        conta2.setTipo(Conta.INVESTIMENTO);

        conta2.imprimirDemonstrativo();

        conta2.depositar(100);
        conta2.imprimirDemonstrativo();

        conta2.creditarRendimento(6);
        conta2.imprimirDemonstrativo();
    }

}
