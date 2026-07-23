package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        Estudante aluno2 = new Estudante();

        aluno1.nome = "Midoriya";
        aluno1.idade = 15;
        aluno1.sexo = 'M';
        aluno1.imprime();

        aluno2.nome = "Sakura";
        aluno2.idade = 16;
        aluno2.sexo = 'F';
        aluno2.imprime();
    }
}
