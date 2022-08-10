public class Principal {

    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        aviaoGol.desativar();
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("Gol (%s): %d assentos disponíves%n",
                aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());
    }
}
