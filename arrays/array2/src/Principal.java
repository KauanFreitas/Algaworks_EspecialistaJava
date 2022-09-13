public class Principal {
    public static void main(String[] args) {
        Turma turmab = new Turma();
        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Maria Joana";
        turmab.alunos = new Aluno[3];

        turmab.alunos[0] = new Aluno();
        turmab.alunos[0].nome ="João";
        turmab.alunos[0].idade = 3;


        Aluno aluno1 = new Aluno();
        aluno1.nome ="Laura";
        aluno1.idade = 4;

        turmab.alunos[1] = aluno1;

        turmab.imprimirListaAlunos();


//        for (int i = 0; i < turmab.alunos.length; i++) {
//            Aluno aluno =turmab.alunos[i];
//
//            if (turmab.alunos[i] != null) {
//                System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, aluno.idade);
//            }else {
//                System.out.printf("%d - vago%N", i);
//            }
//        }

    }
}
