public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis(){
        return totalAssentos - assentosReservados;
    }


    void reservarAssentos (int numerAssentos){
        if (ativo){
            assentosReservados += numerAssentos;
        }else {
            // existe uma forma de fazer isso(exceções)
            // mas ainda não estudamos sobre isso
            System.out.println("Aeronave desativada. Assentos não reservados");
        }
    }

    void desativar(){
        ativo = false;
    }

    void ativar(){
        ativo = true;
    }
}
