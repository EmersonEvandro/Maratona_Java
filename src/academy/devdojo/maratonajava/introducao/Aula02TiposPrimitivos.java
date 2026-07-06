package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long e boolean
        int idade = 33;
        long numeroGrande = (int) 10000000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String frase = "Não tem limite de valores dentro da classe Strings";
        var nome2 = "Vegeta";//isso e apartir do java 10

        System.out.println("A idade é " +idade+ " anos");
        System.out.println(verdadeiro);
        System.out.println(frase + ", essa e classe");
    }
}
