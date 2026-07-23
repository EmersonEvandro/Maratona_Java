package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        Estudante aluno2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        aluno1.nome = "Midoriya";
        aluno1.idade = 15;
        aluno1.sexo = 'M';

        aluno2.nome = "Sakura";
        aluno2.idade = 16;
        aluno2.sexo = 'F';

        impressora.imprime(aluno1);
        impressora.imprime(aluno2);

    }
}
