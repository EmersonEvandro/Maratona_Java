package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 =20;
        int resultado = numero01 + numero02;

        System.out.println("Valor " + resultado);

        //% - Resto da Divisão
        int resto = 20 % 2;
        System.out.println(resto);


        //< > <= >= == != - Sempre retornar valores boleano
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("10 maior que 20 = " + isDezMaiorQueVinte);
        System.out.println("10 menor que 20 = " + isDezMenorQueVinte);
        System.out.println("10 igual a 20 = " + isDezIgualVinte);
        System.out.println("10 igual a 10 = " + isDezIgualDez);
        System.out.println("10 e diferente de 10 = " + isDezDiferenteDez);

        //Operadores Logicos - &&(AND) ||(OR) !(NOT)
        //AND
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQuetrina = idade < 30 && salario >= 3381;

        System.out.println("Estou dentro da lei = " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Estou dentro da lei = " + isDentroDaLeiMenorQuetrina);


        //OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayCinco = 5000F;
        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlayCinco || valorTotalContaPoupanca > valorPlayCinco;
        System.out.println("Podemos comprar o play 5 = " + isPlayCincoCompravel);

        //Operadores de atribuição
        // = += -= *= /= %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; // 1800
        System.out.println(bonus);


        //Incrementador
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);

        //Estruturas condicionais

    }
}
