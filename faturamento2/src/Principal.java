import com.github.KauanFreitas.fiscal.GestorFiscal;
import com.github.KauanFreitas.fiscal.NotaFiscalServico;
import com.github.KauanFreitas.fiscal.NotalFiscalProduto;

public class Principal {

    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotalFiscalProduto("Bola Futebol",300, 15);
        var nfReparoMotor = new NotaFiscalServico("Reparo Motor",1100, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol,nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());

    }


}
