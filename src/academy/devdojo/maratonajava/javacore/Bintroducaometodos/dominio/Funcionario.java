package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    //public double[] salarios;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario1);
        System.out.println(this.salario2);
        System.out.println(this.salario3);

        //for (double salario: salarios) {
            //System.out.println(salario + ", " );
        //}
    }

    //public void imprimeMediaSalario(){
        //double media = 0;
        //for(double salario: salarios){
            //media += salario;
        //}
        //media /= salarios.length;
        //System.out.println("Média Salarial " +media);
    //}

    public double mediaSalario(){
        return (this.salario1 + this.salario2 + this.salario3)/3;
    }
}
