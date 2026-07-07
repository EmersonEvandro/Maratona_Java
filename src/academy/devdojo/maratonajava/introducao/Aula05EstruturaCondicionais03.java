package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {

        //Operador Ternário
        double salario = 4000;
        double valor = 5000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //                 (Condição)      ? verdadeiro   : Falso
        String resultado = salario > valor ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
