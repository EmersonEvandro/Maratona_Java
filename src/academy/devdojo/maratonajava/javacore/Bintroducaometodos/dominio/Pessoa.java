package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    //Private - Significa que o esses atribuitos vão ser acessados pelo classe
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //Criar um metodo para acessar
    public void setNome(String nome){
        this.nome = nome;
        //O atributo nome vai receber o nome que vai ser passado no metodo
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
