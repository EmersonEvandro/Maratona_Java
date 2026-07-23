package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Chevette";
        carro.modelo = "Chevrolet";
        carro.ano = 1990;

        System.out.println("Carro: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);

        carro1.nome = "Gol";
        carro1.modelo = "Volkswagen";
        carro1.ano = 2010;

        System.out.println("Carro: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
    }
}
