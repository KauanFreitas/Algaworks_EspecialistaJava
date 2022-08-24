import java.util.Objects;

public class Televisor {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.printf("Canal alterado para %d%n ", canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        Objects.requireNonNull(novoVolume, "Novo volume deve ser informado");

        if (novoVolume.equals(volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = novoVolume;
            System.out.printf("Volume alterado para %d%n", volume);
        }
    }

}

