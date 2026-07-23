package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

import javax.sound.midi.Soundbank;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        Estudante aluno2 = new Estudante();

        aluno.nome = "Sanji";
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);
        System.out.println(aluno.nome);

        System.out.println("----------------------");

        System.out.println(aluno2.idade);
        System.out.println(aluno2.sexo);
        System.out.println(aluno2.nome);
    }
}
