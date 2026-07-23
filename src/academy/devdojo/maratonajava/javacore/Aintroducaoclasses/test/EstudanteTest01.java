package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.nome = "Emerson";
        aluno1.idade = 33;
        aluno1.sexo = 'M';

        Estudante aluno2 = new Estudante();
        aluno2.nome = "Maia";
        aluno2.idade = 15;
        aluno2.sexo = 'F';

        System.out.println(aluno1.nome + ", " + aluno1.idade + ", " + aluno1.sexo);
    }
}
