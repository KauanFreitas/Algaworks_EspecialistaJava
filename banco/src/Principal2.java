import com.github.KauanFreitas.banco.Conta;
import com.github.KauanFreitas.banco.ContaInvestimento;
import com.github.KauanFreitas.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular ("João da Silva", "12312312300");
        ContaInvestimento conta2 = new ContaInvestimento(titular,1234,999999);


        conta2.imprimirDemonstrativo();

        conta2.depositar(100);
        conta2.imprimirDemonstrativo();

        conta2.creditarRendimento(6);
        conta2.imprimirDemonstrativo();
    }

}
