package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Goku";
        funcionario.idade = 33;
        funcionario.salario1 = 1200;
        funcionario.salario2 = 987.32;
        funcionario.salario3 = 2000;

        //funcionario.salario = new double[]{1200, 987.32, 2000}

        funcionario.imprimir();

        double mediaSalario = funcionario.mediaSalario();
        System.out.println("A media salariao do funcionário é " + mediaSalario);
    }
}
