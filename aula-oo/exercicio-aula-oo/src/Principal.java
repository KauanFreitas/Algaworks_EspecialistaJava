public class Principal {

    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        dog1.nome = "Zeus";
        dog1.raca = "Pinscher";
        dog1.sexo = 'M';
        dog1.idade = 4;


        Cachorro dog2 = new Cachorro();
        dog2.nome = "Athena";
        dog2.raca = "Pitbull";
        dog2.sexo = 'F';
        dog2.idade = 6;

        System.out.println("Cachorro 1:");
        System.out.println("-----------------------------");
        System.out.printf("Nome: %s%n",dog1.nome);
        System.out.printf("raça: %s%n",dog1.raca);
        System.out.printf("Sexo: %s%n", dog1.sexo);
        System.out.printf("Idade: %d%n",dog1.idade);

        System.out.println();

        System.out.println("Cachorro 2:");
        System.out.println("-----------------------------");
        System.out.printf("Nome: %s%n",dog2.nome);
        System.out.printf("raça: %s%n",dog2.raca);
        System.out.printf("Sexo: %s%n", dog2.sexo);
        System.out.printf("Idade: %d%n",dog2.idade);
    }
}
