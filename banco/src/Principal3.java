import com.github.KauanFreitas.banco.Conta;
import com.github.KauanFreitas.banco.ContaEspecial;
import com.github.KauanFreitas.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        Titular titular = new Titular ("João da Silva", "12312312300");
        ContaEspecial conta3 = new ContaEspecial(titular,1234,999999,90);
        conta3.setLimiteChequeEspecial(1000);
        
        conta3.imprimirDemonstrativo();

        conta3.depositar(100);
        conta3.imprimirDemonstrativo();

        conta3.sacar(200);
        conta3.imprimirDemonstrativo();

        conta3.debitarTarifaMensal();
        conta3.imprimirDemonstrativo();
    }

}
