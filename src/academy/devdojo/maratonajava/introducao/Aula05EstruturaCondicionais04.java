package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {
        //Calculo de taxa
        // 0 - 34,712 - 9,70%
        //34,713 - 68,507 - 37,35%
        //68,508 - 49,50

        double salario = 70000;
        double taxa;

        if (salario <= 34712) {
            taxa = salario * 0.97;
        } else if (salario >= 34713 && salario <= 68507){
            taxa = salario * 0.3735;
        } else {
            taxa = salario * 0.4950;
        }
        System.out.println(taxa);

        /*resolução
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 9.70 / 100;
        double terceiraFaixa = 9.70 / 100;
        double = valorImposto;
        * if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
        * */


    }
}
