public class Principal {
    public static void main(String[] args) {
        Participante participante1 = new Participante("João Lima");
        Participante participante2 = new Participante("José Fernades", 10_000);


        System.out.printf("%s tem %d pontos%n", participante1.nome, participante1.saldoDePontos);
        System.out.printf("%s tem %d pontos%n", participante2.nome, participante2.saldoDePontos);
    }
}
